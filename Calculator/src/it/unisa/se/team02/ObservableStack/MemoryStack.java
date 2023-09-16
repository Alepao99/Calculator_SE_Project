package it.unisa.se.team02.ObservableStack;

import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Team02
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