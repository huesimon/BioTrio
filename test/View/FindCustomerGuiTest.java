/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Customer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class FindCustomerGuiTest {
    
    public FindCustomerGuiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of updateMovieTable method, of class FindCustomerGui.
     */
    @Test
    public void testUpdateMovieTable() {
        System.out.println("updateMovieTable");
        FindCustomerGui instance = new FindCustomerGui();
        instance.fillTableWithCustomers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTableByCustomer method, of class FindCustomerGui.
     */
    @Test
    public void testUpdateTableByCustomer() {
        System.out.println("updateTableByCustomer");
        Customer customer = null;
        FindCustomerGui instance = new FindCustomerGui();
        instance.updateTableByCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTableByALL method, of class FindCustomerGui.
     */
    @Test
    public void testUpdateTableByALL() {
        System.out.println("updateTableByALL");
        Customer customer = null;
        FindCustomerGui instance = new FindCustomerGui();
        instance.updateTableByALL(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
