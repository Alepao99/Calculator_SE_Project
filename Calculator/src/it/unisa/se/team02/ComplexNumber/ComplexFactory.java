/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.ComplexNumber;

/**
 *
 * @author Team02
 */
public class ComplexFactory {

    public static Complex createComplex(ComplexType tipo, Double re, Double im) {
        switch (tipo) {
            case CARTESIAN:
                return new CartesianComplex(re, im);
            case TRIGONOMETRIC:
                return new TrigonometricComplex(re, im);
            default:
                return null;
        }
    }

}
