package Guia1;

/**
 * Created by GonzaOK on 14/3/17.
 */
public class Ejercicio8 {

    public double horner(int[] coeficientes, int x){
        double a = coeficientes[coeficientes.length-1]*x+coeficientes[coeficientes.length-2];

        for(int i=3; i<coeficientes.length; i++){
            a = a*x + coeficientes.length-i;
        }

        return a;
    }

    private double recrusiveHorner(int[] coeficientes, double total, int count, int x){
        count ++;
        if(coeficientes.length<count) return total;
        total = total*x + coeficientes[coeficientes.length - count];

        return recrusiveHorner(coeficientes, total, count, x);
    }

    public double recursiveHorner(int [] coeficientes, int x){
        return recrusiveHorner(coeficientes, coeficientes[coeficientes.length-1], 1, x);
    }
}
