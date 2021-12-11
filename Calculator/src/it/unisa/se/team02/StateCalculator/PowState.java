/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
