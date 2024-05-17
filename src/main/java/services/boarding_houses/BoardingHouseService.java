package services.boarding_houses;

import client.utils.Utils;
import java.awt.*;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.boarding_houses.entities.BoardingHouseEntity;
import services.database.Db;
import services.storage.StorageService;

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
     * the details of the new boarding house.
     * @return A string indicating the result of the creation process.
     */
    public static @NotNull
    String create(@NotNull BoardingHouseEntity boardingHouseEntity) {
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

    public static @NotNull
    String update(@NotNull BoardingHouseEntity boardingHouseEntity, String oldImage) {
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

    public static @NotNull
    String deleteById(@NotNull BoardingHouseEntity boardingHouseEntity) {
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

    public static @NotNull
    int countBoardingHouse() {
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

    public static @NotNull
    int countCustomer() {
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
    public static @Nullable
    TableModel getData() {
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

    /**
     * Retrieves data from the database and formats it into a TableModel. The
     * data includes information about boarding houses, such as name, size,
     * price, address, description, number of rooms, category, and creation
     * date. The data is retrieved from the boarding_houses and categories
     * tables, with a left join on the category ID. The data is sorted by
     * creation date in descending order.
     *
     * @return a TableModel containing the formatted data, or null if an error
     * occurs
     */
    public static @Nullable
    TableModel getDataKost() {
        try {
            // Create a SQL statement to execute the query
            java.sql.Statement stm = db.createStatement();

            // Execute the query to retrieve the data from the database
            java.sql.ResultSet rs = stm.executeQuery("""
					SELECT boarding_houses.name as 'Nama Kos', boarding_houses.size as Ukuran,
					boarding_houses.price as 'Harga Per Bulan', boarding_houses.address as Alamat,
					boarding_houses.description as Deskripsi, boarding_houses.quantity as 'Jumlah Kamar',
					categories.name as Kategori, created_at as 'Waktu Dibuat'
					FROM boarding_houses
					LEFT JOIN categories
					ON boarding_houses.category = categories.id
					ORDER BY `boarding_houses`.`created_at` DESC;""");

            // Create an ArrayList to store the formatted rows
            ArrayList<Object[]> rows = new ArrayList<>();

            // Iterate through the result set and format the data
            while (rs.next()) {
                // Get the value of the 'Harga Per Bulan' column from the result set
                int hargaPerBulan = rs.getInt("Harga Per Bulan");
                // Format the value as Indonesian currency (Rupiah)
                String hargaPerBulanFormatted = Utils.formatRupiah(hargaPerBulan);

                // Create a new row with the formatted data and add it to the ArrayList
                rows.add(new Object[]{
                    rs.getString("Nama Kos"),
                    rs.getString("Ukuran"),
                    hargaPerBulanFormatted,
                    rs.getString("Alamat"),
                    rs.getString("Deskripsi"),
                    rs.getString("Jumlah Kamar"),
                    rs.getString("Kategori"),
                    rs.getString("Waktu Dibuat")
                });
            }

            // Create a new TableModel with the column names
            String[] columnNames = {"Nama Kost", "Ukuran", "Harga Per Bulan", "Alamat", "Deskripsi", "Jumlah Kamar", "Kategori", "Waktu Dibuat"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            // Add the formatted rows to the TableModel
            for (Object[] row : rows) {
                model.addRow(row);
            }

            return model;
        } catch (SQLException | HeadlessException e) {
            // Print an error message if an exception occurs
            System.out.println("Error" + e.getMessage());
            return null;
        }
    }

    public static @Nullable
    ArrayList<BoardingHouseEntity> getDataToEntity() {
        ArrayList<BoardingHouseEntity> data = new ArrayList<>();
        try {
            Statement stm = db.createStatement();
            ResultSet rs = stm.executeQuery("SELECT boarding_houses.id, boarding_houses.name, "
                    + "boarding_houses.image, boarding_houses.size, boarding_houses.price,"
                    + " boarding_houses"
                    + ".address, "
                    + "boarding_houses.description, boarding_houses.quantity, categories"
                    + ".name as category, "
                    + "created_at\n"
                    + "FROM boarding_houses\n"
                    + " JOIN categories \n"
                    + "\tON boarding_houses.category = categories.id  \n"
                    + "WHERE boarding_houses.quantity > 0\n"
                    + "ORDER BY `boarding_houses`.`created_at` DESC;");

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
            return null;
        }
        return data;
    }

    /**
     * Retrieves data from the database based on a given name and returns it as
     * a TableModel object. The data includes information about boarding houses,
     * such as their name, size, price, address, description, number of rooms,
     * category, and creation date. The data is retrieved from the
     * 'boarding_houses' table and joined with the 'categories' table using a
     * left join on the 'category' column. The result is filtered by the name
     * and ordered by the creation date in descending order.
     *
     * @param name The name to filter the data by.
     * @return The retrieved data as a TableModel object, or null if an error
     * occurs.
     */
    public static @Nullable
    TableModel getDataByNameToTable(String name) {
        try {
            // Create a database statement
            java.sql.Statement stm = db.createStatement();

            // Execute the query to retrieve the data
            java.sql.ResultSet rs = stm.executeQuery(
                    "SELECT boarding_houses.name AS 'Nama Kos', boarding_houses.size AS 'Ukuran', "
                    + "boarding_houses.price AS 'Harga Per Bulan', boarding_houses.address AS 'Alamat', "
                    + "boarding_houses.description AS 'Deskripsi', boarding_houses.quantity AS 'Jumlah Kamar', "
                    + "categories.name AS 'Kategori', boarding_houses.created_at AS 'Waktu Dibuat' "
                    + "FROM boarding_houses "
                    + "LEFT JOIN categories ON boarding_houses.category = categories.id "
                    + "WHERE boarding_houses.name LIKE '%" + name + "%' "
                    + "ORDER BY `boarding_houses`.`created_at` DESC;"
            );

            // Create an ArrayList to store the rows of data
            ArrayList<Object[]> rows = new ArrayList<>();

            // Iterate through the result set
            while (rs.next()) {
                // Get the value of the 'Harga Per Bulan' column
                int hargaPerBulan = rs.getInt("Harga Per Bulan");

                // Format the value of 'Harga Per Bulan' as Indonesian currency
                String hargaPerBulanFormatted = Utils.formatRupiah(hargaPerBulan);

                // Add the formatted row to the ArrayList
                rows.add(new Object[]{
                    rs.getString("Nama Kos"),
                    rs.getString("Ukuran"),
                    hargaPerBulanFormatted,
                    rs.getString("Alamat"),
                    rs.getString("Deskripsi"),
                    rs.getString("Jumlah Kamar"),
                    rs.getString("Kategori"),
                    rs.getString("Waktu Dibuat")
                });
            }

            // Create a new TableModel with the column names
            String[] columnNames = {"Nama Kost", "Ukuran", "Harga Per Bulan", "Alamat", "Deskripsi", "Jumlah Kamar", "Kategori", "Waktu Dibuat"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            // Add the formatted rows to the TableModel
            for (Object[] row : rows) {
                model.addRow(row);
            }

            return model;
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }
    }

    /**
     * Retrieves data from the database based on the provided name.
     *
     * @param name the name to search for in the database
     * @return an ArrayList of BoardingHouseEntity objects containing the
     * retrieved data, or null if an error occurs
     */
    public static @Nullable
    ArrayList<BoardingHouseEntity> getDataByNameEntity(String name) {
        ArrayList<BoardingHouseEntity> data = new ArrayList<>();
        try {
            Statement stm = db.createStatement();
            ResultSet rs = stm.executeQuery("SELECT boarding_houses.id, boarding_houses.name, "
                    + "boarding_houses.image, boarding_houses.size, boarding_houses.price,"
                    + " boarding_houses"
                    + ".address, "
                    + "boarding_houses.description, boarding_houses.quantity, categories"
                    + ".name as category, "
                    + "created_at\n"
                    + "FROM boarding_houses\n"
                    + "LEFT JOIN categories \n"
                    + "\tON boarding_houses.category = categories.id  \n"
                    + "WHERE boarding_houses.name LIKE '%" + name + "%' AND boarding_houses.quantity > 0\n"
                    + "ORDER BY `boarding_houses`.`created_at` DESC;");

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
            return null;
        }
        return data;
    }
}
