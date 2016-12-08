/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Movie;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class MovieCatalogTest {
    
    public MovieCatalogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addMovie method, of class MovieCatalog.
     */
    @Test
    public void testAddMovie() {
        System.out.println("addMovie");
        Movie movie = null;
        MovieCatalog instance = new MovieCatalog();
        instance.addMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMovieAt method, of class MovieCatalog.
     */
    @Test
    public void testRemoveMovieAt() {
        System.out.println("removeMovieAt");
        int index = 0;
        MovieCatalog instance = new MovieCatalog();
        Movie expResult = null;
        Movie result = instance.removeMovieAt(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class MovieCatalog.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        MovieCatalog instance = new MovieCatalog();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovies method, of class MovieCatalog.
     */
    @Test
    public void testGetMovies() {
        System.out.println("getMovies");
        MovieCatalog instance = new MovieCatalog();
        ArrayList<Movie> expResult = null;
        ArrayList<Movie> result = instance.getMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queryMovie method, of class MovieCatalog.
     */
    @Test
    public void testQueryMovie() {
        System.out.println("queryMovie");
        MovieCatalog instance = new MovieCatalog();
        instance.queryMovie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queryShowing method, of class MovieCatalog.
     */
    @Test
    public void testQueryShowing() {
        System.out.println("queryShowing");
        MovieCatalog instance = new MovieCatalog();
        instance.queryShowing();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class MovieCatalog.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        MovieCatalog instance = new MovieCatalog();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieById method, of class MovieCatalog.
     */
    @Test
    public void testGetMovieById() {
        System.out.println("getMovieById");
        int id = 0;
        MovieCatalog instance = new MovieCatalog();
        Movie expResult = null;
        Movie result = instance.getMovieById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
