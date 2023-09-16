package it.unisa.se.team02.OperationComplexCommand;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.Operation.Operation;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;

/**
 *
 * @author Team02
 */
public class OperationSub extends Operation {

    @Override
    public void doOperation(ObservableStack stack) {
        CartesianComplex[] complex = {(CartesianComplex) stack.pop(), (CartesianComplex) stack.pop()};
        stack.push(complex[0].subtract(complex[1]));
    }

}
