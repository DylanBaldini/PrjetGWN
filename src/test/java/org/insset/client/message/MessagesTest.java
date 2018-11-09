/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.message;

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
public class MessagesTest {
    
    public MessagesTest() {
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
     * Test of nameField method, of class Messages.
     */
    @Test
    public void testNameField() {
        System.out.println("nameField");
        Messages instance = new MessagesImpl();
        String expResult = "";
        String result = instance.nameField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendButton method, of class Messages.
     */
    @Test
    public void testSendButton() {
        System.out.println("sendButton");
        Messages instance = new MessagesImpl();
        String expResult = "";
        String result = instance.sendButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MessagesImpl implements Messages {

        public String nameField() {
            return "";
        }

        public String sendButton() {
            return "";
        }
    }
    
}
