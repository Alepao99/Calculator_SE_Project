package it.unisa.se.team02.StateCalculator;

import java.util.List;

/**
 *
 * @author Team02
 */
public class PowState implements State{

    @Override
    public void doAction(List<String> currentSign, String s){
        currentSign.add(s);
    }
    
}
