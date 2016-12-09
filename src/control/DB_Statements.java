/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon_
 */
public class DB_Statements {
//    declare connection

    private static Connection con = null;
//    declare the statement
    private static Statement stmt = null;
//    declare the result
    private static ResultSet rs = null;

    public void queryPerson() {
        //con = DB_Connection.connect();
        String query = "select * from person";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                String telefon = rs.getString("telefon");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void editShowing(String date, int showing_id) {
        String table = "showing";
        String sql = "update showing set date = " + date + " where showing_id = " + showing_id + ";";
        try {
            DB_Connection.getCon();
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data updated in " + table + " table");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
