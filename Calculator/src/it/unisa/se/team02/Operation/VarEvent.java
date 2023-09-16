package it.unisa.se.team02.Operation;

import it.unisa.se.team02.ComplexNumber.CartesianComplex;

/**
 *
 * @author Team02
 */
public class VarEvent implements Comparable<VarEvent>{
     private char var;
    private CartesianComplex complex;

    public VarEvent(char var, CartesianComplex complex) {
        this.var = var;
        this.complex = complex;
    }

    public char getVar() {
        return var;
    }

    public CartesianComplex getComplex() {
        return complex;
    }

    public void setComplex(CartesianComplex complex) {
        this.complex = complex;
    }

    @Override
    public String toString() {
        return var + ": " + complex;
    }

    @Override
    public int compareTo(VarEvent t) {
        return Character.compare(var, t.getVar());
    }
    
}
