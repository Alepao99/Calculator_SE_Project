/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.Main.VariablesActions;

import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ObservableStack.ObservableStack;
import java.util.Map;
import javafx.scene.control.Button;

/**
 *
 * @author Francesco
 */
public class Minor implements Operation{

    @Override
    public boolean execute(ObservableStack<CartesianComplex> stack, Button x, Map<Button, CartesianComplex> map) {
        stack.push(map.get(x));
        return true;
    
    }
    
}
