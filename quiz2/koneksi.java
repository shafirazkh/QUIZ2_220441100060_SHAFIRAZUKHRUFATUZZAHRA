/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
    
    private static Connection mysqlkonek;
     
    public static Connection koneksiDB() throws SQLException{
         if (mysqlkonek == null){
             try {
                 String DB = "jdbc:mysql://localhost:3307/quiz2pemvis";
                 String user = "root";
                 String pw = "";
                Connection connection = DriverManager.getConnection(DB, user, pw);
                 mysqlkonek = (Connection) DriverManager.getConnection(DB, user, pw);
                 JOptionPane.showMessageDialog(null, "Koneksi berhasil");
             
             }catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
             }
         }
         return mysqlkonek;
    }

            
    public static void main(String[] args) {

    }
    
}
