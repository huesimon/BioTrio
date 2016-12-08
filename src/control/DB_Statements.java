/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Movie;
import view.ConnectionGui;
import java.sql.*;
import java.util.ArrayList;
import javax.management.remote.JMXConnectorFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.StyledEditorKit;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

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

            System.out.println("\nname\taddress\ttelephone\n__________________");
            while (rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                String telefon = rs.getString("telefon");
                System.out.println(name + "\t\t" + address + "\t" + telefon);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    public void editShowing(String date, int showing_id){
        String table = "showing";
        String sql =  "update showing set date = " + date + " where showing_id = " + showing_id+ ";";
        try {
            DB_Connection.getCon();
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data updated in " + table + " table");
            System.out.println("\n--Data updated in " + table + " table--");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        //DB_Connection.closeConnection();
    }
    }

   /*
    public void createOderTable(){
        con = DB_Connection.connect();
        String tabel = "oder1";
        String query = "create table if not exists " + table + " (0_Id serial, OderNo Integer);";
        try {
            stmt = con.createStatement();
            stmt.executeQuery(query);
            System.out.println("\n--Table " + table + " has been created--");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void insertIntoOderTable(){
        con = DB_Connection.connect(user, password);
        String table = "order1";
        String sql =    "insert into " + table + " (orderno) values(39);" +
                        "insert into " + table + " (orderno) values(44);" +
                        "insert into " + table + " (orderno) values(53);";
        try {
            stmt = con.createStatement();
            stmt.executeQuery(sql);
            System.out.println("\n---DAta inserted into " + table + " table --");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        DB_Connection.closeConnection();
    }
   

    public void closeResultSet() {
        try {
            if (rs != null) {
                rs.close();
                System.out.println("\nThe ResultSet is now closed");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void createTable() {
        con = DB_Connection.connect();
        String query = "CREATE TABLE person (pname varchar(28),address varchar(36),id integer);";

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("TABLE CREATED");
    }*/
