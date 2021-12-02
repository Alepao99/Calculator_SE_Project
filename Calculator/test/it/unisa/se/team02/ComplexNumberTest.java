/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.se.team02;

import it.unisa.se.team02.ComplexNumber.CartesianComplex;
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
     * Test of getReal method, of class CartesianComplex.
     */
    @Test
    public void testGetReal() {
        
        CartesianComplex t1 = new CartesianComplex(1,1);
        assertTrue(t1.getReal() == 1);
  
    }
    

    /**
     * Test of getModule method, of class CartesianComplex.
     */
    @Test
    public void testGetModule() {
     
    }

    /**
     * Test of getFi method, of class CartesianComplex.
     */
    @Test
    public void testGetFi() {
      
    }

    /**
     * Test of setReal method, of class CartesianComplex.
     */
    @Test
    public void testSetReal() {
        CartesianComplex t1 = new CartesianComplex(1,1);
        t1.setReal(5);
        assertTrue(t1.getReal() == 5);
    
    }

    /**
     * Test of getImg method, of class CartesianComplex.
     */
    @Test
    public void testGetImg() {
        
        CartesianComplex t1 = new CartesianComplex(1,1);
        assertTrue(t1.getImg() == 1);
         
    }

    /**
     * Test of setImg method, of class CartesianComplex.
     */
    @Test
    public void testSetImg() {
    
         CartesianComplex t1 = new CartesianComplex(1,1);
        t1.setImg(5);
        assertTrue(t1.getImg()== 5);
    
    }

    /**
     * Test of module method, of class CartesianComplex.
     */
    @Test
    public void testModule() {
        
    }

    /**
     * Test of fi method, of class CartesianComplex.
     */
    @Test
    public void testFi() {
        }

    /**
     * Test of multiply method, of class CartesianComplex.
     */
    @Test
    public void testMultiply() {
        CartesianComplex t1 = new CartesianComplex(1,1);
        CartesianComplex t2 = new CartesianComplex(2,2);
        CartesianComplex result = t1.multiply(t2);
        assertTrue((result.getReal() == 0) && (result.getImg() == 4));        
    }

    /**
     * Test of divide method, of class CartesianComplex.
     */
    @Test
    public void testDivide() {
        CartesianComplex t1 = new CartesianComplex(1,1);
        CartesianComplex t2 = new CartesianComplex(2,2);
        CartesianComplex result = t1.divide(t2);
        assertTrue((result.getReal() == 0.5) && (result.getImg() == 0));
    }

    /**
     * Test of toString method, of class CartesianComplex.
     */
    @Test
    public void testToString() {
        CartesianComplex t1 = new CartesianComplex(1,1);
        String s1 = t1.toString();
        String s2 = "(1,000, j1,000)";
        assertTrue(s1.compareTo(s2) == 0);
    }

    /**
     * Test of add method, of class CartesianComplex.
     */
    @Test
    public void testAdd() {
        CartesianComplex t1 = new CartesianComplex(1,1);
        CartesianComplex t2 = new CartesianComplex(2,2);
        CartesianComplex result = t1.add(t2);
        assertTrue((result.getReal() == 3) && (result.getImg() == 3)); 
        
    }

    /**
     * Test of subtract method, of class CartesianComplex.
     */
    @Test
    public void testSubtract() {
        
        CartesianComplex t1 = new CartesianComplex(1,1);
        CartesianComplex t2 = new CartesianComplex(2,2);
        CartesianComplex result = t1.subtract(t2);
        assertTrue((result.getReal() == -1) && (result.getImg() == -1)); 
        
    }

    /**
     * Test of invertSign method, of class CartesianComplex.
     */
    @Test
    public void testInvertSign() {
    
         CartesianComplex t1 = new CartesianComplex(1,1);
        CartesianComplex result = t1.invertSign();
        assertTrue((result.getReal() == -1) && (result.getImg() == -1)); 
    
    }

    /**
     * Test of sqrt method, of class CartesianComplex.
     */
    @Test
    public void testSqrt() {
    }
}
