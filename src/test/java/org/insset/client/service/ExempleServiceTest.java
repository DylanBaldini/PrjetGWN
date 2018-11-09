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
public class ExempleServiceTest {
    
    public ExempleServiceTest() {
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
     * Test of inverserChaine method, of class ExempleService.
     */
    @Test
    public void testInverserChaine() {
        System.out.println("inverserChaine");
        String name = "";
        ExempleService instance = new ExempleServiceImpl();
        String expResult = "";
        String result = instance.inverserChaine(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ExempleServiceImpl implements ExempleService {

        public String inverserChaine(String name) throws IllegalArgumentException {
            return "";
        }
    }
    
}
