/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Randika Hasheen
 */
public class dbconnection {
    public static Connection dbconmethod()throws Exception{
        Connection c;
        
        Class.forName("com.mysql.jdbc.Driver");
        
        c=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3309/mydb","root","0920");
        
        
        
        return c;
    }
    
    
}
