package it.unisa.se.team02.ComplexNumber;

/**
 * The complex numbers class allows to implement the complex number objcet with
 * its main operations.
 *
 * @version n.n (gg-mm-aaaa)
 * @author Team02
 */
public class CartesianComplex implements Complex {

    private double real;
    private double img;
    private double newR;
    private double newI;

    /**
     * Constructor, allows to create a complex number.
     *
     * @param real, represents the real part of the complex number.
     * @param img , represents the imaginary part of the complex number. The
     * constructor takes two double values that represent real and imaginary
     * part. Assigns them to the complex number.
     */
    public CartesianComplex(double real, double img) {
        this.real = real;
        this.img = img;

    }

    /**
     * This method allows to return the real part of a complex number.
     *
     * @return this method return a double through a simple return
     */
    public double getReal() {
        return real;
    }

    /**
     * This method allows to set the real part of a complex number.
     *
     * @param real, represents the value that i want to assign to the real part
     * of the complex number. this method allows to set the real part of a
     * complex number through a simple assignment.
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * This method allows to return the imaginary part of a complex number.
     *
     * @return this method return a double through a simple return.
     */
    public double getImg() {
        return img;
    }

    /**
     * This method allows to set the imaginary part of a complex number.
     *
     * @param img, represents the value that i want to assign to the imaginary
     * part of the complex number. this method allows to set the imaginary part
     * of a complex number through a simple assignement.
     */
    public void setImg(double img) {
        this.img = img;
    }

    /**
     * This method allows to do the multiplication between two complex numbers.
     *
     * @param otherNumber represents the second complex number to multiply.
     * @return this method allows obtain a complex number given the
     * multiplication of two complex numbers.
     */
    public CartesianComplex multiply(CartesianComplex otherNumber) {
        newR = (real * otherNumber.getReal()) - (img * otherNumber.getImg());
        newI = (img * otherNumber.getReal()) + (real * otherNumber.getImg());
        CartesianComplex newComplex = new CartesianComplex(newR, newI);
        return newComplex;
    }

    /**
     * This method allows to do the division between two complex numbers.
     *
     * @param otherNumber represents the second complex number to divide.
     * @return this method allows obtain a complex number given the division of
     * two complex numbers.
     */
    public CartesianComplex divide(CartesianComplex otherNumber) {
        newR = ((real * otherNumber.getReal()) + (img * otherNumber.getImg())) / ((otherNumber.getReal() * otherNumber.getReal()) + (otherNumber.getImg() * otherNumber.getImg()));
        newI = ((img * otherNumber.getReal()) - (real * otherNumber.getImg())) / ((otherNumber.getReal() * otherNumber.getReal()) + (otherNumber.getImg() * otherNumber.getImg()));
        CartesianComplex newComplex = new CartesianComplex(newR, newI);
        return newComplex;
    }

    /**
     * This method allows to print the complex number.
     *
     * @return this method overrides toString method of the object class.
     */
    @Override
    public String toString() {
        return img >= 0 ? "(" + String.format("%.2f", real) + "+" + String.format("%.2f", img) + "j)"
                : "(" + String.format("%.2f", real) + String.format("%.2f", img) + "j)";
    }

    /**
     * This method allows to do the addition between two complex numbers.
     *
     * @param otherNumber, represents the second complex number to add.
     * @return this method allows obtain a complex number given the sum of two
     * complex numbers. The new complex number have the sum of the real parts as
     * the real part and the sum of the imaginary parts as the imaginary part.
     */
    public CartesianComplex add(CartesianComplex otherNumber) {
        newR = real + otherNumber.getReal();
        newI = img + otherNumber.getImg();
        CartesianComplex newComplex = new CartesianComplex(newR, newI);
        return newComplex;
    }

    /**
     * This method allows to do the subtraction between two complex numbers.
     *
     * @param otherNumber, represents the second complex number to subtraction.
     * @return this method allows obtain a complex number given the substraction
     * of two complex numbers. The new complex number have the substraction of
     * the real parts as the real part and the substraction of the imaginary
     * oarts as the imaginary part.
     */
    public CartesianComplex subtract(CartesianComplex otherNumber) {
        newR = real - otherNumber.getReal();
        newI = img - otherNumber.getImg();
        CartesianComplex newComplex = new CartesianComplex(newR, newI);
        return newComplex;
    }

    /**
     * This method allows to obatin a complex number with inverted signs.
     *
     * @return this method returns a complex number whose values are those of
     * the previous number but with the sign reversed.
     */
    public CartesianComplex invertSign() {
        return new CartesianComplex(-this.real, -this.img);
    }
    
    /**
     * This method allows to obatin the sin of a complex number
     *
     * @return a complex number that contains the results of the sin
     *
     */
    public CartesianComplex sin() {
        return new CartesianComplex(Math.sin(real) * Math.cosh(img), Math.cos(real) * Math.sinh(img));
    }
    
    /**
     * This method allows to obatin the cos of a complex number
     *
     * @return a complex number that contains the results of the cos
     *
     */
    public CartesianComplex cos() {
        return new CartesianComplex(Math.cos(real) * Math.cosh(img), -Math.sin(real) * Math.sinh(img));
    }

    /**
     * This method allows to obatin the tan of a complex number
     *
     * @return a complex number that contains the results of the tan
     *
     */
    public CartesianComplex tan() {
        return sin().divide(cos());
    }
    
     /**
     * This method allows to obatin the exp of a complex number
     *
     * @return a complex number that contains the results of the exp
     *
     */
    public CartesianComplex exp() {
        return new CartesianComplex(Math.exp(real) * Math.cos(img), Math.exp(real) * Math.sin(img));
    }
    
    
    
    
}
