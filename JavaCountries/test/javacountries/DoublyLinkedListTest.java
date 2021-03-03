/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacountries;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class DoublyLinkedListTest {
    
    public DoublyLinkedListTest() {
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
     * Test of addNode method, of class DoublyLinkedList.
     */
    @Test
    public void testAddNode() {
        System.out.println("addNode");
        Country country = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addNode(country);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of display method, of class DoublyLinkedList.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
