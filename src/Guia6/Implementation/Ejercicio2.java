package Guia6.Implementation;

import Guia6.Interfaces.Calculator;
import Guia6.Interfaces.Exercise2;

/**
 * @author Gonzalo de Achaval
 */
public class Ejercicio2 implements Exercise2{

    @Override
    public boolean exerciseA(double[][] matrix, Calculator calculator){
        if(matrix.length!=matrix[0].length) return false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]!=matrix[j][i]) return false;
            }
        }
        return true;
    }

    @Override
    public boolean exerciseB(double[][] matrix, Calculator calculator){
        if(matrix.length!=matrix[0].length) return false;

        for(int i=0; i<matrix.length; i++){
            double total = 0;
            for(int j=0; j<matrix[0].length; j++){
                if(i!=j){
                    //total += Math.abs(matrix[i][j]);
                    total = calculator.sum(total, Math.abs(matrix[i][j]));
                }
            }
            if(total > matrix[i][i]) return false;
        }
        return true;
    }

}
