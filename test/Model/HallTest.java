/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class HallTest {
    
    public HallTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getHallName method, of class Hall.
     */
    @Test
    public void testGetHallName() {
        System.out.println("getHallName");
        Hall instance = null;
        String expResult = "";
        String result = instance.getHallName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHallName method, of class Hall.
     */
    @Test
    public void testSetHallName() {
        System.out.println("setHallName");
        String hallName = "";
        Hall instance = null;
        instance.setHallName(hallName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHallId method, of class Hall.
     */
    @Test
    public void testGetHallId() {
        System.out.println("getHallId");
        Hall instance = null;
        int expResult = 0;
        int result = instance.getHallId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHallNumber method, of class Hall.
     */
    @Test
    public void testSetHallNumber() {
        System.out.println("setHallNumber");
        int hall_id = 0;
        Hall instance = null;
        instance.setHallNumber(hall_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRows method, of class Hall.
     */
    @Test
    public void testGetRows() {
        System.out.println("getRows");
        Hall instance = null;
        int expResult = 0;
        int result = instance.getRows();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRows method, of class Hall.
     */
    @Test
    public void testSetRows() {
        System.out.println("setRows");
        int rows = 0;
        Hall instance = null;
        instance.setRows(rows);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCols method, of class Hall.
     */
    @Test
    public void testGetCols() {
        System.out.println("getCols");
        Hall instance = null;
        int expResult = 0;
        int result = instance.getCols();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCols method, of class Hall.
     */
    @Test
    public void testSetCols() {
        System.out.println("setCols");
        int cols = 0;
        Hall instance = null;
        instance.setCols(cols);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalSeats method, of class Hall.
     */
    @Test
    public void testGetTotalSeats() {
        System.out.println("getTotalSeats");
        Hall instance = null;
        int expResult = 0;
        int result = instance.getTotalSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeatingArray method, of class Hall.
     */
    @Test
    public void testGetSeatingArray() {
        System.out.println("getSeatingArray");
        Hall instance = null;
        int[][] expResult = null;
        int[][] result = instance.getSeatingArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalSeats method, of class Hall.
     */
    @Test
    public void testSetTotalSeats() {
        System.out.println("setTotalSeats");
        int totalSeats = 0;
        Hall instance = null;
        instance.setTotalSeats(totalSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Hall.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hall instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
