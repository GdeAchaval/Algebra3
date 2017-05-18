package Guia6;

import Guia6.Implementation.CalculatorImpl;
import Guia6.Implementation.Ejercicio4;
import org.junit.Test;

public class TestEjercicio4 {
    private Ejercicio4 ejercicio4 = new Ejercicio4();
    private double[] matrix1 = {1,2,3,4,5,6};
    private double[] matrix2 = {1,2,3,4,5,6,7,8,9,10};

    @Test
    public void testSummation(){
        printMatrix(ejercicio4.summation(matrix1,matrix1,new CalculatorImpl()));
        printMatrix(ejercicio4.summation(matrix2,matrix2,new CalculatorImpl()));
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
