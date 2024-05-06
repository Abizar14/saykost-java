package services.transaction;

import client.utils.Utils;
import net.proteanit.sql.DbUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.database.Db;
import services.transaction.entities.TransactionEntity;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.*;
import java.util.ArrayList;

public class TransactionService {

	private final static Connection db;

	static {
		try {
			db = Db.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Creates a new transaction in the database for a given user.
	 *
	 * @param transactionEntity the transaction entity containing the
	 *                          transaction details
	 * @param customerId        the id of the customer
	 * @return a string indicating the success or failure of the transaction
	 * creation
	 */
	public static @NotNull
	String create(@NotNull TransactionEntity transactionEntity, @NotNull int customerId) {
//		try {
//			//TODO: Add validation if username do not have transaction, set quantity in boarding house -1
//                                System.out.println(transactionEntity.getBoardingHouseId());
//                                System.out.println(transactionEntity.getRentalDuration());
//			if (!checkCustomerHaveTransactionInABoardingHouse(customerId, transactionEntity.getBoardingHouseId())) {
//				String sql = "UPDATE boarding_houses SET quantity = quantity - 1 WHERE id = '" + transactionEntity.getBoardingHouseId() + "'";
//				db.createStatement().execute(sql);
//			}
//			Timestamp createdAt = new Timestamp(System.currentTimeMillis());
//			String sql = "INSERT INTO transactions (rental_duration, total_price, created_at, boarding_houses_id, customer_id) " +
//					"VALUES" + "('" + transactionEntity.getRentalDuration() + "', '" + transactionEntity.getTotalPrice() + "', '" + createdAt + "', '" + transactionEntity.getBoardingHouseId() + "', '" + transactionEntity.getCustomerId() + "')";
//			db.createStatement().execute(sql);
//			return "Transaction created successfully";
//		} catch (SQLException e) {
//			System.out.println("Error " + e.getMessage());
//			return "Error " + e.getMessage();
//		}
		try {
			if (!checkCustomerHaveTransactionInABoardingHouse(customerId, transactionEntity.getBoardingHouseId())) {
				String sql = "UPDATE boarding_houses SET quantity = quantity - 1 WHERE id = ?";
				PreparedStatement pstmt = db.prepareStatement(sql);
				pstmt.setInt(1, transactionEntity.getBoardingHouseId());
				pstmt.executeUpdate();
			}
			Timestamp createdAt = new Timestamp(System.currentTimeMillis());
			String sql = "INSERT INTO transactions (rental_duration, total_price, created_at, boarding_houses_id, customer_id) "
					+ "VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = db.prepareStatement(sql);
			pstmt.setInt(1, transactionEntity.getRentalDuration());
			pstmt.setInt(2, transactionEntity.getTotalPrice());
			pstmt.setTimestamp(3, createdAt);
			pstmt.setInt(4, transactionEntity.getBoardingHouseId());
			pstmt.setInt(5, transactionEntity.getCustomerId());
			pstmt.executeUpdate();
			return "Transaction created successfully";
		} catch (SQLException e) {
			System.out.println("Error " + e.getMessage());
			return "Error " + e.getMessage();
		}
	}

	/**
	 * Retrieves transaction data for a specific username with a TableModel.
	 *
	 * @param username the username to retrieve transaction data for
	 * @return the TableModel containing the transaction data, or null if an
	 * error occurs
	 */
	public static @Nullable
	TableModel getTransactionsByUsernameTableModel(String username) {
		try {
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT boarding_houses.name AS 'Nama Kost', boarding_houses.price AS " +
					"'Harga Per Bulan', " +
					"transactions"
					+ ".rental_duration AS 'Lama Sewa', transactions.total_price AS 'Total Harga', transactions" +
					".created_at AS 'Tanggal Transaksi' FROM " +
					"transactions JOIN" +
					" " +
					"boarding_houses ON transactions.boarding_houses_id = boarding_houses.id JOIN users ON transactions.customer_id = users.id WHERE users.username = '" + username + "';");


			ArrayList<Object[]> rows = new ArrayList<>();


			while (rs.next()) {
				int hargaPerBulan = rs.getInt("Harga Per Bulan");
				String hargaPerBulanFormatted = Utils.formatRupiah(hargaPerBulan);

				int totalHarga = rs.getInt("Total Harga");
				String totalHargaFormatted = Utils.formatRupiah(totalHarga);

//				Add the formatted row to the ArrayList
				rows.add(new Object[]{
						rs.getString("Nama Kost"),
						hargaPerBulanFormatted,
						rs.getInt("Lama Sewa"),
						totalHargaFormatted,
						rs.getString("Tanggal Transaksi")
				});
			}

			String[] columnNames = {"Nama Kost", "Harga Per Bulan", "Lama Sewa", "Total Harga", "Tanggal Transaksi"};
			DefaultTableModel model = new DefaultTableModel(columnNames, 0);

//			Add the formatted rows to the TableModel
			for (Object[] row : rows) {
				model.addRow(row);
			}

			return model;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Checks if a given username has any transaction in the database in a
	 * boarding house.
	 * <p>
	 *
	 * @param customerId      the id of the customer to check
	 * @param boardingHouseId the id of the boarding house to check
	 * @return true if the customer has a transaction on the boarding house,
	 * false otherwise
	 */
	private static boolean checkCustomerHaveTransactionInABoardingHouse(int customerId, int boardingHouseId) {
		try {
			Statement stm = db.createStatement();
//			ResultSet rs = stm.executeQuery("SELECT * FROM transactions WHERE customer_id = (SELECT id FROM users WHERE username = '" + username + "');");
//			Checks if a given username has any transaction in the database in a boarding house.
			ResultSet rs = stm.executeQuery("SELECT * FROM transactions WHERE customer_id = '" + customerId + "' AND "
					+ "boarding_houses_id = " + boardingHouseId);

			return rs.next();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static int countTransaction() {
		try {
			String sql = "SELECT COUNT(*) AS jumlah FROM transactions";
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

	/**
	 * Retrieves all transactions data and formats it into a TableModel for display.
	 *
	 * @return the TableModel containing the formatted transaction data, or null if an error occurs
	 */
	public static @Nullable
	TableModel getAllTransactionsTableModel() {
		try {
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT boarding_houses.name AS 'Nama Kost', boarding_houses.price AS 'Harga Per Bulan', " +
					"transactions"
					+ ".rental_duration AS 'Lama Sewa', transactions.total_price AS 'Total Harga', transactions" +
					".created_at AS 'Tanggal Transaksi' FROM " +
					"transactions JOIN" +
					" boarding_houses ON transactions.boarding_houses_id = boarding_houses.id JOIN users ON transactions.customer_id = users.id;");

			ArrayList<Object[]> rows = new ArrayList<>();

			while (rs.next()) {
				int hargaPerBulan = rs.getInt("Harga Per Bulan");
				String hargaPerBulanFormatted = Utils.formatRupiah(hargaPerBulan);

				int totalHarga = rs.getInt("Total Harga");

				String totalHargaFormatted = Utils.formatRupiah(totalHarga);

				// Add the formatted row to the ArrayList
				rows.add(new Object[]{
						rs.getString("Nama Kost"),
						hargaPerBulanFormatted,
						rs.getInt("Lama Sewa"),
						totalHargaFormatted,
						rs.getString("Tanggal Transaksi")
				});
			}

			String[] columnNames = {"Nama Kost", "Harga Per Bulan", "Lama Sewa", "Total Harga", "Tanggal Transaksi"};
			DefaultTableModel model = new DefaultTableModel(columnNames, 0);

			// Add the formatted rows to the TableModel
			for (Object[] row : rows) {
				model.addRow(row);
			}

			return model;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}


	/**
	 * Retrieves transaction data for a specific boarding house by name with a TableModel.
	 *
	 * @param boardingHouseName The name of the boarding house to retrieve transaction data for.
	 * @return The TableModel containing the transaction data, or null if an error occurs.
	 */
	public static @Nullable
	TableModel getTransactionsByBoardingHouseNameTableModel(String boardingHouseName) {
		try {
			// Create a database statement
			Statement stm = db.createStatement();

			// Execute a SQL query to retrieve transaction data for the specified boarding house name
			ResultSet rs = stm.executeQuery("SELECT boarding_houses.name AS 'Nama Kost', boarding_houses.price AS 'Harga Per Bulan', " +
					"transactions"
					+ ".rental_duration AS 'Lama Sewa', transactions.total_price AS 'Total Harga', transactions" +
					".created_at AS 'Tanggal Transaksi' FROM " +
					"transactions JOIN" +
					" boarding_houses ON transactions.boarding_houses_id = boarding_houses.id JOIN users ON " +
					"transactions.customer_id = users.id WHERE boarding_houses.name LIKE '%" + boardingHouseName + "%';");

			ArrayList<Object[]> rows = new ArrayList<>();

			while (rs.next()) {
				int hargaPerBulan = rs.getInt("Harga Per Bulan");
				// Format the value of Harga Per Bulan into Indonesian currency format (Rupiah)
				String hargaPerBulanFormatted = Utils.formatRupiah(hargaPerBulan);

				// Get the value of Total Harga from the result set
				int totalHarga = rs.getInt("Total Harga");
				// Format the value of Total Harga into Indonesian currency format (Rupiah)
				String totalHargaFormatted = Utils.formatRupiah(totalHarga);

				// Add the formatted row to the ArrayList
				rows.add(new Object[]{
						rs.getString("Nama Kost"),
						hargaPerBulanFormatted,
						rs.getInt("Lama Sewa"),
						totalHargaFormatted,
						rs.getString("Tanggal Transaksi")
				});
			}

			// Create a new table model with headers matching the result set
			String[] columnNames = {"Nama Kost", "Harga Per Bulan", "Lama Sewa", "Total Harga", "Tanggal Transaksi"};
			DefaultTableModel model = new DefaultTableModel(columnNames, 0);

			// Add the formatted rows to the table model
			for (Object[] row : rows) {
				model.addRow(row);
			}

			return model;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Retrieves transaction data by boarding house name and username of specific customer with a TableModel.
	 *
	 * @param boardingHouseName The name of the boarding house to retrieve transaction data for.
	 * @param username          The username of the customer to retrieve transaction data for.
	 * @return The TableModel containing the transaction data, or null if an error occurs.
	 */
	public static @Nullable
	TableModel getTransactionsByBoardingHouseNameTableModel(String boardingHouseName, String username) {
		try {
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT boarding_houses.name AS boarding_house, boarding_houses.price, transactions"
					+ ".rental_duration, transactions.total_price, transactions.created_at FROM transactions JOIN " +
					"boarding_houses ON transactions.boarding_houses_id = boarding_houses.id JOIN users ON transactions.customer_id = users.id WHERE boarding_houses.name LIKE '%" + boardingHouseName + "%' AND users.username = '" + username + "';");
			return DbUtils.resultSetToTableModel(rs);
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}

	}

	public static void main(String[] args) {
		Timestamp createdAt = new Timestamp(System.currentTimeMillis());
//		System.out.println(create(new TransactionEntity(2, 40, createdAt, 21, 8), 8));
		System.out.println(countTransaction());
	}

}
