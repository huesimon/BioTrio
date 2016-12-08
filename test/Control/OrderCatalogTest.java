/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Order;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class OrderCatalogTest {
    
    public OrderCatalogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of returnLatestOrder method, of class OrderCatalog.
     */
    @Test
    public void testReturnLatestOrder() {
        System.out.println("returnLatestOrder");
        OrderCatalog instance = null;
        Order expResult = null;
        Order result = instance.returnLatestOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queryOrders method, of class OrderCatalog.
     */
    @Test
    public void testQueryOrders() {
        System.out.println("queryOrders");
        OrderCatalog instance = null;
        instance.queryOrders();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertOrder method, of class OrderCatalog.
     */
    @Test
    public void testInsertOrder() {
        System.out.println("insertOrder");
        int customer_id = 0;
        OrderCatalog instance = null;
        instance.insertOrder(customer_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderByCustomerId method, of class OrderCatalog.
     */
    @Test
    public void testGetOrderByCustomerId() {
        System.out.println("getOrderByCustomerId");
        int id = 0;
        OrderCatalog instance = null;
        Order expResult = null;
        Order result = instance.getOrderByCustomerId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
