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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author talend
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.insset.client.service.PourcentageServiceTest.class, org.insset.client.service.PourcentageServiceAsyncTest.class, org.insset.client.service.RomanConverterServiceAsyncTest.class, org.insset.client.service.RomanConverterServiceTest.class, org.insset.client.service.ExempleServiceTest.class, org.insset.client.service.IntergerTest.class, org.insset.client.service.ExempleServiceAsyncTest.class})
public class ServiceSuite {

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
