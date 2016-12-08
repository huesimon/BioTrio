/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Movie;
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
public class ShowingCatalogTest {
    
    public ShowingCatalogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addShowing method, of class ShowingCatalog.
     */
    @Test
    public void testAddShowing() {
        System.out.println("addShowing");
        Showing showing = null;
        ShowingCatalog instance = null;
        instance.addShowing(showing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeShowingAt method, of class ShowingCatalog.
     */
    @Test
    public void testRemoveShowingAt() {
        System.out.println("removeShowingAt");
        int index = 0;
        ShowingCatalog instance = null;
        Showing expResult = null;
        Showing result = instance.removeShowingAt(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShowings method, of class ShowingCatalog.
     */
    @Test
    public void testGetShowings() {
        System.out.println("getShowings");
        ShowingCatalog instance = null;
        ArrayList<Showing> expResult = null;
        ArrayList<Showing> result = instance.getShowings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class ShowingCatalog.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        ShowingCatalog instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queryShowings method, of class ShowingCatalog.
     */
    @Test
    public void testQueryShowings() {
        System.out.println("queryShowings");
        ShowingCatalog instance = null;
        instance.queryShowings();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editShowing method, of class ShowingCatalog.
     */
    @Test
    public void testEditShowing() {
        System.out.println("editShowing");
        String date = "";
        int showing_id = 0;
        ShowingCatalog instance = null;
        instance.editShowing(date, showing_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeShowing method, of class ShowingCatalog.
     */
    @Test
    public void testRemoveShowing() {
        System.out.println("removeShowing");
        String date = "";
        int hall = 0;
        ShowingCatalog instance = null;
        instance.removeShowing(date, hall);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShowingsByMovie method, of class ShowingCatalog.
     */
    @Test
    public void testGetShowingsByMovie() {
        System.out.println("getShowingsByMovie");
        Movie movie = null;
        ShowingCatalog instance = null;
        ArrayList<Showing> expResult = null;
        ArrayList<Showing> result = instance.getShowingsByMovie(movie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShowingById method, of class ShowingCatalog.
     */
    @Test
    public void testGetShowingById() {
        System.out.println("getShowingById");
        int id = 0;
        ShowingCatalog instance = null;
        Showing expResult = null;
        Showing result = instance.getShowingById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
