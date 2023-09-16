package it.unisa.se.team02.OperationComplexCommand;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.Operation.Operation;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;

/**
 *
 * @author Team02
 */
public class OperationAdd extends Operation {

    @Override
    public void doOperation(ObservableStack<CartesianComplex> stack) {
        CartesianComplex[] complex = {stack.pop(),stack.pop()};
        stack.push(complex[0].add(complex[1]));
    }

}
