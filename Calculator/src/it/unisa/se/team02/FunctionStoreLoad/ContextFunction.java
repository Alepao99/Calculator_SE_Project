package it.unisa.se.team02.FunctionStoreLoad;

import it.unisa.se.team02.Operation.UserFunction;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Team02
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
