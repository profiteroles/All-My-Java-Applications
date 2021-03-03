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
public class CountryTest {
    
    public CountryTest() {
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
     * Test of main method, of class Country.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Country.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCountryName method, of class Country.
     */
    @Test
    public void testGetCountryName() {
        System.out.println("getCountryName");
        Country instance = new Country();
        String expResult = "";
        String result = instance.getCountryName();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCountryName method, of class Country.
     */
    @Test
    public void testSetCountryName() {
        System.out.println("setCountryName");
        String countryName = "";
        Country instance = new Country();
        instance.setCountryName(countryName);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
