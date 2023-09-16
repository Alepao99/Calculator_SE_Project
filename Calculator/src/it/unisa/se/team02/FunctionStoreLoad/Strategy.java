package it.unisa.se.team02.FunctionStoreLoad;

import it.unisa.se.team02.Operation.UserFunction;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Team02
 */
public interface Strategy {
    public void doOperation(ObservableList<UserFunction> functionK, AnchorPane rootPane);
}
