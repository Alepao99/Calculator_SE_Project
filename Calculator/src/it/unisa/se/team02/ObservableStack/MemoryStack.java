/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.ObservableStack;

import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aless
 */
public class MemoryStack {

    private Map<Character, CartesianComplex> mappa = new HashMap<>();

    public MemoryStack(Map<Character, CartesianComplex> mappa) {
        this.mappa = mappa;
    }

    public Map<Character, CartesianComplex> getMappa() {
        return mappa;
    }
}