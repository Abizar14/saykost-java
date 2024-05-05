package services.boarding_houses;

import net.proteanit.sql.DbUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.boarding_houses.entities.BoardingHouseEntity;
import services.database.Db;
import services.storage.StorageService;

import javax.swing.table.TableModel;
import java.awt.*;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;

public class BoardingHouseService {

	private final static Connection db;

	static {
		try {
			db = Db.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * This method creates a new boarding house entity in the database.
	 *
	 * @param boardingHouseEntity The boarding house entity object containing
	 *                            the details of the new boarding house.
	 * @return A string indicating the result of the creation process.
	 */
	public static @NotNull String create(@NotNull BoardingHouseEntity boardingHouseEntity) {
		try {
			Timestamp createdAt = new Timestamp(System.currentTimeMillis());
			if (boardingHouseEntity.getImage().isBlank() || boardingHouseEntity.getImage() == null) {
				return "Gambar tidak boleh kosong masszee";
			}
			String imageUploaded = StorageService.uploadImage(new File(boardingHouseEntity.getImage()),
					boardingHouseEntity.getName());
			String sql = "INSERT INTO boarding_houses (name, image, size, price, address, description, quantity, category, created_at) VALUES ('" + boardingHouseEntity.getName() + "', '" + imageUploaded + "', '" + boardingHouseEntity.getSize() + "', '"
					+ boardingHouseEntity.getPrice() + "', '" + boardingHouseEntity.getAddress() + "', '" + boardingHouseEntity.getDescription() + "', '" + boardingHouseEntity.getQuantity() + "', '" + boardingHouseEntity.getCategory() + "', '" + createdAt + "');";
			db.createStatement().execute(sql);
			return "Berhasil disimpan mas broooo";
		} catch (SQLException e) {
			System.out.println("Error " + e.getMessage());
			return "Waduh gagal nyimpan mas brooo";
		}
	}

	public static @NotNull String update(@NotNull BoardingHouseEntity boardingHouseEntity, String oldImage) {
		try {
			Timestamp updatedAt = new Timestamp(System.currentTimeMillis());

			if (boardingHouseEntity.getImage().isBlank() || boardingHouseEntity.getImage() == null) {
				return "Gambar tidak boleh kosong masszee";
			}
//			String imageUploaded = Storage.uploadImage(new File(boardingHouseEntity.getImage()),
//					boardingHouseEntity.getName());
			String updatedImage = StorageService.updateImage(new File(boardingHouseEntity.getImage()), oldImage,
					boardingHouseEntity.getName());
			String sql = "UPDATE boarding_houses SET name = ?, image = ?, size = ?, price = ?, address = ?, description = ?, quantity = ?, created_at = ?, category = ? WHERE id = ?";

			PreparedStatement pstmt = db.prepareStatement(sql);
			pstmt.setString(1, boardingHouseEntity.getName());
			pstmt.setString(2, updatedImage);
			pstmt.setString(3, boardingHouseEntity.getSize());
			pstmt.setInt(4, boardingHouseEntity.getPrice());
			pstmt.setString(5, boardingHouseEntity.getAddress());
			pstmt.setString(6, boardingHouseEntity.getDescription());
			pstmt.setInt(7, boardingHouseEntity.getQuantity());
			pstmt.setTimestamp(8, updatedAt);
			pstmt.setString(9, boardingHouseEntity.getCategory());
			pstmt.setInt(10, boardingHouseEntity.getId());

			int success = pstmt.executeUpdate();
			pstmt.close();

			if (success > 0) {
				return "berhasil mengupdate data maseh";
			}
			return "gagal update data";

		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return "Terjadi kesalahan saat memperbarui data";
		}
	}

	public static @NotNull String deleteById(@NotNull BoardingHouseEntity boardingHouseEntity) {
		try {
			StorageService.deleteImage(boardingHouseEntity.getImage());
			String sql = "DELETE FROM boarding_houses WHERE id = ?";
			PreparedStatement pstmt = db.prepareStatement(sql);
			pstmt.setInt(1, boardingHouseEntity.getId());

			int success = pstmt.executeUpdate();
			pstmt.close();
			System.out.println(boardingHouseEntity.getImage());
			if (success > 0) {
				return "berhasil menghapus data";
			} else {
				return "gagal menghapus data";
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return "Terjadi kesalahan saat menghapus data";
		}
	}

	public static @NotNull int countBoardingHouse() {
		try {
			String sql = "SELECT COUNT(*) AS jumlah FROM boarding_houses";
			PreparedStatement ps = db.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			int jumlahData = 0;
			if (rs.next()) {
				jumlahData = rs.getInt("jumlah");
			}

			return jumlahData;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return 0;
	}

	public static @NotNull int countCustomer() {
		try {
			String sql = "SELECT COUNT(*) AS customer FROM users WHERE role = ?";
			PreparedStatement ps = db.prepareStatement(sql);
			ps.setString(1, "customer");
			ResultSet rs = ps.executeQuery();

			int jumlahData = 0;
			if (rs.next()) {
				jumlahData = rs.getInt("customer");
			}

			return jumlahData;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return 0;
	}


	/**
	 * Retrieves data from the database and returns it as a TableModel object.
	 * The data includes information about boarding houses, such as their ID,
	 * name, image, size, price, address, description, number of rooms,
	 * category, and creation date. The data is retrieved from the
	 * 'boarding_houses' table and joined with the 'categories' table using a
	 * left join on the 'category' column. The result is ordered by the creation
	 * date in descending order.
	 *
	 * @return The retrieved data as a TableModel object, or null if an error
	 * occurs.
	 */
	public static @Nullable TableModel getData() {
		try {
			java.sql.Statement stm = db.createStatement();
			java.sql.ResultSet rs = stm.executeQuery("""
					SELECT boarding_houses.id, boarding_houses.name as 'Nama Kos', boarding_houses.image as Gambar, boarding_houses.size as Ukuran, boarding_houses.price as Harga, boarding_houses.address as Alamat, boarding_houses.description as Deskripsi, boarding_houses.quantity as 'Jumlah Kamar', categories.name as Kategori, created_at
					FROM boarding_houses
					LEFT JOIN categories
					\tON boarding_houses.category = categories.id
					ORDER BY `boarding_houses`.`created_at` DESC;""");

			return DbUtils.resultSetToTableModel(rs);
		} catch (SQLException | HeadlessException e) {
			System.out.println("Error" + e.getMessage());
			return null;
		}
	}

	public static @Nullable TableModel getDataKost() {
		try {
			java.sql.Statement stm = db.createStatement();
			java.sql.ResultSet rs = stm.executeQuery("""
					SELECT boarding_houses.name as 'Nama Kos', boarding_houses.size as Ukuran, boarding_houses.price as Harga, boarding_houses.address as Alamat, boarding_houses.description as Deskripsi, boarding_houses.quantity as 'Jumlah Kamar', categories.name as Kategori, created_at as 'Waktu Dibuat'
					FROM boarding_houses
					LEFT JOIN categories
					\tON boarding_houses.category = categories.id
					ORDER BY `boarding_houses`.`created_at` DESC;""");

			return DbUtils.resultSetToTableModel(rs);
		} catch (SQLException | HeadlessException e) {
			System.out.println("Error" + e.getMessage());
			return null;
		}
	}

	public static ArrayList<BoardingHouseEntity> getDataToEntity() {
		ArrayList<BoardingHouseEntity> data = new ArrayList<>();
		try {
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT boarding_houses.id, boarding_houses.name, " +
					"boarding_houses.image, boarding_houses.size, boarding_houses.price," +
					" boarding_houses" +
					".address, " +
					"boarding_houses.description, boarding_houses.quantity, categories" +
					".name as category, " +
					"created_at\n" +
					"FROM boarding_houses\n" +
					"LEFT JOIN categories \n" +
					"\tON boarding_houses.category = categories.id  \n" +
					"WHERE boarding_houses.quantity > 0\n" +
					"ORDER BY `boarding_houses`.`created_at` DESC;");

			while (rs.next()) {
				BoardingHouseEntity kos = new BoardingHouseEntity();
				kos.setId(rs.getInt("id"));
				kos.setName(rs.getString("name"));
				kos.setAddress(rs.getString("address"));
				kos.setCategory(rs.getString("category"));
				kos.setCreatedAt(rs.getString("created_at"));
				kos.setDescription(rs.getString("description"));
				kos.setImage(rs.getString("image"));
				kos.setPrice(rs.getInt("price"));
				kos.setQuantity(rs.getInt("quantity"));
				kos.setSize(rs.getString("size"));
				System.out.println("Kos ID" + kos.getId());
				data.add(kos);

			}
		} catch (Exception e) {
			System.out.println("Error Saat Mengambil Data pada Bourding House Entity" + e.getMessage());
		}
		return data;
	}

	public static void main(String[] args) {

	}
}
