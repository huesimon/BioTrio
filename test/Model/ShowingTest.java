/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class ShowingTest {
    
    public ShowingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getHall method, of class Showing.
     */
    @Test
    public void testGetHall() {
        System.out.println("getHall");
        Showing instance = null;
        Hall expResult = null;
        Hall result = instance.getHall();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHall method, of class Showing.
     */
    @Test
    public void testSetHall() {
        System.out.println("setHall");
        Hall hall = null;
        Showing instance = null;
        instance.setHall(hall);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovie method, of class Showing.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        Showing instance = null;
        Movie expResult = null;
        Movie result = instance.getMovie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMovie method, of class Showing.
     */
    @Test
    public void testSetMovie() {
        System.out.println("setMovie");
        Movie movie = null;
        Showing instance = null;
        instance.setMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketList method, of class Showing.
     */
    @Test
    public void testGetTicketList() {
        System.out.println("getTicketList");
        Showing instance = null;
        ArrayList<Ticket> expResult = null;
        ArrayList<Ticket> result = instance.getTicketList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketList method, of class Showing.
     */
    @Test
    public void testSetTicketList() {
        System.out.println("setTicketList");
        ArrayList<Ticket> ticketList = null;
        Showing instance = null;
        instance.setTicketList(ticketList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Showing.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Showing instance = null;
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Showing.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Showing instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Showing.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Showing instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShowing_id method, of class Showing.
     */
    @Test
    public void testGetShowing_id() {
        System.out.println("getShowing_id");
        Showing instance = null;
        int expResult = 0;
        int result = instance.getShowing_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowing_id method, of class Showing.
     */
    @Test
    public void testSetShowing_id() {
        System.out.println("setShowing_id");
        int showing_id = 0;
        Showing instance = null;
        instance.setShowing_id(showing_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemainingSeats method, of class Showing.
     */
    @Test
    public void testGetRemainingSeats() {
        System.out.println("getRemainingSeats");
        Showing instance = null;
        String expResult = "";
        String result = instance.getRemainingSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
