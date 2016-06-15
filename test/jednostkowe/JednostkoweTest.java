/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jednostkowe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class JednostkoweTest {
    
    public JednostkoweTest() {
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
     * Test of main method, of class Jednostkowe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Jednostkowe.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Jednostkowe.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        Jednostkowe instance = new Jednostkowe();
        int expResult = 4;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        Jednostkowe instance = new Jednostkowe();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testAdd3() {
        System.out.println("add");
        String s1 = "asd";
        String s2 = "3";
        Jednostkowe instance = new Jednostkowe();
        int expResult = 0;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
        
    }
    
}
