package Guia1;

/**
 * Created by GonzaOK on 14/3/17.
 */
public class Ejercicio7 {

    //no lo habia hecho porque ya estaba hecho en el ejercicio 2......

    /**
     * Method for computing the greatest common divisor (GCD) of two numbers, the largest number
     * that divides both of them without leaving a remainder.
     * @param a number 1
     * @param b number 2
     * @return the GCD between a and b
     */
    public int euclides(int a, int b) {
        if(b==0) throw new RuntimeException();
        if(a < b) euclides(b, a);

        int resto = a % b;
        if(resto == 0) return b;
        return euclides (b, resto);
    }

    /**
     * Method for computing the greatest common divisor (GCD) of two numbers, the largest number
     * that divides both of them without leaving a remainder.
     * @param a number 1
     * @param b number 2
     * @return the GCD between a and b
     */
    public int iterativeEuclides(int a, int b){
        if(b==0) throw new RuntimeException();
        if(a < b) euclides(b, a);

        int resto = a;

        while(resto!=0){
            resto = a%b;
            a = b;
            if(resto==0) break;
            b = resto;
        }

        return b;
    }
}
