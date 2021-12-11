package it.unisa.se.team02;

import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ObservableStack.ObservableStack;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



/**
 *
 * @author Team02
 */
public class ObservableStackIT {

    public ObservableStackIT() {
    }
    /**
     * Test of peek method, of class ObservableStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        CartesianComplex complex1 = new CartesianComplex(1, 1);
        CartesianComplex complex2 = new CartesianComplex(2, 2);
        ObservableStack<CartesianComplex> instance = new ObservableStack();
        instance.push(complex1);
        instance.push(complex2);
        CartesianComplex expResult = complex2;
        CartesianComplex result = instance.peek();
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
        instance.push(complex1);
        instance.push(complex2);
        CartesianComplex expResult = complex2;
        CartesianComplex result = instance.pop();
        assertEquals(expResult, result);

    }

    /**
     * Test of push method, of class ObservableStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        CartesianComplex complex1 = new CartesianComplex(1, 1);
        ObservableStack<CartesianComplex> instance = new ObservableStack();
        instance.push(complex1);
        CartesianComplex expResult = complex1;
        CartesianComplex result = instance.pop();
        assertEquals(expResult, result);

    }

    /**
     * Test of swap method, of class ObservableStack.
     */
    @Test
    public void testSwap() {
        System.out.println("Swap");
        CartesianComplex complex1 = new CartesianComplex(1, 1);
        CartesianComplex complex2 = new CartesianComplex(2, 2);
        ObservableStack<CartesianComplex> instance = new ObservableStack();
        instance.push(complex1);
        instance.push(complex2);
        instance.swap();
        CartesianComplex result = instance.pop();
        CartesianComplex result1 = instance.pop();
        assertEquals(complex1, result);
        assertEquals(complex2, result1);

    }

    /**
     * Test of drop method, of class ObservableStack.
     */
    @Test
    public void testDrop() {
        ObservableStack<CartesianComplex> instance = new ObservableStack();
        CartesianComplex complex1 = new CartesianComplex(1, 1);
        instance.push(complex1);
        CartesianComplex result = instance.pop();
        assertEquals(complex1, result);
    }

    /**
     * Test of over method, of class ObservableStack.
     */
    @Test
    public void testOver() {
        System.out.println("Over");
        CartesianComplex complex1 = new CartesianComplex(1, 1);
        CartesianComplex complex2 = new CartesianComplex(2, 2);
        ObservableStack<CartesianComplex> instance = new ObservableStack();
        instance.push(complex1);
        instance.push(complex2);
        instance.over();
        CartesianComplex result = instance.peek();
        assertEquals(complex1, result);

    }

    /**
     * Test of Dup method, of class ObservableStack.
     */
    @Test
    public void testDup() {
        System.out.println("Dup");
        CartesianComplex complex1 = new CartesianComplex(1, 1);
        ObservableStack<CartesianComplex> instance = new ObservableStack();
        instance.push(complex1);
        instance.dup();
        CartesianComplex result = instance.peek();
        assertEquals(complex1, result);
    }

}
