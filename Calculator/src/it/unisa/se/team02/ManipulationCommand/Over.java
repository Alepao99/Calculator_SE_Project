package it.unisa.se.team02.ManipulationCommand;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.Operation.Operation;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;

/**
 *
 * @author Team02
 */
public class Over extends Operation{

    @Override
    public void doOperation(ObservableStack<CartesianComplex> stack) {
        stack.over();
    }
}
