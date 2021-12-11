/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.FunctionStoreLoad;

import it.unisa.se.team02.Operation.UserFunction;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author aless
 */
public class ContextFunction {

    private Strategy strategy;

    public ContextFunction(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(ObservableList<UserFunction> functionK, AnchorPane rootPane) {
         strategy.doOperation(functionK, rootPane);
    }
}
