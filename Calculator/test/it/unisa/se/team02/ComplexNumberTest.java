/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.se.team02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Team02
 */
public class ComplexNumberTest {
    
    public ComplexNumberTest() {
        
    }

    /**
     * Test of getReal method, of class ComplexNumber.
     */
    @Test
    public void testGetReal() {
        
        ComplexNumber t1 = new ComplexNumber(1,1);
        assertTrue(t1.getReal() == 1);
  
    }
    

    /**
     * Test of getModule method, of class ComplexNumber.
     */
    @Test
    public void testGetModule() {
     ComplexNumber t1 = new ComplexNumber(1,1);
     Double value = t1.module();
     assertTrue(t1.getModule() == value);
    }

    /**
     * Test of getFi method, of class ComplexNumber.
     */
    @Test
    public void testGetFi() {
        ComplexNumber t1 = new ComplexNumber(1,1);
        double value = t1.fi();
        assertTrue(t1.getFi() == value);
    
    }

    /**
     * Test of setReal method, of class ComplexNumber.
     */
    @Test
    public void testSetReal() {
        ComplexNumber t1 = new ComplexNumber(1,1);
        t1.setReal(5);
        assertTrue(t1.getReal() == 5);
    
    }

    /**
     * Test of getImg method, of class ComplexNumber.
     */
    @Test
    public void testGetImg() {
        
        ComplexNumber t1 = new ComplexNumber(1,1);
        assertTrue(t1.getImg() == 1);
         
    }

    /**
     * Test of setImg method, of class ComplexNumber.
     */
    @Test
    public void testSetImg() {
    
         ComplexNumber t1 = new ComplexNumber(1,1);
        t1.setImg(5);
        assertTrue(t1.getImg()== 5);
    
    }

    /**
     * Test of module method, of class ComplexNumber.
     */
    @Test
    public void testModule() {
        
            ComplexNumber t1 = new ComplexNumber(1,1);
            double ris = Math.sqrt(2);
            assertTrue(t1.module() == ris);
        
    }

    /**
     * Test of fi method, of class ComplexNumber.
     */
    @Test
    public void testFi() {
        ComplexNumber t1 = new ComplexNumber(1,1);
        double ris = Math.atan(1);
        assertTrue(t1.fi() == ris);
    }

    /**
     * Test of multiply method, of class ComplexNumber.
     */
    @Test
    public void testMultiply() {
        ComplexNumber t1 = new ComplexNumber(1,1);
        ComplexNumber t2 = new ComplexNumber(2,2);
        ComplexNumber result = t1.multiply(t2);
        assertTrue((result.getReal() == 0) && (result.getImg() == 4));        
    }

    /**
     * Test of divide method, of class ComplexNumber.
     */
    @Test
    public void testDivide() {
        ComplexNumber t1 = new ComplexNumber(1,1);
        ComplexNumber t2 = new ComplexNumber(2,2);
        ComplexNumber result = t1.divide(t2);
        assertTrue((result.getReal() == 0.5) && (result.getImg() == 0));
    }
    
    
}
