/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.se.team02;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Team02
 */
public class ObservableStackIT {

    public ObservableStackIT() {
    }

    @Test
    public void testTop() {
        System.out.println("top");
        CartesianComplex complex1 = new CartesianComplex(1, 1);
        CartesianComplex complex2 = new CartesianComplex(2, 2);
        ObservableStack<CartesianComplex> instance = new ObservableStack();
        instance.add(complex1);
        instance.add(complex2);
        CartesianComplex expResult = complex1;
        CartesianComplex result = instance.top();
        assertEquals(expResult, result);

    }

    /**
     * Test of pop method, of class ObservableStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        CartesianComplex complex1 = new CartesianComplex(1, 1);
        CartesianComplex complex2 = new CartesianComplex(2, 2);
        ObservableStack<CartesianComplex> instance = new ObservableStack();
        instance.add(complex1);
        instance.add(complex2);
        CartesianComplex expResult = complex1;
        CartesianComplex result = instance.pop();
        assertEquals(expResult, result);

    }

}
