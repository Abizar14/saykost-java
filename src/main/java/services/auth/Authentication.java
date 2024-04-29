package services.auth;

import services.database.Db;
import services.user.UserService;
import services.user.dto.UserDto;

import java.sql.Connection;
import java.sql.SQLException;

public class Authentication {
	private final static Connection db;

	static {
		try {
			db = Db.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	/**
	 * Authenticates a user by validating the provided username and password.
	 *
	 * @param username The username of the user.
	 * @param password The password of the user.
	 * @return The {@code UserEntity} object representing the authenticated user, or null if the validation fails.
	 * @throws {@code RuntimeException} If an exception occurs during the validation process.
	 */
	public static UserDto loginUser(String username, String password) {
		try {
			return UserService.validateUser(username, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
	}
}