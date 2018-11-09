/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

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
public class PourcentageServiceTest {
    
    public PourcentageServiceTest() {
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
     * Test of CalculEcono method, of class PourcentageService.
     */
    @Test
    public void testCalculEcono() {
        System.out.println("CalculEcono");
        Integer montantInit = null;
        Integer pourcentage = null;
        PourcentageService instance = new PourcentageServiceImpl();
        Double expResult = null;
        Double result = instance.CalculEcono(montantInit, pourcentage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PourcentageServiceImpl implements PourcentageService {

        public Double CalculEcono(Integer montantInit, Integer pourcentage) {
            return null;
        }
    }
    
}
