package it.unisa.se.team02;

import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ComplexNumber.TrigonometricComplex;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Team02
 */
public class ComplexNumberTest {

    public ComplexNumberTest() {

    }

    /**
     * Test of getReal method, of class CartesianComplex.
     */
    @Test
    public void testGetReal() {

        CartesianComplex t1 = new CartesianComplex(1, 1);
        assertTrue(t1.getReal() == 1);

    }

    /**
     * Test of setReal method, of class CartesianComplex.
     */
    @Test
    public void testSetReal() {
        CartesianComplex t1 = new CartesianComplex(1, 1);
        t1.setReal(5);
        assertTrue(t1.getReal() == 5);

    }

    /**
     * Test of getImg method, of class CartesianComplex.
     */
    @Test
    public void testGetImg() {

        CartesianComplex t1 = new CartesianComplex(1, 1);
        assertTrue(t1.getImg() == 1);

    }

    /**
     * Test of setReal method, of class TrigonometricComplex.
     */
    @Test
    public void testGetRealTrig() {
        TrigonometricComplex t1 = new TrigonometricComplex(1, 1);
        assertTrue(t1.getReal() == 1);

    }

    /**
     * Test of getImg method, of class TrigonometricComplex.
     */
    @Test
    public void testGetImgTrig() {

        TrigonometricComplex t1 = new TrigonometricComplex(1, 3);
        assertTrue(t1.getImg() == 3);

    }

    /**
     * Test of setImg method, of class CartesianComplex.
     */
    @Test
    public void testSetImg() {

        CartesianComplex t1 = new CartesianComplex(1, 1);
        t1.setImg(5);
        assertTrue(t1.getImg() == 5);

    }

    /**
     * Test of module method, of class TrigonometricComplex.
     */
    @Test
    public void testModule() {
        TrigonometricComplex t1 = new TrigonometricComplex(4, 3);
        Double result = t1.module();
        Double myResult = 5.0;
        assertTrue(result.compareTo(myResult) == 0);
    }

    /**
     * Test of fi method, of class TrigonometricComplex.
     */
    @Test
    public void testFi() {
        TrigonometricComplex t1 = new TrigonometricComplex(4, 3);
        Double result = t1.fi();
        String resultTest = String.valueOf(result);
        resultTest = resultTest.substring(0, 5);
        assertTrue(resultTest.compareTo("0.643") == 0);
    }

    /**
     * Test of multiply method, of class CartesianComplex.
     */
    @Test
    public void testMultiply() {
        CartesianComplex t1 = new CartesianComplex(1, 1);
        CartesianComplex t2 = new CartesianComplex(2, 2);
        CartesianComplex result = t1.multiply(t2);
        assertTrue((result.getReal() == 0) && (result.getImg() == 4));
    }

    /**
     * Test of divide method, of class CartesianComplex.
     */
    @Test
    public void testDivide() {
        CartesianComplex t1 = new CartesianComplex(1, 1);
        CartesianComplex t2 = new CartesianComplex(2, 2);
        CartesianComplex result = t1.divide(t2);
        assertTrue((result.getReal() == 0.5) && (result.getImg() == 0));
    }

    /**
     * Test of toString method, of class CartesianComplex.
     */
    @Test
    public void testToString() {
        CartesianComplex t1 = new CartesianComplex(1, 1);
        String s1 = t1.toString();
        String s2 = "(1,00+1,00j)";
        assertTrue(s1.compareTo(s2) == 0);
    }

    /**
     * Test of add method, of class CartesianComplex.
     */
    @Test
    public void testAdd() {
        CartesianComplex t1 = new CartesianComplex(1, 1);
        CartesianComplex t2 = new CartesianComplex(2, 2);
        CartesianComplex result = t1.add(t2);
        assertTrue((result.getReal() == 3) && (result.getImg() == 3));

    }

    /**
     * Test of subtract method, of class CartesianComplex.
     */
    @Test
    public void testSubtract() {

        CartesianComplex t1 = new CartesianComplex(1, 1);
        CartesianComplex t2 = new CartesianComplex(2, 2);
        CartesianComplex result = t1.subtract(t2);
        assertTrue((result.getReal() == -1) && (result.getImg() == -1));

    }

    /**
     * Test of invertSign method, of class CartesianComplex.
     */
    @Test
    public void testInvertSign() {

        CartesianComplex t1 = new CartesianComplex(1, 1);
        CartesianComplex result = t1.invertSign();
        assertTrue((result.getReal() == -1) && (result.getImg() == -1));

    }

