/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class DB_ConnectionTest {
    
    public DB_ConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUser method, of class DB_Connection.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        DB_Connection instance = new DB_Connection();
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class DB_Connection.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        DB_Connection instance = new DB_Connection();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class DB_Connection.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        DB_Connection instance = new DB_Connection();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class DB_Connection.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        DB_Connection instance = new DB_Connection();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHostName method, of class DB_Connection.
     */
    @Test
    public void testGetHostName() {
        System.out.println("getHostName");
        DB_Connection instance = new DB_Connection();
        String expResult = "";
        String result = instance.getHostName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHostName method, of class DB_Connection.
     */
    @Test
    public void testSetHostName() {
        System.out.println("setHostName");
        String hostName = "";
        DB_Connection instance = new DB_Connection();
        instance.setHostName(hostName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPort method, of class DB_Connection.
     */
    @Test
    public void testGetPort() {
        System.out.println("getPort");
        DB_Connection instance = new DB_Connection();
        String expResult = "";
        String result = instance.getPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPort method, of class DB_Connection.
     */
    @Test
    public void testSetPort() {
        System.out.println("setPort");
        String port = "";
        DB_Connection instance = new DB_Connection();
        instance.setPort(port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDBname method, of class DB_Connection.
     */
    @Test
    public void testGetDBname() {
        System.out.println("getDBname");
        DB_Connection instance = new DB_Connection();
        String expResult = "";
        String result = instance.getDBname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDBname method, of class DB_Connection.
     */
    @Test
    public void testSetDBname() {
        System.out.println("setDBname");
        String DBname = "";
        DB_Connection instance = new DB_Connection();
        instance.setDBname(DBname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class DB_Connection.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        DB_Connection expResult = null;
        DB_Connection result = DB_Connection.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class DB_Connection.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        String user = "";
        String password = "";
        String host = "";
        String port = "";
        String DBname = "";
        Connection expResult = null;
        Connection result = DB_Connection.connect(user, password, host, port, DBname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class DB_Connection.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        DB_Connection.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queryPerson method, of class DB_Connection.
     */
    @Test
    public void testQueryPerson() {
        System.out.println("queryPerson");
        DB_Connection instance = new DB_Connection();
        instance.queryPerson();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCon method, of class DB_Connection.
     */
    @Test
    public void testGetCon() {
        System.out.println("getCon");
        Connection expResult = null;
        Connection result = DB_Connection.getCon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCon method, of class DB_Connection.
     */
    @Test
    public void testSetCon() {
        System.out.println("setCon");
        Connection con = null;
        DB_Connection.setCon(con);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStmt method, of class DB_Connection.
     */
    @Test
    public void testGetStmt() {
        System.out.println("getStmt");
        Statement expResult = null;
        Statement result = DB_Connection.getStmt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStmt method, of class DB_Connection.
     */
    @Test
    public void testSetStmt() {
        System.out.println("setStmt");
        Statement stmt = null;
        DB_Connection.setStmt(stmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRs method, of class DB_Connection.
     */
    @Test
    public void testGetRs() {
        System.out.println("getRs");
        ResultSet expResult = null;
        ResultSet result = DB_Connection.getRs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRs method, of class DB_Connection.
     */
    @Test
    public void testSetRs() {
        System.out.println("setRs");
        ResultSet rs = null;
        DB_Connection.setRs(rs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
