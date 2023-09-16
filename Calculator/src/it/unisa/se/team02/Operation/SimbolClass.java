package it.unisa.se.team02.Operation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Team02
 */
public class SimbolClass {

    static private Map<String, String> simbolMap = new HashMap<>();

    static {
        //handleOperationCommand
        simbolMap.put("drop", "drop");
        simbolMap.put("dup", "dup");
        simbolMap.put("swap", "swap");
        simbolMap.put("over", "over");
        simbolMap.put("clear", "clear");

        simbolMap.put("mod", "mod");
        simbolMap.put("arg", "arg");
        simbolMap.put("pow", "pow");
        simbolMap.put("exp", "exp");
        simbolMap.put("log", "log");
        simbolMap.put("sin", "sin");
        simbolMap.put("cos", "cos");
        simbolMap.put("tan", "tan");
        simbolMap.put("asin", "asin");
        simbolMap.put("acos", "acos");
        simbolMap.put("atan", "atan");

        simbolMap.put("add", "+");
        simbolMap.put("sub", "-");
        simbolMap.put("division", "÷");
        simbolMap.put("sqrt", "√");
        simbolMap.put("inverterSign", "±");
        simbolMap.put("multi", "*");

        simbolMap.put("greater", ">");
        simbolMap.put("minor", "<");
        simbolMap.put("sumVar", "+");
        simbolMap.put("subVar", "-");
    }

    public String getSimbol(String cod) {
        return simbolMap.get(cod);
    }
}
