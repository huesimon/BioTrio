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

/**
 *
 * @author Simon_
 */
public class DB_Connection {

//     Declare a Connection
    private static Connection con = null;
//    The url
    //private static final String url = "jdbc:postgresql://localhost:5432/SQL_1";
    private static final String url = "jdbc:postgresql://";
//    The username
//    private static final String user = "postgres";
//    driver
    private static final String DRIVER = "org.postgresql.Driver";
    private static DB_Connection instance = null;
//    The password
//    private static final String psswrd = "root";
/*
//    declaring the Statement
    Statement stmt = null;
//    declaring the ResultSet
    ResultSet rs = null;
*/
    private DB_Connection(){}
    
    public static DB_Connection getInstace(){
        if(instance == null){
            instance = new DB_Connection();
        }
        return instance;
    }
    
    public static Connection connect(String user, String password, String host, String port, String DBname) {
        System.out.println("--PostgreSQÆ connection test--");

        try {
//            Locate postgres JDBC driver
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
//            Catch exception 
            ex.printStackTrace();
            System.out.println("JDBC is missing");
        }
        System.out.println("PostgreSQL JDBC driver is registerd");

        try {
            con = DriverManager.getConnection(url + host + ":" + port + "/" + DBname ,user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (con != null) {
            System.out.println("connection successful");
        } else {
            System.out.println("connection un-succesful");
        }
        return con;
    }

    public static void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("The connection is now closed");
        }
    }
     
    }

