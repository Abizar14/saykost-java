package services.transaction;

import net.proteanit.sql.DbUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.database.Db;
import services.transaction.entities.TransactionEntity;

import javax.swing.table.TableModel;
import java.sql.*;

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
	 * @param transactionEntity the transaction entity containing the transaction details
	 * @param username          the username of the user
	 * @return a string indicating the success or failure of the transaction creation
	 */
	public static @NotNull String create(@NotNull TransactionEntity transactionEntity, @NotNull String username) {
		try {
			//TODO: Add validation if username do not have transaction, set quantity in boarding house -1
			if (!checkUsernameHaveTransaction(username)) {
				String sql = "UPDATE boarding_houses SET quantity = quantity - 1 WHERE id = '" + transactionEntity.getBoardingHouseId() + "'";
				db.createStatement().execute(sql);
			}
			Timestamp createdAt = new Timestamp(System.currentTimeMillis());
			String sql = "INSERT INTO transactions (rental_duration, total_price, created_at, boarding_houses_id, customer_id) " +
					"VALUES" + "('" + transactionEntity.getRentalDuration() + "', '" + transactionEntity.getTotalPrice() + "', '" + createdAt + "', '" + transactionEntity.getBoardingHouseId() + "', '" + transactionEntity.getCustomerId() + "')";
			db.createStatement().execute(sql);
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
	 * @return the TableModel containing the transaction data, or null if an error occurs
	 */
	public static @Nullable TableModel getTransactionsByUsernameTableModel(String username) {
		try {
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT boarding_houses.name AS boarding_house, boarding_houses.price, transactions" +
					".rental_duration, transactions.total_price, transactions.created_at FROM transactions JOIN boarding_houses ON transactions.boarding_houses_id = boarding_houses.id JOIN users ON transactions.customer_id = users.id WHERE users.username = '" + username + "';");
			return DbUtils.resultSetToTableModel(rs);
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Checks if a given username has any transaction in the database.
	 *
	 * @param username the username to check
	 * @return true if the username has a transaction, false otherwise
	 */
	private static boolean checkUsernameHaveTransaction(String username) {
		try {
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM transactions WHERE customer_id = (SELECT id FROM users WHERE username = '" + username + "');");
			return rs.next();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static void main(String[] args) {
	}
}