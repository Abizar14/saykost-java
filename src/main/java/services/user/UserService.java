package services.user;

import client.utils.Utils;
import org.jetbrains.annotations.Nullable;
import services.database.Db;
import services.user.dto.UserDto;
import services.user.entities.UserEntity;

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
	 * Validates a user by checking if the provided username and password match a record in the database.
	 *
	 * @param username The username of the user.
	 * @param password The password of the user.
	 * @return The {@code UserEntity} object representing the validated user, or null if the validation fails.
	 */
	public static @Nullable UserDto validateUser(String username, String password) {
		try {
			String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
			ResultSet result = db.createStatement().executeQuery(sql);
			UserDto user = new UserDto();
			while (result.next()) {
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
	 * @return A string indicating the success of the registration or null if an error occurred.
	 */
	public static @Nullable String registerCustomer(UserEntity user) {
		try {
//			check isNumberphone is only number and at least 10 characters
			boolean isNumberPhone = user.getPhoneNumber().matches("\\d{10,}");
//			check isUsername is not contains whitespaces and at least 5 characters
			boolean isUsername = user.getUsername().matches("\\S{5,}");
			if (!isUsername) {
				return "Username harus terdiri dari setidaknya 5 karakter tanpa spasi";
			} else if (!isNumberPhone) {
				return "Nomor telepon tidak valid";
			}
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

	public static void main(String[] args) {
		Utils.showMessageDialog("Something went wrong", "Customer registered successfully", "./img/warning.gif", 120,
				120);

	}

}
