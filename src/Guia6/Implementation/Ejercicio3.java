package Guia6.Implementation;

import Guia6.Interfaces.Calculator;
import Guia6.Interfaces.Exercise3;

/**
 * @author Gonzalo de Achaval
 */
public class Ejercicio3 implements Exercise3{

    //Otra vez el return type de la interfaz en multiplcacion matriz-vector estaba mal.................

    public double[] exerciseAI(double[][] matrix, double[] vector, Calculator calculator){
        double[] result = new double[vector.length];

        for(int i=0; i<matrix.length; i++){
            result[i] = 0;
            for(int j=i; j<matrix[i].length; j++){
                //result[i] += matrix[i][j]*vector[j];
                result[i] = calculator.sum(result[i], calculator.multiplication(matrix[i][j], vector[j]));
            }
        }
        return result;
    }

    public double[][] exerciseAII(double[][] matrix1, double[][] matrix2, Calculator calculator){
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for(int i=0; i<matrix1.length; i++){
            for(int j=i; j<matrix1[0].length; j++){
                //result[i][j] = matrix1[i][j] + matrix2[i][j];
                result[i][j] = calculator.sum(matrix1[i][j], matrix2[i][j]);
            }
        }
        return result;

    }

    /*
    public double[][] exerciseAIII(double[][] matrix1, double[][] matrix2, Calculator calculator){
        if(matrix1[0].length != matrix2.length) throw new RuntimeException("Cannot multiply");

        double[][] result = new double[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++){
            for(int k=0; k<matrix2[0].length; k++){
                result[i][k] = 0;
                for(int j=i; j<=k; j++){
                    //result[i][k] += matrix1[i][j]*matrix2[j][k];
                    result[i][k] = calculator.sum(result[i][k], calculator.multiplication(matrix1[i][j], matrix2[j][k]));
                }
            }
        }
        return result;
    }
    */



    public double[] exerciseBI(double[][] matrix, double[] vector, Calculator calculator){
        double[] result = new double[vector.length];

        for(int i=0; i<matrix.length; i++){
            result[i] = 0;
            for(int j=i; j<matrix[i].length; j++){
                //result[i] += matrix[i][j]*vector[j];
                result[i] = calculator.sum(result[i], calculator.multiplication(matrix[i][j], vector[j]));
            }
        }
        return result;
    }

    public double[][] exerciseBII(double[][] matrix1, double[][] matrix2, Calculator calculator){
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for(int i=0; i<matrix1.length; i++){
            for(int j=i; j<matrix1[0].length; j++){
                //result[i][j] = matrix1[i][j] + matrix2[i][j];
                result[i][j] = calculator.sum(matrix1[i][j], matrix2[i][j]);
            }
        }
        return result;

    }


    public double[][] exerciseBIII(double[][] matrix1, double[][] matrix2, Calculator calculator){
        if(matrix1[0].length != matrix2.length) throw new RuntimeException("Cannot multiply");

        double[][] result = new double[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++){
            for(int k=0; k<matrix2[0].length; k++){
                result[i][k] = 0;
                for(int j=i; j<=k; j++){
                    //result[i][k] += matrix1[i][j]*matrix2[j][k];
                    result[i][k] = calculator.sum(result[i][k], calculator.multiplication(matrix1[i][j], matrix2[j][k]));
                }
            }
        }
        return result;
    }



    @Override
    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[] exerciseDI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseDII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseDIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }
}
