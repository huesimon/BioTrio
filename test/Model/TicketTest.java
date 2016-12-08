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
public class TicketTest {
    
    public TicketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRowNo method, of class Ticket.
     */
    @Test
    public void testGetRowNo() {
        System.out.println("getRowNo");
        Ticket instance = null;
        int expResult = 0;
        int result = instance.getRowNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRowNo method, of class Ticket.
     */
    @Test
    public void testSetRowNo() {
        System.out.println("setRowNo");
        int rowNo = 0;
        Ticket instance = null;
        instance.setRowNo(rowNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeatNo method, of class Ticket.
     */
    @Test
    public void testGetSeatNo() {
        System.out.println("getSeatNo");
        Ticket instance = null;
        int expResult = 0;
        int result = instance.getSeatNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeatNo method, of class Ticket.
     */
    @Test
    public void testSetSeatNo() {
        System.out.println("setSeatNo");
        int seatNo = 0;
        Ticket instance = null;
        instance.setSeatNo(seatNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrder_id method, of class Ticket.
     */
    @Test
    public void testGetOrder_id() {
        System.out.println("getOrder_id");
        Ticket instance = null;
        int expResult = 0;
        int result = instance.getOrder_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrder_id method, of class Ticket.
     */
    @Test
    public void testSetOrder_id() {
        System.out.println("setOrder_id");
        int order_id = 0;
        Ticket instance = null;
        instance.setOrder_id(order_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShowing_id method, of class Ticket.
     */
    @Test
    public void testGetShowing_id() {
        System.out.println("getShowing_id");
        Ticket instance = null;
        int expResult = 0;
        int result = instance.getShowing_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowing_id method, of class Ticket.
     */
    @Test
    public void testSetShowing_id() {
        System.out.println("setShowing_id");
        int showing_id = 0;
        Ticket instance = null;
        instance.setShowing_id(showing_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ticket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ticket instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
