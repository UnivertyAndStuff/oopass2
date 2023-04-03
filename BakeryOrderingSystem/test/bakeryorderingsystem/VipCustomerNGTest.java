/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package bakeryorderingsystem;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author user
 */
public class VipCustomerNGTest {
    
    public VipCustomerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of addPoints method, of class VipCustomer.
     */
    @Test
    public void testAddPoints() {
        System.out.println("addPoints");
        int points = 0;
        BakeryOrderingSystem.VipCustomer instance = null;
        instance.addPoints(points);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redeemPoints method, of class VipCustomer.
     */
    @Test
    public void testRedeemPoints() {
        System.out.println("redeemPoints");
        int points = 0;
        BakeryOrderingSystem.VipCustomer instance = null;
        instance.redeemPoints(points);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class VipCustomer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BakeryOrderingSystem.VipCustomer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscountRate method, of class VipCustomer.
     */
    @Test
    public void testGetDiscountRate() {
        System.out.println("getDiscountRate");
        BakeryOrderingSystem.VipCustomer instance = null;
        double expResult = 0.0;
        double result = instance.getDiscountRate();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
