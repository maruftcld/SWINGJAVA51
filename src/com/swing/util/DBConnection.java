package com.swing.util;

import java.sql.*;
import java.sql.DriverManager;

public class DBConnection {
    //statement
    //executequery
    //resultset
    public static void main(String[] args) {
        System.out.println("hello");
        String sql = "select * from users";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tsp", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            System.out.println(rs.getString("username"));
            
        } catch (Exception e) {
        }
    }
}