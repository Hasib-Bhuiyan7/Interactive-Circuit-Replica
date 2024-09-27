/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class ResistorTest {
    
    Node n1 = new Node();
    Node n2 = new Node();
    Resistor r1 = new Resistor(45, n1, n2);
    Node[] nodes = r1.getNodes();
    String output = r1.toString();
    
    public ResistorTest() {
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
     * Test of getNodes method, of class Resistor.
     */
    @Test
    public void testGetNodes() {
        System.out.println("Testing getNodes...");
        Resistor instance = r1;
        Node[] expResult = nodes;
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Resistor.
     */
    @Test
    public void testToString() {
        System.out.println("Testing toString...");
        Resistor instance = r1;
        String expResult = "R2 2 3 45.0";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
