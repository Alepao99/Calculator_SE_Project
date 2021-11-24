/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02;

/**
 *
 * @author Francesco
 */
public class ComplexNumber {
    
    private double real;
    private double img;
    private double newR;
    private double newI;
    private double module;
    private double fi;
    ComplexNumber newComplex;

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
        this.module = module();
        this.fi = fi();
    }
//radice del modulo, 

    public double getReal() {
        return real;
    }

    public double getModule() {
        return module;
    }

    public double getFi() {
        return fi;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }
    
    
    public double module() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.img, 2));
    }
//tra - pi/2 e pi/2

    public double fi() {
        if (real == 0 && img > 0) {
            return Math.PI / 2;
        } else if (real == 0 && img < 0) {
            return -Math.PI / 2;
        } else if (real > 0) {
            return Math.atan(img / real);
        } else if (real < 0 && img >= 0) {
            return Math.atan(img / real) + Math.PI;
        } else if (real < 0 && img < 0) {
            return Math.atan(img / real) - Math.PI;
        }
        return -1;
    }
    
    
}
