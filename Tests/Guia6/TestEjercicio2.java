package Guia6;

import Guia6.Implementation.CalculatorImpl;
import Guia6.Implementation.Ejercicio2;
import Guia6.Interfaces.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Gonzalo de Achaval
 */
public class TestEjercicio2 {

    private Ejercicio2 ejercicio2 = new Ejercicio2();
    private double[][] matrix = {{10, 1}, {4, 15}};
    private double[][] matrix2 = {{1, 7}, {3, 1}};
    private double[][] symmetrical = {{1, 2}, {2, 1}};

    private Calculator calculator = new CalculatorImpl();


    @Test
    public void testA(){
        assertTrue(ejercicio2.exerciseB(matrix, calculator));
        assertFalse(ejercicio2.exerciseB(matrix2, calculator));
    }

    @Test
    public void testB(){
        assertTrue(ejercicio2.exerciseA(symmetrical, calculator));
        assertFalse(ejercicio2.exerciseA(matrix, calculator));
    }
}
