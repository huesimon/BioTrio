/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Showing;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class SeatBookingGUITest {
    
    public SeatBookingGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkSeat method, of class SeatBookingGUI.
     */
    @Test
    public void testCheckSeat() {
        System.out.println("checkSeat");
        int rowNo = 0;
        int seatNo = 0;
        SeatBookingGUI instance = new SeatBookingGUI();
        boolean expResult = false;
        boolean result = instance.checkSeat(rowNo, seatNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSeatTable method, of class SeatBookingGUI.
     */
    @Test
    public void testUpdateSeatTable() {
        System.out.println("updateSeatTable");
        Showing showing = null;
        SeatBookingGUI instance = new SeatBookingGUI();
        instance.updateSeatTable(showing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
