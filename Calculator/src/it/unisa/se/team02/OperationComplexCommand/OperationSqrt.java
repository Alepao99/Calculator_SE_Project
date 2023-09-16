package it.unisa.se.team02.OperationComplexCommand;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.Operation.Operation;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ComplexNumber.ComplexFactory;
import it.unisa.se.team02.ComplexNumber.ComplexType;
import it.unisa.se.team02.ComplexNumber.TrigonometricComplex;
import java.util.List;

/**
 *
 * @author Team02
 */
public class OperationSqrt extends Operation {

    @Override
    public void doOperation(ObservableStack<CartesianComplex> stack) {
        CartesianComplex complex = stack.pop();
        TrigonometricComplex trigcomplex = (TrigonometricComplex) ComplexFactory.createComplex(ComplexType.TRIGONOMETRIC, complex.getReal(), complex.getImg());
        List<CartesianComplex> list = trigcomplex.sqrt();
        String s = "";
        for (CartesianComplex value : list) {
            s += value.toString() + "; ";
            stack.push(value);
        }
    }

}
