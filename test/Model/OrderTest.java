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
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTickets method, of class Order.
     */
    @Test
    public void testGetTickets() {
        System.out.println("getTickets");
        Order instance = null;
        Ticket[] expResult = null;
        Ticket[] result = instance.getTickets();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTickets method, of class Order.
     */
    @Test
    public void testSetTickets() {
        System.out.println("setTickets");
        Ticket[] tickets = null;
        Order instance = null;
        instance.setTickets(tickets);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Order.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Order instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class Order.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        Order instance = null;
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrder_id method, of class Order.
     */
    @Test
    public void testGetOrder_id() {
        System.out.println("getOrder_id");
        Order instance = null;
        int expResult = 0;
        int result = instance.getOrder_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrder_id method, of class Order.
     */
    @Test
    public void testSetOrder_id() {
        System.out.println("setOrder_id");
        int order_id = 0;
        Order instance = null;
        instance.setOrder_id(order_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
