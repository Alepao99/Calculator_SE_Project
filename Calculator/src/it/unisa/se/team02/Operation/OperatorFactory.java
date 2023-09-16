package it.unisa.se.team02.Operation;

import it.unisa.se.team02.VariablesActions.SubVar;
import it.unisa.se.team02.VariablesActions.Minor;
import it.unisa.se.team02.VariablesActions.SumVar;
import it.unisa.se.team02.VariablesActions.Greater;
import it.unisa.se.team02.OperationComplexCommand.OperationMultiply;
import it.unisa.se.team02.OperationComplexCommand.OperationSub;
import it.unisa.se.team02.OperationComplexCommand.OperationDivision;
import it.unisa.se.team02.OperationComplexCommand.OperationAdd;
import it.unisa.se.team02.ManipulationCommand.Over;
import it.unisa.se.team02.ManipulationCommand.Swap;
import it.unisa.se.team02.ManipulationCommand.Dup;
import it.unisa.se.team02.ManipulationCommand.Drop;
import it.unisa.se.team02.ManipulationCommand.Clear;
import it.unisa.se.team02.OperationComplexCommand.OperationInverterSign;
import it.unisa.se.team02.OperationComplexCommand.OperationSqrt;
import it.unisa.se.team02.TrascendentalFunctions.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Team02
 */
public class OperatorFactory {

    static private Map<String, Operation> operationMap = new HashMap<>();

    static {
        //handleOperationCommand
        operationMap.put("drop", new Drop());
        operationMap.put("dup", new Dup());
        operationMap.put("swap", new Swap());
        operationMap.put("over", new Over());
        operationMap.put("clear", new Clear());

        operationMap.put("add", new OperationAdd());
        operationMap.put("sub", new OperationSub());
        operationMap.put("division", new OperationDivision());
        operationMap.put("sqrt", new OperationSqrt());
        operationMap.put("inverterSign", new OperationInverterSign());
        operationMap.put("multi", new OperationMultiply());

        operationMap.put("greater", new Greater());
        operationMap.put("minor", new Minor());
        operationMap.put("sumVar", new SumVar());
        operationMap.put("subVar", new SubVar());

        operationMap.put("acos", new Acos());
        operationMap.put("arg", new Arg());
        operationMap.put("asin", new Asin());
        operationMap.put("atan", new Atan());

        operationMap.put("cos", new Cos());
        operationMap.put("exp", new Exp());
        operationMap.put("log", new Log());
        operationMap.put("mod", new Module());

        operationMap.put("pow", new Pow());
        operationMap.put("sin", new Sin());
        operationMap.put("tan", new Tan());

    }

    public void setOperation(String operator, Menu menu) {
        menu.setCommand(operator, operationMap.get(operator));
    }

    public void setOperationVariables(String operator, Menu menu) {
        menu.setCommand(operator);
    }

}
