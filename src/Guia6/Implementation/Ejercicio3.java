package Guia6.Implementation;

import Guia6.Interfaces.Calculator;
import Guia6.Interfaces.Exercise3;

/**
 * @author Gonzalo de Achaval
 */
public class Ejercicio3 implements Exercise3{


    @Override
    public double[] exerciseAI(double[][] matrix, double[] vector, Calculator calculator){
        double[] result = new double[vector.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix[i].length; j++){
                result[i] = calculator.sum(result[i], calculator.multiplication(matrix[i][j], vector[j]));
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseAII(double[][] matrix1, double[][] matrix2, Calculator calculator){
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for(int i=0; i<matrix1.length; i++){
            for(int j=i; j<matrix1[0].length; j++){
                result[i][j] = calculator.sum(matrix1[i][j], matrix2[i][j]);
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseAIII(double[][] matrix1, double[][] matrix2, Calculator calculator){
        if(matrix1[0].length != matrix2.length) throw new RuntimeException("Cannot multiply");

        double[][] result = new double[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++){
            for(int k=0; k<matrix2[0].length; k++){
                for(int j=i; j<=k; j++){
                    result[i][k] = calculator.sum(result[i][k], calculator.multiplication(matrix1[i][j], matrix2[j][k]));
                }
            }
        }
        return result;
    }

    @Override
    public double[] exerciseBI(double[][] matrix, double[] vector, Calculator calculator){
        double[] result = new double[vector.length];

        for(int k=0; k<matrix.length; k++){
            result[0] = calculator.sum(result[0], calculator.multiplication(matrix[0][k], vector[k]));
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=i-1; j<matrix[i].length; j++){
                result[i] = calculator.sum(result[i], calculator.multiplication(matrix[i][j], vector[j]));
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseBII(double[][] matrix1, double[][] matrix2, Calculator calculator){
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for(int k=0; k<matrix1.length; k++){
            result[0][k] = calculator.sum(matrix1[0][k], matrix2[0][k]);
        }
        for(int i=1; i<matrix1.length; i++){
            for(int j=i-1; j<matrix1[0].length; j++){
                result[i][j] = calculator.sum(matrix1[i][j], matrix2[i][j]);
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseBIII(double[][] matrix1, double[][] matrix2, Calculator calculator){
        if(matrix1[0].length != matrix2.length) throw new RuntimeException("Cannot multiply");

        double[][] result = new double[matrix1.length][matrix2[0].length];
        for(int k=0; k<matrix2[0].length; k++){
            for(int j=0; j<k+2 && j<matrix1[0].length; j++){
                result[0][k] = calculator.sum(result[0][k], calculator.multiplication(matrix1[0][j], matrix2[j][k]));
            }
        }

        for(int i=1; i<matrix1.length; i++){
            for(int k=0; k<matrix2[0].length; k++){
                result[i][k] = 0;
                for(int j=i-1; j<k+2 && j<matrix2.length; j++){
                    result[i][k] = calculator.sum(result[i][k], calculator.multiplication(matrix1[i][j], matrix2[j][k]));
                }
            }
        }
        return result;
    }

    @Override
    public double[] exerciseCI(double[][] matrix, double[] vector, Calculator calculator) {
        double[] result = new double[vector.length];

        for(int i=0; i<2; i++) {
            for(int j=0; j<i+2; j++) {
                result[i] = calculator.sum(result[i], calculator.multiplication(matrix[i][j], vector[j]));
            }
        }

        for(int i=2; i<matrix.length; i++){
            for(int j=i-1; j<matrix[0].length && j<i+2; j++){
                result[i] = calculator.sum(result[i], calculator.multiplication(matrix[i][j], vector[j]));
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseCII(double[][] matrix1, double[][] matrix2, Calculator calculator) {
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for(int i=0; i<2; i++) {
            for (int j=0; j<i+2; j++) {
                result[i][j] = calculator.sum(matrix1[i][j], matrix2[i][j]);
            }
        }
        for(int i=2; i<matrix1.length; i++){
            for(int j=i-1; j<matrix1[0].length && j<i+2; j++){
                result[i][j] = calculator.sum(matrix1[i][j], matrix2[i][j]);
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseCIII(double[][] matrix1, double[][] matrix2, Calculator calculator) {
        int b=0;
        double[][] result= new double[matrix1.length][matrix2.length];
        for(int i=0;i<matrix1.length;i++){
            for(int k=0;k<matrix2[0].length;k++){
                for(int j=Math.max(b+i,k-1); j<matrix1.length+i-2 && j<matrix1.length && j<k+2; j++){
                    result[i][k] = calculator.sum(result[i][k], calculator.multiplication(matrix1[i][j], matrix2[j][k]));
                    b=-1;
                }
            }
        }
        return result;
    }

    @Override
    public double[] exerciseDI(double[][] matrix, int k1, int k2, double[] vector, Calculator calculator) {
        if(k1 < 0 || k2 < 0) throw new RuntimeException("Cannot solve");
        double[] result = new double[vector.length];
        result[0] = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=Math.max(i-k1, 0); j<=k2+i && j<matrix[0].length; j++){
                result[i] = calculator.sum(result[i], calculator.multiplication(matrix[i][j], vector[j]));
            }
        }
        return result;
    }

    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        if(k1A<0 || k2A<0 || k1B<0 || k2B<0) throw new RuntimeException("Cannot solve");
        double[][] result = new double[matrixA.length][matrixA[0].length];

        for(int i=0; i<matrixA.length; i++){
            for(int j=Math.max(Math.min(i-k1A, i-k1B), 0); j<= Math.max(k2A+i, k2B+i) && j<matrixA[0].length; j++){
                result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
            }
        }

        return result;
    }

    @Override
    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        if(k1A<0 || k2A<0 || k1B<0 || k2B<0) throw new RuntimeException("Cannot solve");
        double[][] result = new double[matrixA.length][matrixB.length];

        for(int i=0; i<matrixA.length; i++){
            for(int k=0; k<matrixB.length; k++) {
                for(int j=Math.max(Math.max(0,i-k1A),Math.max(0,k-k2B)); j<i+k2A+1&&j<k+k1B+1 && j<matrixA[0].length; j++) {
                    result[i][k] = calculator.sum(result[i][k], calculator.multiplication(matrixA[i][j], matrixB[j][k]));
                }
            }
        }
        return result;
    }


    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length != matrixB.length) throw new RuntimeException("Cannot multiply");

        double[][] result = new double[matrixA.length][matrixB[0].length];
        for(int i=0; i<matrixA.length; i++){
            for(int k=0; k<matrixB[0].length; k++){
                for(int j=0; j<k+1 && j<i+1; j++){
                    result[i][k] = calculator.sum(result[i][k], calculator.multiplication(matrixA[i][j], matrixB[j][k]));
                }
            }
        }
        return result;
    }
}
