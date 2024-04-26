package services.auth;

import org.jetbrains.annotations.Nullable;
import services.database.Db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import services.user.UserService;
import services.user.dto.UserDto;

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
			UserDto user = UserService.validateUser(username, password);
//			if (user != null) {
//				return null;
//			}
			return user;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
	public static void main(String[] args) {
	}
}
