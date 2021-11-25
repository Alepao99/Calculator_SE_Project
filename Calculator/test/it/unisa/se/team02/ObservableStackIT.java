/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package it.unisa.se.team02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aless
 */
public class ObservableStackIT {

    public ObservableStackIT() {
    }

    @Test
    public void testTop() {
        System.out.println("top");
        ComplexNumber complex1 = new ComplexNumber(1, 1);
        ComplexNumber complex2 = new ComplexNumber(2, 2);
        ObservableStack<ComplexNumber> instance = new ObservableStack();
        instance.add(complex1);
        instance.add(complex2);
        ComplexNumber expResult = complex1;
        ComplexNumber result = instance.top();
        assertEquals(expResult, result);

    }

    /**
     * Test of pop method, of class ObservableStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ComplexNumber complex1 = new ComplexNumber(1, 1);
        ComplexNumber complex2 = new ComplexNumber(2, 2);
        ObservableStack<ComplexNumber> instance = new ObservableStack();
        instance.add(complex1);
        instance.add(complex2);
        ComplexNumber expResult = complex1;
        ComplexNumber result = instance.pop();
        assertEquals(expResult, result);

    }

}
