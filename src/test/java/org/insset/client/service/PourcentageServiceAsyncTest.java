/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
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
public class PourcentageServiceAsyncTest {
    
    public PourcentageServiceAsyncTest() {
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
     * Test of CalculEcono method, of class PourcentageServiceAsync.
     */
    @Test
    public void testCalculEcono() {
        System.out.println("CalculEcono");
        Integer montantInit =25;
        Integer pourcentage = 10;
        AsyncCallback<Integer> callback = null;
        PourcentageServiceAsync instance = new PourcentageServiceAsyncImpl();
        instance.CalculEcono(montantInit, pourcentage, callback);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    public class PourcentageServiceAsyncImpl implements PourcentageServiceAsync {

        public void CalculEcono(Integer montantInit, Integer pourcentage, AsyncCallback<Integer> callback) {
        }
    }
    
}
