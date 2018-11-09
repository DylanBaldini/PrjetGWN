/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
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
public class HistoryListenerTest {
    
    public HistoryListenerTest() {
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
     * Test of onValueChange method, of class HistoryListener.
     */
    @Test
    public void testOnValueChange() {
        System.out.println("onValueChange");
        ValueChangeEvent<String> event = null;
        HistoryListener instance = new HistoryListener();
        instance.onValueChange(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
