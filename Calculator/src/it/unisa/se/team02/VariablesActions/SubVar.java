package it.unisa.se.team02.VariablesActions;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.Operation.Azione;
import it.unisa.se.team02.Operation.Menu;
import it.unisa.se.team02.Operation.Operation;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import java.util.Map;

/**
 *
 * @author Team02
 */
public class SubVar extends Operation {

    @Override
    public char executeVariable(ObservableStack<CartesianComplex> stack, Map<Character, CartesianComplex> map, Menu menu) {
        Azione azione = menu.takeAction();
        char y = azione.getOp().charAt(0);
        CartesianComplex[] complexSub = {stack.peek(), map.get(y)};
        map.put(y, complexSub[0].subtract(complexSub[1]));
        return y;
    }
    
    
}
