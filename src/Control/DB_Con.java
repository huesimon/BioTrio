/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Simon_
 */
public class DB_Con {
    
     public DB_Con() {}
     String host;
     String port;
     String database;
    String
    private void printMenu() {
        System.out.println("1: Enter new Customer");
        System.out.println("2: List existing Customers");
        System.out.println("3: Quit");
    }
    public static Connection connect() {
    

        
        try {
            // Driver is loaded - postgreSQL JDBC Driver needs to be
            // added under libraries for this to work
            Class.forName("org.postgresql.Driver");
            
            // A connection-object is created with host, port, databasename, username and password
            
            String port = "5432";
            String database = "test_database";
            String username = "test_user";
            String password = "test_password";
            
            String url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // A statement-object is created. This is used to execute
            // queries and updates on the database.
            Statement stmt = conn.createStatement();

            //A ResultSet is created from an executed query 
            String sql = "SELECT * FROM Customer";
            ResultSet rs = stmt.executeQuery(sql);
            
            // read all customer rows from ResultSet and create a customer-object
            // for each row
            while (rs.next()) {
                String firstname = rs.getString("firstname").trim();
                String lastname = rs.getString("lastname").trim();
                String city = rs.getString("city").trim();
                String phone = rs.getString("phone").trim();
                String email = rs.getString("email").trim();
                
                
            }
            
            // Close ResultSet, Statement and Connection when we're done.
            rs.close();
            stmt.close();
            conn.close();
            
      
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found: " + ex.getMessage());
            System.out.println("Remember to add postgreSQL JDBC Driver Library! (Use Add Library...)");
        } catch (SQLException ex) {
            System.out.println("SQL ERROR: " + ex.getMessage());
        }
        
        System.exit(0);
    
    
        
    
    
