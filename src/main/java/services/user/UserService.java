package services.user;

import services.database.Db;
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
	public static UserEntity validateUser(String username, String password) {
		try {
			String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
			ResultSet result = db.createStatement().executeQuery(sql);
			UserEntity user = new UserEntity();
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

	public static void main(String[] args) {

	}
}
