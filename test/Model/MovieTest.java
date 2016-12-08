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
public class MovieTest {
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTitel method, of class Movie.
     */
    @Test
    public void testGetTitel() {
        System.out.println("getTitel");
        Movie instance = null;
        String expResult = "";
        String result = instance.getTitel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitel method, of class Movie.
     */
    @Test
    public void testSetTitel() {
        System.out.println("setTitel");
        String name = "";
        Movie instance = null;
        instance.setTitel(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Movie.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Movie instance = null;
        String expResult = "";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class Movie.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "";
        Movie instance = null;
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovie_id method, of class Movie.
     */
    @Test
    public void testGetMovie_id() {
        System.out.println("getMovie_id");
        Movie instance = null;
        int expResult = 0;
        int result = instance.getMovie_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMovie_id method, of class Movie.
     */
    @Test
    public void testSetMovie_id() {
        System.out.println("setMovie_id");
        int movie_id = 0;
        Movie instance = null;
        instance.setMovie_id(movie_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Movie.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Movie instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
