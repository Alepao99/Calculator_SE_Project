/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.TrascendentalFunctions;

import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.Operation.Operation;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ComplexNumber.TrigonometricComplex;

/**
 *
 * @author Team02
 */
public class Log extends Operation{

    @Override
    public void doOperation(ObservableStack<CartesianComplex> stack) {
        TrigonometricComplex complex = new TrigonometricComplex(stack.pop().getReal(),stack.pop().getImg());
        stack.push(complex.log());
    }    
    
}