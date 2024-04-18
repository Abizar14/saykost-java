package services.auth;

import org.jetbrains.annotations.Nullable;
import services.database.Db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Authentication {
	static Connection db;

	static {
		try {
			db = Db.connection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	/**
	 * Checks if the given username and password are valid for an admin login.
	 *
	 * @param username the username to check
	 * @param password the password to check
	 * @return full_name of the admin if the username and password are valid, null otherwise
	 */
	public static @Nullable String loginAdmin(String username, String password) {
		try {
			String sql = "SELECT * FROM admins WHERE username = '" + username + "' AND password = '" + password + "'";
			ResultSet result = db.createStatement().executeQuery(sql);
			if (result.next()) {
				return result.getString("full_name");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	/**
	 * Checks if the given username and password are valid for a customer login.
	 *
	 * @param username the username to check
	 * @param password the password to check
	 * @return full_name of the customer if the username and password are valid, null otherwise
	 */
	public static @Nullable String loginCustomer(String username, String password) {
		try {
			String sql = "SELECT * FROM customers WHERE username = '" + username + "' AND password = '" + password + "'";
			ResultSet result = db.createStatement().executeQuery(sql);
			if (result.next()) {
				return result.getString("full_name");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}


	public static void main(String[] args) {
	}
}
