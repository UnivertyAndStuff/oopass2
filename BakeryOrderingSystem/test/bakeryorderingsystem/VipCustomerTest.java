/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bakeryorderingsystem;

import BakeryOrderingSystem.VipCustomer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class VipCustomerTest {
    
    public VipCustomerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addPoints method, of class VipCustomer.
     */
    @Test
    public void testAddPoints() {
        System.out.println("addPoints");
        int points = 0;
        VipCustomer instance = null;
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
        VipCustomer instance = null;
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
        VipCustomer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscountRate method, of class VipCustomer.
     */
    @Test
    public void testGetDiscountRate() {
        System.out.println("getDiscountRate");
        VipCustomer instance = null;
        double expResult = 0.0;
        double result = instance.getDiscountRate();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
