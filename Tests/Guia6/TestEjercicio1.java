package Guia6;

import Guia6.Implementation.CalculatorImpl;
import Guia6.Implementation.Ejercicio1;
import Guia6.Interfaces.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Gonzalo de Achaval
 */
public class TestEjercicio1 {

    private Ejercicio1 ejercicio1 = new Ejercicio1();
    private double[][] matrix = {{2, 1}, {4, 5}};
    private double[][] matrix2 = {{2, 7}, {3, 1}};

    private double[][] nonSquare1 = {{1, 2, 3}, {4, 5, 6}};
    private double[][] nonSquare2 = {{2, 4}, {1, 3}, {6, 5}};

    private double[] vector = {3, 4};

    private Calculator calculator = new CalculatorImpl();

    @Test
    public void testA(){
        assertEquals(7, ejercicio1.exerciseA(matrix, calculator), 1);
    }

    @Test
    public void testB(){
        assertEquals(5, ejercicio1.exerciseB(matrix, calculator), 1);
    }

    @Test
    public void testC(){
        printArray(ejercicio1.exerciseC(matrix, calculator));
    }

    @Test
    public void testD(){
        printArray(ejercicio1.exerciseD(matrix, vector, calculator));
    }

    @Test
    public void testE(){
        printMatrix(ejercicio1.exerciseE(matrix, matrix2, calculator));
    }

    @Test
    public void testF(){
        printMatrix(ejercicio1.exerciseF(matrix, matrix2, calculator));
        System.out.println();
        printMatrix(ejercicio1.exerciseF(nonSquare1, nonSquare2, calculator));
    }

    @Test
    public void testG(){
        printMatrix(ejercicio1.exerciseG(matrix, calculator));
        System.out.println();
        printMatrix(ejercicio1.exerciseG(nonSquare1, calculator));
    }



    private void printArray(double[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    private void printMatrix(double[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
