package Guia1;


import java.util.ArrayList;

/**
 * Created by Gonzalo de Achaval. Guia 1.
 */
public class Ejercicio2 {

    /**
     * Returns n! by multyplying every natural number that comes before n.
     * @param n self-explanotary
     * @return factorial of n.
     */

    public int factorial(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            count *= i;
        }
        return count;
    }

    public int factorialRecursive(int n){
        if(n == 1) return 1;
        return factorialRecursive(n-1)*n;
    }


    /**
     * //2^n
     * @param n exponent
     * @return 2 to the power of n
     */
    public int ej2b(int n){
        return (int)Math.pow(2, n);
    }


    /**
     * //2^n. Uses a private method so as to allow recursion.
     * @param n exponent
     * @return 2 to the power of n
     */
    public int ej2bRecursive(int n){
        return ej2bRecursive(n, 2);
    }

    private int ej2bRecursive(int n, int x){
        if(n==0) return 1;
        if(n==1) return x;
        x*=2;
        n--;
        return ej2bRecursive(n, x);
    }


    /**
     * Fibonacci sequence, characterized by the fact that every number after the first two is the sum
     * of the two preceding ones.
     * @param n element n of the sequence to be found
     * @return the corresponding element of the sequence
     */
    public int fibonacci(int n){
        if(n==1 || n==0) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int iterativeFibonacci(int n){
        int index = 0;
        int result = 0;
        int b = 1;
        int c = 1;
        while(index<=n){
            result = b;
            b = c;
            c = result + b;
            index++;
        }
        return result;
    }

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
