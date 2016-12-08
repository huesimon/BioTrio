/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biotrio;

import Control.CustomerController;
import Control.HallCatalog;
import Control.MovieCatalog;
import Control.OrderCatalog;
import Control.ShowingCatalog;
import Control.TicketCatalog;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class BiotrioTest {
    
    public BiotrioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getShowingCatalog method, of class Biotrio.
     */
    @Test
    public void testGetShowingCatalog() {
        System.out.println("getShowingCatalog");
        Biotrio instance = new Biotrio();
        ShowingCatalog expResult = null;
        ShowingCatalog result = instance.getShowingCatalog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieCatalog method, of class Biotrio.
     */
    @Test
    public void testGetMovieCatalog() {
        System.out.println("getMovieCatalog");
        Biotrio instance = new Biotrio();
        MovieCatalog expResult = null;
        MovieCatalog result = instance.getMovieCatalog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerController method, of class Biotrio.
     */
    @Test
    public void testGetCustomerController() {
        System.out.println("getCustomerController");
        Biotrio instance = new Biotrio();
        CustomerController expResult = null;
        CustomerController result = instance.getCustomerController();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHallCatalog method, of class Biotrio.
     */
    @Test
    public void testGetHallCatalog() {
        System.out.println("getHallCatalog");
        Biotrio instance = new Biotrio();
        HallCatalog expResult = null;
        HallCatalog result = instance.getHallCatalog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderCatalog method, of class Biotrio.
     */
    @Test
    public void testGetOrderCatalog() {
        System.out.println("getOrderCatalog");
        Biotrio instance = new Biotrio();
        OrderCatalog expResult = null;
        OrderCatalog result = instance.getOrderCatalog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTicketCatalog method, of class Biotrio.
     */
    @Test
    public void testGetTicketCatalog() {
        System.out.println("getTicketCatalog");
        Biotrio instance = new Biotrio();
        TicketCatalog expResult = null;
        TicketCatalog result = instance.getTicketCatalog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
