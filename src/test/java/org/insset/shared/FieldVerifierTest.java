/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class FieldVerifierTest {
    
    public FieldVerifierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidName() {
        System.out.println("isValidName");
        String name = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidMontant method, of class FieldVerifier.
     */
    @Test
    public void testIsValidMontant() {
        System.out.println("isValidMontant");
        int montantInit = 999999990;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidMontant(montantInit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    
     /**
     * Test of isValidMontant method, of class FieldVerifier.
     */
    @Test
    public void testIsValidMontantTrue() {
        System.out.println("isValidMontant");
        int montantInit = 2000;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidMontant(montantInit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    

    /**
     * Test of isValidPourcentage method, of class FieldVerifier.
     */
    @Test
    public void testIsValidPourcentage() {
        System.out.println("isValidPourcentage");
        int pourcentage = 101;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidPourcentage(pourcentage);
        System.out.println(result);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    
   /*
     * Test of isValidPourcentage method, of class FieldVerifier.
     */
    @Test
    public void testIsValidPourcentageTrue() {
        System.out.println("isValidPourcentage");
        int pourcentage = 20;
        boolean expResult = true;
        boolean result = org.insset.shared.FieldVerifier.isValidPourcentage(pourcentage);
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimal() {
        System.out.println("isValidDecimal");
        Integer nbr = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRoman() {
        System.out.println("isValidRoman");
        String nbr = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String date = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
