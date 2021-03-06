package Guia6;

import Guia6.Implementation.CalculatorImpl;
import Guia6.Implementation.Ejercicio3;
import Guia6.Interfaces.Calculator;
import org.junit.Test;

/**
 * @author Gonzalo de Achaval
 */
public class TestEjercicio3 {

    private Ejercicio3 ejercicio3 = new Ejercicio3();

    private double[][] triangular1 = {{1, 2, 3}, {0, 1, 2}, {0, 0, 1}};
    private double[][] triangular2 = {{2, 3, 4}, {0, 4, 3}, {0, 0, 3}};
    private double[][] triangularInferior = {{1, 0, 0}, {1, 2, 0}, {1, 2, 3}};

    private double[][] heisenberg1 = {{1,2,3,4},{3,4,5,6},{0,3,6,2},{0,0,1,2}};
    private double[][] heisenberg2 = {{2,3,4,5},{1,2,4,3},{0,1,2,3},{0,0,3,2}};

    private double[][] tridiagonal1 = {{1,2,0,0},{1,2,3,0},{0,1,2,3},{0,0,1,2}};
    private double[][] tridiagonal2 = {{2,3,0,0},{2,3,4,0},{0,2,3,4},{0,0,5,6}};
    private double[][] tridiagonal3 = {{1,2,0,0,0},{3,2,5,0,0},{0,1,2,3,0},{0,0,1,2,3},{0,0,0,4,5}};

    private double[][] banda1 = {{1,2,3,0},{1,2,3,4},{0,1,2,3},{0,0,1,2}};
    private double[][] banda2 = {{2,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};

    private double[] vector = {1,2,3};
    private double[] vector2 = {1,2,3,4};

    private CalculatorImpl calculator = new CalculatorImpl();


    @Test
    public void testAi(){
        printArray(ejercicio3.exerciseAI(triangular1, vector, calculator));
    }

    @Test
    public void testAii(){
        printMatrix(ejercicio3.exerciseAII(triangular1, triangular2, calculator));
    }

    @Test
    public void testAiii(){
        printMatrix(ejercicio3.exerciseAIII(triangular1, triangular2, calculator));
    }

    @Test
    public void testBi(){
        printArray(ejercicio3.exerciseBI(heisenberg1, vector2, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testBii(){
        printMatrix(ejercicio3.exerciseBII(heisenberg1, heisenberg2, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testBiii(){
        printMatrix(ejercicio3.exerciseBIII(heisenberg1, heisenberg2, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testCi(){
        printArray(ejercicio3.exerciseCI(tridiagonal1, vector2, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testCii(){
        printMatrix(ejercicio3.exerciseCII(tridiagonal1, tridiagonal2, calculator));
        System.out.println("Operations: " + calculator.getCount());

        calculator=new CalculatorImpl();
        printMatrix(ejercicio3.exerciseCII(tridiagonal3, tridiagonal3, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testCiii(){
        printMatrix(ejercicio3.exerciseCIII(tridiagonal1, tridiagonal2, calculator));
        System.out.println("Operations: " + calculator.getCount());

        calculator=new CalculatorImpl();
        printMatrix(ejercicio3.exerciseCIII(tridiagonal3, tridiagonal3, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testDi(){
        printArray(ejercicio3.exerciseDI(banda1, 1, 2, vector2, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testDii(){
        printMatrix(ejercicio3.exerciseDII(banda1, 1, 2, banda2, 0, 0, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testDiii(){
        printMatrix(ejercicio3.exerciseDIII(banda1, 1, 2, banda1, 1, 2, calculator));
        System.out.println("Operations: " + calculator.getCount());
    }

    @Test
    public void testE(){
        printMatrix(ejercicio3.exerciseE(triangularInferior, triangular1, calculator));
        System.out.println("Operations: " + calculator.getCount());
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
