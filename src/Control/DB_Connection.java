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
import java.sql.*;
import Model.*;

/**
 *
 * @author Simon_
 */
public class DB_Connection {

    private String user;
    private String password;
    private String hostName;
    private String port;
    private String DBname;
//     Declare a Connection

    private static Connection con = null;
//    declare the statement
    private static Statement stmt = null;
//    declare the result
    private static ResultSet rs = null;
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
    public DB_Connection() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDBname() {
        return DBname;
    }

    public void setDBname(String DBname) {
        this.DBname = DBname;
    }

    public static DB_Connection getInstace() {
        if (instance == null) {
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
            con = DriverManager.getConnection(url + host + ":" + port + "/" + DBname, user, password);
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

    public void queryPerson() {

        String query = "select * from ticket";
        try {
            con = DriverManager.getConnection(url + hostName + ":" + port + "/" + DBname, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            System.out.println("\nname\taddress\ttelephone\n__________________");
            while (rs.next()) {
                String name = rs.getString("rowNo");
                
                System.out.println(name);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (con != null) {
            System.out.println("connection successful");
        } else {
            System.out.println("connection un-succesful");
        }
    }
}
