package Guia6;

import Guia6.Implementation.Ejercicio3;
import org.junit.Test;

/**
 * @author Gonzalo de Achaval
 */
public class TestEjercicio3 {

    private Ejercicio3 ejercicio3 = new Ejercicio3();

    private int[][] triangular1 = {{1, 2, 3}, {0, 1, 2}, {0, 0, 2}};
    private int[][] triangular2 = {{2, 3, 4}, {0, 4, 3}, {0, 0, 3}};

    private int[] vector = {1, 2, 3};


    @Test
    public void testAi_TS(){
        printArray(ejercicio3.multiplyByVectorTS(triangular1, vector));
    }


    @Test
    public void testAii_TS(){
        printMatrix(ejercicio3.sumMatrixTS(triangular1, triangular2));
    }


    @Test
    public void testAiii_TS(){
        //printMatrix(ejercicio3.multiplyMatrixesTS(triangular1, triangular2));
    }




    private void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    private void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
