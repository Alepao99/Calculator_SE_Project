package it.unisa.se.team02.TrascendentalFunctions;

import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ComplexNumber.ComplexFactory;
import it.unisa.se.team02.ComplexNumber.ComplexType;
import it.unisa.se.team02.ComplexNumber.TrigonometricComplex;
import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.Operation.Operation;

/**
 *
 * @author Team02
 */
public class Asin extends Operation{

    @Override
    public void doOperation(ObservableStack<CartesianComplex> stack) {
        CartesianComplex complex = stack.pop(); 
        TrigonometricComplex trigcomplex = (TrigonometricComplex) ComplexFactory.createComplex(ComplexType.TRIGONOMETRIC, complex.getReal(), complex.getImg());
        CartesianComplex result = trigcomplex.asin();
        stack.push(result);
   

    }
    
}
