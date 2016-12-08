/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class SelectMovieGUITest {
    
    public SelectMovieGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of updateMovieTable method, of class SelectMovieGUI.
     */
    @Test
    public void testUpdateMovieTable() {
        System.out.println("updateMovieTable");
        SelectMovieGUI instance = new SelectMovieGUI();
        instance.updateMovieTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SelectMovieGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SelectMovieGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
