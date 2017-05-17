package Guia1;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by GonzaOK on 10/3/17.
 */
public class TestEjercicio2 {

    private Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void test2aRecursive(){
        int result = ejercicio2.factorialRecursive(4);
        assertEquals(24, result);
    }

    @Test
    public void test2a(){
        int result = ejercicio2.factorial(4);
        assertEquals(24, result);
    }

    @Test
    public void test2bRecursive(){
        int result = ejercicio2.ej2bRecursive(4);
        assertEquals(16, result);
    }

    @Test
    public void test2b(){
        int result = ejercicio2.ej2b(4);
        assertEquals(16, result);
    }

    @Test
    public void testFibonacci(){
        int result = ejercicio2.fibonacci(5);
        assertEquals(8, result);
    }

    @Test
    public void testIterativeFibonacci(){
        int result = ejercicio2.iterativeFibonacci(5);
        assertEquals(8, result);
    }

    @Test
    public void testEuclides(){
        int result = ejercicio2.euclides(56, 210);
        assertEquals(14, result);
    }

    @Test
    public void testIterativeEuclides(){
        int result = ejercicio2.iterativeEuclides(56, 210);
        assertEquals(14, result);
    }
}
