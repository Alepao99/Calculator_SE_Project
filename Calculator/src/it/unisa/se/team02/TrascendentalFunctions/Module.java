package it.unisa.se.team02.TrascendentalFunctions;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.Operation.Operation;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ComplexNumber.ComplexFactory;
import it.unisa.se.team02.ComplexNumber.ComplexType;
import it.unisa.se.team02.ComplexNumber.TrigonometricComplex;

/**
 *
 * @author Team02
 */
public class Module extends Operation{

    @Override
    public void doOperation(ObservableStack<CartesianComplex> stack) {
       CartesianComplex complex = stack.pop();
       TrigonometricComplex trigcomplex = (TrigonometricComplex) ComplexFactory.createComplex(ComplexType.TRIGONOMETRIC, complex.getReal(), complex.getImg());
       CartesianComplex result = new CartesianComplex(trigcomplex.module(),0);
       stack.push(result);
    }    
}
