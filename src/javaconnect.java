/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prateek
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Parteek\\Documents\\NetBeansProjects\\EMS-ST2K17\\ems.sqlite");
            return conn;
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
    }
   }
}
