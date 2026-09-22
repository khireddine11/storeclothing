/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JARGON
 */
public class PosContollerTest {
    
    public PosContollerTest() {
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
     * Test of initialize method, of class PosContoller.
     */
//    @Test
//    public void testInitialize() {
//        System.out.println("initialize");
//        URL url = null;
//        ResourceBundle rb = null;
//        PosContoller instance = new PosContoller();
//        instance.initialize(url, rb);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of returnProduct method, of class PosContoller.
//     */
//    @Test
//    public void testReturnProduct() {
//        System.out.println("returnProduct");
//        KeyEvent keyEvent = null;
//        PosContoller instance = new PosContoller();
//        instance.returnProduct(keyEvent);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of updatePosItemObject method, of class PosContoller.
     */
    @Test
    public void testUpdatePosItemObject() {
        System.out.println("updatePosItemObject");
        String barecode = "9900060002505";
        PosContoller instance = new PosContoller();
        instance.updatePosItemObject(barecode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkItemExists method, of class PosContoller.
     */
//    @Test
//    public void testCheckItemExists() {
//        System.out.println("checkItemExists");
//        String barCode = "";
//        PosContoller instance = new PosContoller();
//        boolean expResult = false;
//        boolean result = instance.checkItemExists(barCode);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addtoCard method, of class PosContoller.
//     */
//    @Test
//    public void testAddtoCard() {
//        System.out.println("addtoCard");
//        ActionEvent event = null;
//        PosContoller instance = new PosContoller();
//        instance.addtoCard(event);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of initPOSTableView method, of class PosContoller.
//     */
//    @Test
//    public void testInitPOSTableView() {
//        System.out.println("initPOSTableView");
//        PosContoller instance = new PosContoller();
//        instance.initPOSTableView();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setupTotalBinding method, of class PosContoller.
//     */
//    @Test
//    public void testSetupTotalBinding() {
//        System.out.println("setupTotalBinding");
//        PosContoller instance = new PosContoller();
//        instance.setupTotalBinding();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
