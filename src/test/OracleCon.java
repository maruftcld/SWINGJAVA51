package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class OracleCon {

    public static void main(String args[]) {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");//orcl=central database name

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from emp");
            ResultSet rs1 = stmt.executeQuery("select * from dept");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

           

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OracleCon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}