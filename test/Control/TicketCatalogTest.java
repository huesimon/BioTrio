/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Ticket;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class TicketCatalogTest {
    
    public TicketCatalogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of queryTickets method, of class TicketCatalog.
     */
    @Test
    public void testQueryTickets() {
        System.out.println("queryTickets");
        TicketCatalog instance = new TicketCatalog();
        instance.queryTickets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queryTicketsByOrderId method, of class TicketCatalog.
     */
    @Test
    public void testQueryTicketsByOrderId() {
        System.out.println("queryTicketsByOrderId");
        int id = 0;
        TicketCatalog instance = new TicketCatalog();
        instance.queryTicketsByOrderId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTicket method, of class TicketCatalog.
     */
    @Test
    public void testCreateTicket() {
        System.out.println("createTicket");
        String rowNo = "";
        String seatNo = "";
        int orders = 0;
        int showing = 0;
        TicketCatalog instance = new TicketCatalog();
        instance.createTicket(rowNo, seatNo, orders, showing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTickets method, of class TicketCatalog.
     */
    @Test
    public void testGetTickets() {
        System.out.println("getTickets");
        TicketCatalog instance = new TicketCatalog();
        ArrayList<Ticket> expResult = null;
        ArrayList<Ticket> result = instance.getTickets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTickets method, of class TicketCatalog.
     */
    @Test
    public void testSetTickets() {
        System.out.println("setTickets");
        ArrayList<Ticket> tickets = null;
        TicketCatalog instance = new TicketCatalog();
        instance.setTickets(tickets);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketByOrderId method, of class TicketCatalog.
     */
    @Test
    public void testGetTicketByOrderId() {
        System.out.println("getTicketByOrderId");
        int id = 0;
        TicketCatalog instance = new TicketCatalog();
        Ticket[] expResult = null;
        Ticket[] result = instance.getTicketByOrderId(id);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketByShowingId method, of class TicketCatalog.
     */
    @Test
    public void testGetTicketByShowingId() {
        System.out.println("getTicketByShowingId");
        int id = 0;
        TicketCatalog instance = new TicketCatalog();
        ArrayList<Ticket> expResult = null;
        ArrayList<Ticket> result = instance.getTicketByShowingId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
