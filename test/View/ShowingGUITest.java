/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Movie;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class ShowingGUITest {
    
    public ShowingGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of updateShowingByMovieTable method, of class ShowingGUI.
     */
    @Test
    public void testUpdateShowingByMovieTable() {
        System.out.println("updateShowingByMovieTable");
        Movie movie = null;
        ShowingGUI instance = new ShowingGUI();
        instance.updateShowingByMovieTable(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ShowingGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ShowingGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
