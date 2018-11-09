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
public class ExempleServiceAsyncTest {
    
    public ExempleServiceAsyncTest() {
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
     * Test of inverserChaine method, of class ExempleServiceAsync.
     */
    @Test
    public void testInverserChaine() {
        System.out.println("inverserChaine");
        String name = "";
        AsyncCallback<String> callback = null;
        ExempleServiceAsync instance = new ExempleServiceAsyncImpl();
        instance.inverserChaine(name, callback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ExempleServiceAsyncImpl implements ExempleServiceAsync {

        public void inverserChaine(String name, AsyncCallback<String> callback) {
        }
    }
    
}
