package services.database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	private static Connection mysqlkonek;

	public static Connection connection() throws SQLException {
		if (mysqlkonek == null) {
			try {
				String DB = "jdbc:mysql://localhost:3306/uas_java"; // delta_db database
				String user = "root"; // user database
				String pass = ""; // password database
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				mysqlkonek = DriverManager.getConnection(DB, user, pass);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Connection to database Failed : " + e);
			}
		}
		return mysqlkonek;
	}
}
