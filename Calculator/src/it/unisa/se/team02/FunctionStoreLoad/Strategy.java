/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package it.unisa.se.team02.FunctionStoreLoad;

import it.unisa.se.team02.Operation.UserFunction;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author aless
 */
public interface Strategy {
    public void doOperation(ObservableList<UserFunction> functionK, AnchorPane rootPane);
}
