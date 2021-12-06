/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.ComplexNumber;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Team02
 */
public class TrigonometricComplex implements Complex {

    private double r;
    private double i;
    private double module;
    private double fi;

    public TrigonometricComplex(double r, double i) {
        this.r = r;
        this.i = i;
        this.module = module();
        this.fi = fi();
    }

    public double module() {
        return Math.sqrt(Math.pow(this.r, 2) + Math.pow(this.i, 2));
    }

    public double fi() {
        if (r == 0 && i > 0) {
            return Math.PI / 2;
        } else if (r == 0 && i < 0) {
            return -Math.PI / 2;
        } else if (r > 0) {
            return Math.atan(i / r);
        } else if (r < 0 && i >= 0) {
            return Math.atan(i / r) + Math.PI;
        } else if (r < 0 && i < 0) {
            return Math.atan(i / r) - Math.PI;
        }
        return -1;
    }

    /**
     * This method allows to obatin the square root of a complex number
     *
     * @return a list of complex numbers that contains the results of the square
     * root
     */
    public List<CartesianComplex> sqrt() {
        List<CartesianComplex> list = new ArrayList();
        double sqrtmod = Math.sqrt(module);
        for (int k = 0; k < 2; k++) {
            double re = sqrtmod * Math.cos((fi + 2 * k * Math.PI) / 2);
            double im = sqrtmod * Math.sin((fi + 2 * k * Math.PI) / 2);
            list.add((CartesianComplex) ComplexFactory.createComplex(ComplexType.CARTESIAN, re, im));
        }
        return list;
    }

    @Override
    public double getReal() {
        return r;
    }

    @Override
    public double getImg() {
        return i;
    }

    @Override
    public String toString() {
        return i > 0 ? "(" + String.format("%.2f", r) + "+" + String.format("%.2f", i) + "j)"
                : "(" + String.format("%.2f", r) + String.format("%.2f", i) + "j)";
    }
}
