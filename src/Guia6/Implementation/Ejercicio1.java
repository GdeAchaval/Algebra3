package Guia6.Implementation;

import Guia6.Interfaces.Calculator;
import Guia6.Interfaces.Exercise1;

/**
 * @author Gonzalo de Achaval
 */
public class Ejercicio1 implements Exercise1 {

    @Override
    public double exerciseA(double[][] matrix, Calculator calculator){
        double total=0;
        for(int i=0;i<matrix.length;i++){
            //total+=matrix[i][i];
            total = calculator.sum(total, matrix[i][i]);
        }
        return total;
    }

    @Override
    public double exerciseB(double [][] matrix, Calculator calculator){
        double total=0;
        for(int i=0;i<matrix.length;i++){
            //total+=matrix[i][matrix.length-1-i];
            total = calculator.sum(total, matrix[i][matrix.length-1-i]);
        }
        return total;
    }

    @Override
    public double[] exerciseC(double[][] matrix, Calculator calculator){
        double[] result = new double[matrix.length];
        for(int i=0;i<matrix.length;i++){
            result[i]=0;
            for(int j=0;j<matrix[i].length;j++){
                //result[i]+=matrix[i][j];
                result[i] = calculator.sum(result[i], matrix[i][matrix.length-1-i]);
            }
        }
        return result;
    }


    //el return type de la interface era double ???????????????????? fB
    @Override
    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator){
        double[] result = new double[vector.length];

        for(int i=0; i<matrix.length; i++){
            result[i] = 0;
            for(int j=0; j<matrix[i].length; j++){
                //result[i] += matrix[i][j]*vector[j];
                result[i] = calculator.sum(result[i], matrix[i][j]*vector[j]);
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseE(double[][] matrix1, double[][] matrix2, Calculator calculator){
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                //result[i][j] = matrix1[i][j] + matrix2[i][j];
                result[i][j] = calculator.sum(matrix1[i][j], matrix2[i][j]);
            }
        }
        return result;

    }

    @Override
    public double[][] exerciseF(double[][] matrix1, double[][] matrix2, Calculator calculator){
        if(matrix1[0].length != matrix2.length) throw new RuntimeException("Cannot multiply");

        double[][] result = new double[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++){
            for(int k=0; k<matrix2[0].length; k++){
                result[i][k] = 0;
                for(int j=0; j<matrix2.length; j++){
                    //result[i][k] += matrix1[i][j]*matrix2[j][k];
                    result[i][k] = calculator.sum(result[i][k], calculator.multiplication(matrix1[i][j],matrix2[j][k]));
                }
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseG(double[][] matrix, Calculator calculator){
        double[][] result = new double[matrix[0].length][matrix.length];

        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }


}
