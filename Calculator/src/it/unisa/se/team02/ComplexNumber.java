/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Team02
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
    
    public ComplexNumber multiply(ComplexNumber otherNumber) {
        newR = (real * otherNumber.getReal()) - (img * otherNumber.getImg());
        newI = (img * otherNumber.getReal()) + (real * otherNumber.getImg());
        newComplex = new ComplexNumber(newR, newI);
        return newComplex;
    }

    public ComplexNumber divide(ComplexNumber otherNumber) {
        newR = ((real * otherNumber.getReal()) + (img * otherNumber.getImg())) / ((otherNumber.getReal() * otherNumber.getReal()) + (otherNumber.getImg() * otherNumber.getImg()));
        newI = ((img * otherNumber.getReal()) - (real * otherNumber.getImg())) / ((otherNumber.getReal() * otherNumber.getReal()) + (otherNumber.getImg() * otherNumber.getImg()));
        newComplex = new ComplexNumber(newR, newI);
        return newComplex;
    }

    @Override
    public String toString() {
        return "(" + String.format("%.3f", real) + ", j" + String.format("%.3f", img) + ")";
    }
    
     public ComplexNumber add(ComplexNumber otherNumber) {
        newR = real + otherNumber.getReal();
        newI = img + otherNumber.getImg();
        newComplex = new ComplexNumber(newR, newI);
        return newComplex;
    }
    
     public ComplexNumber subtract(ComplexNumber otherNumber) {
        newR = real - otherNumber.getReal();
        newI = img - otherNumber.getImg();
        newComplex = new ComplexNumber(newR, newI);
        return newComplex;
    }
     
      public ComplexNumber invertSign() {
        return new ComplexNumber(-this.real, -this.img);
    }
      
    public List<ComplexNumber> sqrt() {
        List<ComplexNumber> list = new ArrayList();
        double sqrtmod = Math.sqrt(module);
        for (int k = 0; k < 2; k++) {
            list.add(new ComplexNumber(sqrtmod * Math.cos((fi + 2 * k * Math.PI) / 2), sqrtmod * Math.sin((fi + 2 * k * Math.PI) / 2)));
        }
        return list;
    }    
     
     
    
    
}
