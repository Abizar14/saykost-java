package services.database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	private static Connection mysqlkonek;
private static Connection connection;

	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			try {
				String url = "jdbc:mysql://localhost:3306/uas_java"; // database url
				String user = "root"; // user database
				String pass = ""; // password database
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				connection = DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Connection to database Failed : " + e);
			}
		}
		return connection;
	}
}
