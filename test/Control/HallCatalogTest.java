/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Hall;
import Model.Showing;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class HallCatalogTest {
    
    public HallCatalogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of queryHall method, of class HallCatalog.
     */
    @Test
    public void testQueryHall() {
        System.out.println("queryHall");
        HallCatalog instance = new HallCatalog();
        instance.queryHall();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHalls method, of class HallCatalog.
     */
    @Test
    public void testGetHalls() {
        System.out.println("getHalls");
        HallCatalog instance = new HallCatalog();
        ArrayList<Hall> expResult = null;
        ArrayList<Hall> result = instance.getHalls();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHalls method, of class HallCatalog.
     */
    @Test
    public void testSetHalls() {
        System.out.println("setHalls");
        ArrayList<Hall> halls = null;
        HallCatalog instance = new HallCatalog();
        instance.setHalls(halls);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHallByShowing method, of class HallCatalog.
     */
    @Test
    public void testGetHallByShowing() {
        System.out.println("getHallByShowing");
        Showing showing = null;
        HallCatalog instance = new HallCatalog();
        ArrayList<Hall> expResult = null;
        ArrayList<Hall> result = instance.getHallByShowing(showing);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHallById method, of class HallCatalog.
     */
    @Test
    public void testGetHallById() {
        System.out.println("getHallById");
        int id = 0;
        HallCatalog instance = new HallCatalog();
        Hall expResult = null;
        Hall result = instance.getHallById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HallCatalog.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HallCatalog instance = new HallCatalog();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
