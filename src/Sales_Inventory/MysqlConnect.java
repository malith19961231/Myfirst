/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales_Inventory;
import java.awt.HeadlessException;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author pc
 */
public class MysqlConnect {
Connection conn=null;
    public static Connection ConnectDB()
    {
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/login?autoReconnect=true&useSSL=false","root","");
           
            return conn;
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }

    
}
