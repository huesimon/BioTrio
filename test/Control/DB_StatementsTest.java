/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simon_
 */
public class DB_StatementsTest {
    
    public DB_StatementsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of queryPerson method, of class DB_Statements.
     */
    @Test
    public void testQueryPerson() {
        System.out.println("queryPerson");
        DB_Statements instance = new DB_Statements();
        instance.queryPerson();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editShowing method, of class DB_Statements.
     */
    @Test
    public void testEditShowing() {
        System.out.println("editShowing");
        String date = "";
        int showing_id = 0;
        DB_Statements instance = new DB_Statements();
        instance.editShowing(date, showing_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
