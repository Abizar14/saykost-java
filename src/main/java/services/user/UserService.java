package services.user;

import net.proteanit.sql.DbUtils;
import org.jetbrains.annotations.Nullable;
import services.database.Db;
import services.user.dto.UserDto;
import services.user.entities.UserEntity;

import javax.swing.table.TableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

	private final static Connection db;

	static {
		try {
			db = Db.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Validates a user by checking if the provided username and password match
	 * a record in the database.
	 *
	 * @param username The username of the user.
	 * @param password The password of the user.
	 * @return The {@code UserEntity} object representing the validated user, or
	 * null if the validation fails.
	 */
	public static @Nullable
	UserDto validateUser(String username, String password) {
		try {
			String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
			ResultSet result = db.createStatement().executeQuery(sql);
			UserDto user = new UserDto();
			while (result.next()) {
				user.setId(result.getInt("id"));
				user.setFullName(result.getString("full_name"));
				user.setPhoneNumber(result.getString("phone_number"));
				user.setUsername(result.getString("username"));
				user.setRole(result.getString("role"));
			}
			return user;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Registers a new customer in the database.
	 *
	 * @param user The user entity containing the customer information.
	 * @return A string indicating the success of the registration or null if an
	 * error occurred.
	 */
	public static @Nullable
	String registerCustomer(UserEntity user) {
//		check if all fields filled
		if (user.getFullName().isEmpty() || user.getFullName().isBlank() || user.getPhoneNumber().isEmpty() || user.getPhoneNumber().isBlank() || user.getUsername().isEmpty() || user.getUsername().isBlank() || user.getPassword().isEmpty() || user.getPassword().isBlank()) {
			return "Please fill all the fields!";
		}
//		check if username exist
		if (getUserByUsername(user.getUsername())) {
			System.out.println(getUserByUsername(user.getUsername()));
			return "Username already exist!";
		}

//		username can only contain lowercase letters, numbers, underscores, and can not contain spaces, and symbols
//		with min length is 5
		if (!user.getUsername().matches("^[a-z0-9_]{5,30}$")) {
			return "Username can only contain lowercase letters, numbers, underscores, and can not contain spaces, " +
					"and symbols with min length is 5";
		}

//		check if phone number exist
		if (getUserByNumberPhone(user.getPhoneNumber())) {
			return "Phone number already exist!";
		}

//		check is phone number valid
		if (!user.getPhoneNumber().matches("^\\+?\\d{10,15}$") || getUserByNumberPhone(user.getPhoneNumber())) {
			return "Invalid phone number!";
		}

//		check if password valid with min length is 8
		if (user.getPassword().length() < 8) {
			return "Password must be at least 8 characters long!";
		}

		try {
			String sql = "INSERT INTO users(full_name, phone_number, username, password, role) VALUES('"
					+ user.getFullName() + "', '" + user.getPhoneNumber() + "', '" + user.getUsername() + "', '"
					+ user.getPassword() + "', 'customer')";
			db.createStatement().execute(sql);
			return "Customer registered successfully!";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static @Nullable
	TableModel getDataUser() {
		try {
			java.sql.Statement stm = db.createStatement();
			java.sql.ResultSet rs = stm.executeQuery("SELECT users.full_name as 'Nama', users.phone_number as 'No Telepon', users.username as 'Username' FROM users WHERE role = 'customer'");

			return DbUtils.resultSetToTableModel(rs);
		} catch (SQLException | HeadlessException e) {
			System.out.println("Error" + e.getMessage());
			return null;
		}
	}

	public static @Nullable
	TableModel getDataCustomerByUsername(String username) {
		try {
			java.sql.Statement stm = db.createStatement();
			java.sql.ResultSet rs = stm.executeQuery("SELECT users.full_name as 'Nama', users.phone_number as 'No Telepon', users.username as 'Username' FROM users WHERE role = 'customer' AND users.username LIKE '%" + username + "%'");

			return DbUtils.resultSetToTableModel(rs);
		} catch (SQLException | HeadlessException e) {
			System.out.println("Error" + e.getMessage());
			return null;
		}
	}

	public static boolean getUserByUsername(String username) {
		try {
			java.sql.Statement stm = db.createStatement();
			java.sql.ResultSet rs = stm.executeQuery("SELECT * FROM users WHERE username = '" + username + "'");
			return rs.next();
		} catch (SQLException e) {
			System.out.println("Error " + e.getMessage());
			return false;
		}
	}

	public static boolean getUserByNumberPhone(String phoneNumber) {
		try {
			java.sql.Statement stm = db.createStatement();
			java.sql.ResultSet rs = stm.executeQuery("SELECT * FROM users WHERE phone_number = '" + phoneNumber +
					"'");
			return rs.next();
		} catch (SQLException e) {
			System.out.println("Error " + e.getMessage());
			return false;
		}
	}
}
