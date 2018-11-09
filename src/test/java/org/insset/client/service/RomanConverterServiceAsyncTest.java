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
public class RomanConverterServiceAsyncTest {
    
    public RomanConverterServiceAsyncTest() {
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
     * Test of convertRomanToArabe method, of class RomanConverterServiceAsync.
     */
    @Test
    public void testConvertRomanToArabe() {
        System.out.println("convertRomanToArabe");
        String nbr = "";
        AsyncCallback<Integer> callback = null;
        RomanConverterServiceAsync instance = new RomanConverterServiceAsyncImpl();
        instance.convertRomanToArabe(nbr, callback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceAsync.
     */
    @Test
    public void testConvertArabeToRoman() {
        System.out.println("convertArabeToRoman");
        Integer nbr = null;
        AsyncCallback<String> callback = null;
        RomanConverterServiceAsync instance = new RomanConverterServiceAsyncImpl();
        instance.convertArabeToRoman(nbr, callback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertDateYears method, of class RomanConverterServiceAsync.
     */
    @Test
    public void testConvertDateYears() {
        System.out.println("convertDateYears");
        String nbr = "";
        AsyncCallback<String> callback = null;
        RomanConverterServiceAsync instance = new RomanConverterServiceAsyncImpl();
        instance.convertDateYears(nbr, callback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RomanConverterServiceAsyncImpl implements RomanConverterServiceAsync {

        public void convertRomanToArabe(String nbr, AsyncCallback<Integer> callback) {
        }

        public void convertArabeToRoman(Integer nbr, AsyncCallback<String> callback) {
        }

        public void convertDateYears(String nbr, AsyncCallback<String> callback) {
        }
    }
    
}
