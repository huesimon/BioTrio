/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.*;

/**
 *
 * @author Simon_
 */
public class SeatHandler {
    public SeatHandler(){}
    //    declare connection

    private static Connection con = null;
//    declare the statement
    private static Statement stmt = null;
//    declare the result
    private static ResultSet rs = null;
    

    public static void getSeats() {
        
        String query = "select * from ticket";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            System.out.println("getting Seats");
            while (rs.next()) {
                int rowNo = rs.getInt("rowNo");
               ////String address = rs.getString("address");
                //String telefon = rs.getString("telefon");
                System.out.println(rowNo);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection user,Connection password, Connection hostName, Connection port, Connection DBname) {
        SeatHandler.con = (user + password + hostName + port + DBname);
    }
    
}
