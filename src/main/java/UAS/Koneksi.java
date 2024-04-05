/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Koneksi {
    // koneksi ke database
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if(mysqlkonek==null)
        {
            try {
                String DB="jdbc:mysql://localhost:3306/uas_java"; // delta_db database
                String user="root"; // user database
                String pass=""; // password database
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection(DB,user,pass);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return mysqlkonek;
    }
}
