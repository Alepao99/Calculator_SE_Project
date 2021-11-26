/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.se.team02;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * Test of toString method, of class ComplexNumber.
     */
    @Test
    public void testToString() {
        ComplexNumber t1 = new ComplexNumber(1,1);
        String s1 = t1.toString();
        String s2 = "(1,000, j1,000)";
        assertTrue(s1.compareTo(s2) == 0);
    }

    /**
     * Test of add method, of class ComplexNumber.
     */
    @Test
    public void testAdd() {
        ComplexNumber t1 = new ComplexNumber(1,1);
        ComplexNumber t2 = new ComplexNumber(2,2);
        ComplexNumber result = t1.add(t2);
        assertTrue((result.getReal() == 3) && (result.getImg() == 3)); 
        
    }

    /**
     * Test of subtract method, of class ComplexNumber.
     */
    @Test
    public void testSubtract() {
        
        ComplexNumber t1 = new ComplexNumber(1,1);
        ComplexNumber t2 = new ComplexNumber(2,2);
        ComplexNumber result = t1.subtract(t2);
        assertTrue((result.getReal() == -1) && (result.getImg() == -1)); 
        
    }

    /**
     * Test of invertSign method, of class ComplexNumber.
     */
    @Test
    public void testInvertSign() {
    
         ComplexNumber t1 = new ComplexNumber(1,1);
        ComplexNumber result = t1.invertSign();
        assertTrue((result.getReal() == -1) && (result.getImg() == -1)); 
    
    }

    /**
     * Test of sqrt method, of class ComplexNumber.
     */
    @Test
    public void testSqrt() {
        ComplexNumber t1 = new ComplexNumber(2,3);
        List<ComplexNumber> list = t1.sqrt();
        ComplexNumber r1 = list.get(0);
        ComplexNumber r2 = list.get(1);

        String real1 = String.valueOf(r1.getReal());
        real1= real1.substring(0, 5);
        String img1= String.valueOf(r1.getImg());
        img1=img1.substring(0,5);
        String real2 = String.valueOf(r2.getReal());
        real2= real2.substring(0, 6);
        String img2= String.valueOf(r2.getImg());
        img2=img2.substring(0,6);

        assertTrue(real1.compareTo("1.674") == 0);
        assertTrue(real2.compareTo("-1.674") == 0);
        assertTrue(img1.compareTo("0.895") == 0);
        assertTrue(img2.compareTo("-0.895") == 0);
    }

}