    /**
     * Test of sqrt method, of class CartesianComplex.
     */
    @Test
    public void testSqrt() {
        TrigonometricComplex t1 = new TrigonometricComplex(2, 3);
        List<CartesianComplex> list = t1.sqrt();
        CartesianComplex r1 = list.get(0);
        CartesianComplex r2 = list.get(1);

        String real1 = String.valueOf(r1.getReal());
        real1 = real1.substring(0, 5);
        String img1 = String.valueOf(r1.getImg());
        img1 = img1.substring(0, 5);
        String real2 = String.valueOf(r2.getReal());
        real2 = real2.substring(0, 6);
        String img2 = String.valueOf(r2.getImg());
        img2 = img2.substring(0, 6);

        assertTrue(real1.compareTo("1.674") == 0);
        assertTrue(real2.compareTo("-1.674") == 0);
        assertTrue(img1.compareTo("0.895") == 0);
        assertTrue(img2.compareTo("-0.895") == 0);
    }
    
    /**
     * Test of Sin method, of class CartesianComplex.
     */
    @Test
    public void testSin() {
        CartesianComplex t1 = new CartesianComplex(2, 3);
        CartesianComplex result = t1.sin();
        String real1 = String.valueOf(result.getReal());
        real1 = real1.substring(0, 5);
        String img1 = String.valueOf(result.getImg());
        img1 = img1.substring(0, 5);
        assertTrue(real1.compareTo("9.154") == 0);
        assertTrue(img1.compareTo("-4.16") == 0);
    }
        
    /**
     * Test of Log method, of class TrigonometricComplex.
     */
    @Test
    public void testLog() {
        TrigonometricComplex t1 = new TrigonometricComplex(2, 3);
        CartesianComplex result = t1.log();
        String real1 = String.valueOf(result.getReal());
        real1 = real1.substring(0, 5);
        String img1 = String.valueOf(result.getImg());
        img1 = img1.substring(0, 5);
        assertTrue(real1.compareTo("1.282") == 0);
        assertTrue(img1.compareTo("0.982") == 0);  
  
    }

    /**
     * Test of Pow method, of class TrigonometricComplex.
     */
    @Test
    public void testPow() {
        TrigonometricComplex t1 = new TrigonometricComplex(2, 3);
        CartesianComplex result = t1.pow(3);
        String real1 = String.valueOf(result.getReal());
        real1 = real1.substring(0, 5);
        String img1 = String.valueOf(result.getImg());
        img1 = img1.substring(0, 5);
        assertTrue(real1.compareTo("-45.9") == 0);
        assertTrue(img1.compareTo("9.000") == 0);        
    }

    /**
     * Test of Asin method, of class TrigonometricComplex.
     */
    @Test
    public void testAsin() {
        TrigonometricComplex t1 = new TrigonometricComplex(2, 3);
        CartesianComplex result = t1.asin();
        String real1 = String.valueOf(result.getReal());
        real1 = real1.substring(0, 5);
        String img1 = String.valueOf(result.getImg());
        img1 = img1.substring(0, 5);
        assertTrue(real1.compareTo("0.570") == 0);
        assertTrue(img1.compareTo("1.983") == 0);   
    }
    
     /**
     * Test of Cos method, of class CartesianComplex.
     */
    @Test
    public void testCos() {
        CartesianComplex t1 = new CartesianComplex(2, 3);
        CartesianComplex result = t1.cos();
        String real1 = String.valueOf(result.getReal());
        real1 = real1.substring(0, 5);
        String img1 = String.valueOf(result.getImg());
        img1 = img1.substring(0, 5);
        assertTrue(real1.compareTo("-4.18") == 0);
        assertTrue(img1.compareTo("-9.10") == 0);
    }
    
    /**
     * Test of Tan method, of class CartesianComplex.
     */
    @Test
    public void testTan() {
        CartesianComplex t1 = new CartesianComplex(2, 3);
        CartesianComplex result = t1.tan();
        String real1 = String.valueOf(result.getReal());
        real1 = real1.substring(0, 6);
        String img1 = String.valueOf(result.getImg());
        img1 = img1.substring(0, 6);
        assertTrue(real1.compareTo("-0.003") == 0);
        assertTrue(img1.compareTo("1.0032") == 0);
    }

 /**
     * Test of Exp method, of class CartesianComplex.
     */
    @Test
    public void testExp() {
        CartesianComplex t1 = new CartesianComplex(2, 3);
        CartesianComplex result = t1.exp();
        String real1 = String.valueOf(result.getReal());
        real1 = real1.substring(0, 5);
        String img1 = String.valueOf(result.getImg());
        img1 = img1.substring(0, 5);
        assertTrue(real1.compareTo("-7.31") == 0);
        assertTrue(img1.compareTo("1.052") == 0);
    }

    
   
    
    
}
