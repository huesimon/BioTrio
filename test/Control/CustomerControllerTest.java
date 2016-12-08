/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Customer;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class CustomerControllerTest {
    
    public CustomerControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of queryCustomers method, of class CustomerController.
     */
    @Test
    public void testQueryCustomers() {
        System.out.println("queryCustomers");
        CustomerController instance = new CustomerController();
        instance.queryCustomers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queryCustomerByPhone method, of class CustomerController.
     */
    @Test
    public void testQueryCustomerByPhone() {
        System.out.println("queryCustomerByPhone");
        String phone = "";
        CustomerController instance = new CustomerController();
        instance.queryCustomerByPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertCustomer method, of class CustomerController.
     */
    @Test
    public void testInsertCustomer() {
        System.out.println("insertCustomer");
        String name = "";
        String phone = "";
        CustomerController instance = new CustomerController();
        instance.insertCustomer(name, phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomers method, of class CustomerController.
     */
    @Test
    public void testGetCustomers() {
        System.out.println("getCustomers");
        CustomerController instance = new CustomerController();
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class CustomerController.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        CustomerController instance = new CustomerController();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLatestCustomer method, of class CustomerController.
     */
    @Test
    public void testReturnLatestCustomer() {
        System.out.println("returnLatestCustomer");
        CustomerController instance = new CustomerController();
        Customer expResult = null;
        Customer result = instance.returnLatestCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerByPhone method, of class CustomerController.
     */
    @Test
    public void testGetCustomerByPhone() {
        System.out.println("getCustomerByPhone");
        String phone = "";
        CustomerController instance = new CustomerController();
        Customer expResult = null;
        Customer result = instance.getCustomerByPhone(phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomers method, of class CustomerController.
     */
    @Test
    public void testSetCustomers() {
        System.out.println("setCustomers");
        ArrayList<Customer> customers = null;
        CustomerController instance = new CustomerController();
        instance.setCustomers(customers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerById method, of class CustomerController.
     */
    @Test
    public void testGetCustomerById() {
        System.out.println("getCustomerById");
        int id = 0;
        CustomerController instance = new CustomerController();
        Customer expResult = null;
        Customer result = instance.getCustomerById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
