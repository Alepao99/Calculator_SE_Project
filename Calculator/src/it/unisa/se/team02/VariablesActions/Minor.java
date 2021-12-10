/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Minor extends Operation {

    @Override
    public char executeVariable(ObservableStack<CartesianComplex> stack, Map<Character, CartesianComplex> map, Menu menu) {
        Azione azione = menu.takeAction();
        char y = azione.getOp().charAt(0);
        stack.push(map.get(y));
        return y;
    }
}

