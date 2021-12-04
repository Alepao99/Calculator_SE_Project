/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.Main.VariablesActions;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import java.util.Map;
import javafx.scene.control.Button;

/**
 *
 * @author Team02
 */
public class Greater implements Operation {

    @Override
    public boolean execute(ObservableStack<CartesianComplex> stack, Button x, Map<Button, CartesianComplex> map) {
        map.put(x, stack.peek());
        return true;
    }

}