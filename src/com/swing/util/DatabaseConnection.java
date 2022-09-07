package com.swing.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
   
    public static Connection getDBConnection(){
        Connection con = null;
        try {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tsp", "root", "root");
        } catch (Exception e) {
        }
        return con;
    }
    
    
}