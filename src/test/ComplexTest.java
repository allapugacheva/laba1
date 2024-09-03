package test;

import demo.parallel.Complex;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testDivision() {

        Complex a = new Complex(1.0, 1.0);
        Complex b = new Complex(2.0, 2.0);

        Complex result = a.division(b);

        assertEquals(0.625, result.getReal(), 0.001);
        assertEquals(0.0, result.getImag(), 0.001);
    }

    @Test
    public void testMinus() {

        Complex a = new Complex(2.0, 2.0);
        Complex b = new Complex(1.0, 1.0);

        Complex result = a.minus(b);

        assertEquals(1.0, result.getReal(), 0.001);
        assertEquals(1.0, result.getImag(), 0.001);
    }
}
