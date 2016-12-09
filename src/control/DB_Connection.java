/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
    private static final String url = "jdbc:postgresql://";

    private static final String DRIVER = "org.postgresql.Driver";
    private static DB_Connection instance = null;

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

    public static DB_Connection getInstance() {
        if (instance == null) {
            instance = new DB_Connection();
        }
        return instance;
    }

    public static Connection connect(String user, String password, String host, String port, String DBname) {
        try {
//            Locate postgres JDBC driver
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
//            Catch exception 
            ex.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(url + host + ":" + port + "/" + DBname, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
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
        }
    }

    public void queryPerson() {
        String query = "SELECT * FROM customer, ticket WHERE customer_id = ticket.orders";
        try {
            con = DriverManager.getConnection(url + hostName + ":" + port + "/" + DBname, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String rowNo = rs.getString("rowNo");
                String seatNo = rs.getString("seatNo");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        DB_Connection.con = con;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public static void setStmt(Statement stmt) {
        DB_Connection.stmt = stmt;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        DB_Connection.rs = rs;
    }

}
