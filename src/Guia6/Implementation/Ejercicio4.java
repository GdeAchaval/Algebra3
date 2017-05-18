package Guia6.Implementation;

import Guia6.Interfaces.Calculator;
import Guia6.Interfaces.Exercise4;

public class Ejercicio4 implements Exercise4 {

    @Override
    public double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator) {
        int length = (int)(-1+Math.sqrt(1+8*matrixA.length))/2;
        double[][] result = new double[length][length];
        int counter=0;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                result[i][j]=calculator.sum(matrixA[counter],matrixB[counter]);
                counter++;
            }
        }
        return result;
    }
}
