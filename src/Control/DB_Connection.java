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
    private static String port;
    private static String hostName;
    private static String databaseName;
//    The url
    private static String url = "jdbc:postgresql://" + hostName + ":" + port + "/" + databaseName;

//    The username
    private static String user = "postgres";
//    driver
    private static final String DRIVER = "org.postgresql.Driver";
//    The password
    private static String psswrd = "root";

    /*
//    declaring the Statement
    Statement stmt = null;
//    declaring the ResultSet
    ResultSet rs = null;
     */
    public static Connection connect() {
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
            con = DriverManager.getConnection(url, user, psswrd);
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

    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("The connection is now closed");
        }
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        DB_Connection.port = port;
    }

    public static String getHostName() {
        return hostName;
    }

    public static void setHostName(String hostName) {
        DB_Connection.hostName = hostName;
    }

    public static String getDatabaseName() {
        return databaseName;
    }

    public static void setDatabaseName(String databaseName) {
        DB_Connection.databaseName = databaseName;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        DB_Connection.url = url;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        DB_Connection.user = user;
    }

    public static String getPsswrd() {
        return psswrd;
    }

    public static void setPsswrd(String psswrd) {
        DB_Connection.psswrd = psswrd;
    }

}
