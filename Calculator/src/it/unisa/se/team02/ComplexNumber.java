/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02;

import java.util.ArrayList;
import java.util.List;

/**
 * The complex numbers class allows to implement the complex number objcet with its main operations.
 * @version n.n (gg-mm-aaaa)
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

    /**
     * Constructor, allows to create a complex number.
     * @param real, represents the real part of the complex number.
     * @param img , represents the imaginary part of the complex number.
     * The constructor takes two double values that represent real and imaginary part.
     * Assigns them to the complex number and calculates its modulus and phase.
     */
    
    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
        this.module = module();
        this.fi = fi();
    }
    /**
     * This method allows to return the real part of a complex number.
     * @return this method return a double through a simple return
     */    
    
    public double getReal() {
        return real;
    }

    /**
     * This method allows to return the module of a complex number.
     * @return this method return a double through a simple return.
     */
    
    public double getModule() {
        return module;
    }

    /**
     * This method allows to return the phase of a complex number.
     * @return this method return a double through a simple return.
     */
    
    public double getFi() {
        return fi;
    }

    /**
     * This method allows to set the real part of a complex number.
     * @param real, represents the value that i want to assign to the real part of the complex number.
     * this method allows to set the real part of a complex number through a simple assignment.
     */
    public void setReal(double real) {
        this.real = real;
    }
    /**
     * This method allows to return the imaginary part of a complex number.
     * @return  this method return a double through a simple return.
     */
    public double getImg() {
        return img;
    }
    /**
     * This method allows to set the imaginary part of a complex number.
     * @param img, represents the value that i want to assign to the imaginary part of the complex number. 
     *  this method allows to set the imaginary part of a complex number through a simple assignement.
     */
    
    public void setImg(double img) {
        this.img = img;
    }
    
    /**
     * This method returns the module of a complex number,
     * @return This method returns a double that representing the module of the complex number, calculated using the functions of the math library.
     */
    public double module() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.img, 2));
    }
/**
 * This method return the phase of a complex number.
 * @return This method returns a double that representing the phase of the complex number, calculated using the functions of the math library.
 */

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
    
    /**
     * This method allows to do the multiplication between two complex numbers.
     * @param otherNumber represents the second complex number to multiply.
     * @return this method allows obtain a complex number given the multiplication of two complex numbers. 
     */
    public ComplexNumber multiply(ComplexNumber otherNumber) {
        newR = (real * otherNumber.getReal()) - (img * otherNumber.getImg());
        newI = (img * otherNumber.getReal()) + (real * otherNumber.getImg());
        newComplex = new ComplexNumber(newR, newI);
        return newComplex;
    }

    /**
     * This method allows to do the division between two complex numbers.
     * @param otherNumber represents the second complex number to divide.
     * @return this method allows obtain a complex number given the division of two complex numbers.
     */
    public ComplexNumber divide(ComplexNumber otherNumber) {
        newR = ((real * otherNumber.getReal()) + (img * otherNumber.getImg())) / ((otherNumber.getReal() * otherNumber.getReal()) + (otherNumber.getImg() * otherNumber.getImg()));
        newI = ((img * otherNumber.getReal()) - (real * otherNumber.getImg())) / ((otherNumber.getReal() * otherNumber.getReal()) + (otherNumber.getImg() * otherNumber.getImg()));
        newComplex = new ComplexNumber(newR, newI);
        return newComplex;
    }
    
    /**
     * This method allows to print the complex number.
     * @return this method overrides toString method of the object class.
     */
    @Override
    public String toString() {
        return "(" + String.format("%.3f", real) + ", j" + String.format("%.3f", img) + ")";
    }
    
    /**
     * This method allows to do the addition between two complex numbers.
     * @param otherNumber, represents the second complex number to add.
     * @return this method allows obtain a complex number given the sum of two complex numbers. The new complex number
     * have the sum of the real parts as the real part and the sum of the imaginary parts as the imaginary part.
     */
     public ComplexNumber add(ComplexNumber otherNumber) {
        newR = real + otherNumber.getReal();
        newI = img + otherNumber.getImg();
        newComplex = new ComplexNumber(newR, newI);
        return newComplex;
    }
    
     /**
      * This method allows to do the subtraction between two complex numbers.
      * @param otherNumber, represents the second complex number to subtraction.
      * @return this method allows obtain a complex number given the substraction of two complex numbers. The new complex number
      * have the substraction of the real parts as the real part and the substraction of the imaginary oarts as the imaginary part.
      */     
     public ComplexNumber subtract(ComplexNumber otherNumber) {
        newR = real - otherNumber.getReal();
        newI = img - otherNumber.getImg();
        newComplex = new ComplexNumber(newR, newI);
        return newComplex;
    }
     
    /**
     * This method allows to obatin a complex number with inverted signs.
     * @return this method returns a complex number whose values are those of the previous number but with the sign reversed.
     */     
      public ComplexNumber invertSign() {
        return new ComplexNumber(-this.real, -this.img);
    }
      
    /**
     * This method allows to obatin the square root of a complex number
     * @return a list of complex numbers that contains the results of the square root
     */  
    public List<ComplexNumber> sqrt() {
        List<ComplexNumber> list = new ArrayList();
        double sqrtmod = Math.sqrt(module);
        for (int k = 0; k < 2; k++) {
            list.add(new ComplexNumber(sqrtmod * Math.cos((fi + 2 * k * Math.PI) / 2), sqrtmod * Math.sin((fi + 2 * k * Math.PI) / 2)));
        }
        return list;
    }    
     
     
    
    
}
