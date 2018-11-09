/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author talend
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.insset.client.HistoryListenerTest.class, org.insset.client.message.MessageSuite.class, org.insset.client.calculatorInssetTest.class, org.insset.client.menu.MenuSuite.class, org.insset.client.exemple.ExempleSuite.class, org.insset.client.calculator.CalculatorSuite.class, org.insset.client.service.ServiceSuite.class})
public class ClientSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
