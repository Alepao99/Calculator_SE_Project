package it.unisa.se.team02.Operation;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author Team02
 */
public abstract class Operation implements Serializable{

    public void doOperation(ObservableStack<CartesianComplex> stack) {
    }

     public void doOperation(ObservableStack<CartesianComplex> stack, int n) {
    }

    
    public char executeVariable(ObservableStack<CartesianComplex> stack, Map<Character, CartesianComplex> map, Menu menu) {
        return 0;
    }
}