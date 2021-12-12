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

    /**
     * This method allows to obatin the log of a complex number
     *
     * @return a complex number that contains the results of the log
     *
     */
    public CartesianComplex log() {
        return new CartesianComplex(Math.log(module), fi);
    }

    /**
     * This method allows to obatin the pow of a complex number
     *
     * @return a complex number that contains the results of the pow
     *
     */
    public CartesianComplex pow(int n) {
        double modNew = Math.pow(module, n);
        double fiNew = fi * n;
        return new CartesianComplex(modNew * Math.cos(fiNew), modNew * Math.sin(fiNew));
    }

    /**
     * This method allows to obatin the asin of a complex number
     *
     * @return a complex number that contains the results of the asin
     *
     */
    public CartesianComplex asin() {
        // asin(z) = -i (log(sqrt(1 - z2) + iz))
        // creo z
        TrigonometricComplex numberT = new TrigonometricComplex(this.r, this.i);
        // creo z^2
        CartesianComplex nPow = numberT.pow(2);
        // creo 1
        CartesianComplex num = new CartesianComplex(1, 0);
        //creo 1-z^2
        CartesianComplex nSub = num.subtract(nPow);
        TrigonometricComplex x = new TrigonometricComplex(nSub.getReal(), nSub.getImg());
        //creo sqrt(1-z^2)
        List<CartesianComplex> nSqrt = x.sqrt();
        CartesianComplex nSqrt2 = nSqrt.get(0);
        //creo un numero complesso 0+1i
        CartesianComplex nNum = new CartesianComplex(0, 1);
        // creo il prodotto i*z
        CartesianComplex nProd = nNum.multiply(new CartesianComplex(this.r, this.i));
        // somma all'interno del log
        CartesianComplex nSum = nProd.add(nSqrt2);
        // log
        TrigonometricComplex x2 = new TrigonometricComplex(nSum.getReal(), nSum.getImg());
        CartesianComplex nLog = x2.log();
        //creo un numero complesso 0-1i
        CartesianComplex nNum2 = new CartesianComplex(0, -1);
        // prodotto tra -i e tutto il resto
        CartesianComplex nFinal = nNum2.multiply(nLog);
        return nFinal;
    }

    /**
     * This method allows to obatin the acos of a complex number
     *
     * @return a complex number that contains the results of the acos
     *
     */
    public CartesianComplex acos() {
        //acos(z) = -i (log(z + i (sqrt(1 - z2))))
        // creo z
        TrigonometricComplex numberT = new TrigonometricComplex(this.r, this.i);
        // creo z^2
        CartesianComplex nPow = numberT.pow(2);
        // creo 1
        CartesianComplex num = new CartesianComplex(1, 0);
        //creo 1-z^2
        CartesianComplex nSub = num.subtract(nPow);
        TrigonometricComplex x = new TrigonometricComplex(nSub.getReal(), nSub.getImg());
        //creo sqrt(1-z^2)
        List<CartesianComplex> nSqrt = x.sqrt();
        CartesianComplex nSqrt2 = nSqrt.get(0);
        //creo un numero complesso 0+1i
        CartesianComplex nNum = new CartesianComplex(0, 1);
        // creo il prodotto i*(sqrt(1 - z2))
        CartesianComplex nProd = nNum.multiply(nSqrt2);
        // sommo z al prodotto di prima
        CartesianComplex nSum = nProd.add(new CartesianComplex(this.r, this.i));
        // faccio il log
        TrigonometricComplex x2 = new TrigonometricComplex(nSum.getReal(), nSum.getImg());
        CartesianComplex nLog = x2.log();
        //creo un numero complesso 0-1i
        CartesianComplex nNum2 = new CartesianComplex(0, -1);
        // prodotto tra -i e tutto il resto
        CartesianComplex nFinal = nNum2.multiply(nLog);
        return nFinal;
    }

    /**
     * This method allows to obatin the atan of a complex number
     *
     * @return a complex number that contains the results of the atan
     *
     */
    public CartesianComplex atan() {
        //atan(z) = (i/2) log((i + z)/(i - z))
        // creo z
        TrigonometricComplex numberT = new TrigonometricComplex(this.r, this.i);
        //creo un numero complesso 0+1i
        CartesianComplex nNum = new CartesianComplex(0, 1);
        //creo i-z
        CartesianComplex nSub = nNum.subtract(new CartesianComplex(this.r, this.i));
        //creo i+z
        CartesianComplex nSum = nNum.add(new CartesianComplex(this.r, this.i));
        //divido i 2 numeri
        CartesianComplex nDiv = nSum.divide(nSub);
        // faccio il log
        TrigonometricComplex x2 = new TrigonometricComplex(nDiv.getReal(), nDiv.getImg());
        CartesianComplex nLog = x2.log();
        //creo 2
        CartesianComplex num = new CartesianComplex(2, 0);
        //faccio i/2
        CartesianComplex nDiv2 = nNum.divide(num);
        //prodotto finale
        CartesianComplex nFinal = nDiv2.multiply(nLog);
        return nFinal;
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
        return i >= 0 ? "(" + String.format("%.2f", r) + "+" + String.format("%.2f", i) + "j)"
                : "(" + String.format("%.2f", r) + String.format("%.2f", i) + "j)";
    }
}
