/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

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
public class PourcentageServicelmplTest {
    
    public PourcentageServicelmplTest() {
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
     * Test of CalculEcono method, of class PourcentageServicelmpl.
     */
    @Test
    public void testCalculEcono() {
        System.out.println("CalculEcono");
        Integer montantInit = 50;
        Integer pourcentage = 10;
        PourcentageServicelmpl instance = new PourcentageServicelmpl();
        Double expResult = 45.00;
       
        Double result = instance.CalculEcono(montantInit, pourcentage);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
