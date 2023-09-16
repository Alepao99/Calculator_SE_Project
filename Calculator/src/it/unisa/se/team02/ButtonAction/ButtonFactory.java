/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.ButtonAction;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Team02
 */
public class ButtonFactory {

    static private Map<String, Creation> buttonMap = new HashMap<>();

    static {
        buttonMap.put("comma", new Comma());
        buttonMap.put("sign", new Sign());
        buttonMap.put("dot", new Dot());
        buttonMap.put("zero", new Zero());
        buttonMap.put("one", new One());
        buttonMap.put("two", new Two());
        buttonMap.put("three", new Three());
        buttonMap.put("four", new Four());
        buttonMap.put("five", new Five());
        buttonMap.put("six", new Six());
        buttonMap.put("seven", new Seven());
        buttonMap.put("eight", new Eight());
        buttonMap.put("nine", new Nine());
    }

    public String getCharacter(String operator, String currentNumber) {
        return buttonMap.get(operator).execute(currentNumber);
    }

}
