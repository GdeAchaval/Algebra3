package Guia2;

/**
 *  Gonzalo de Achaval. Alegbra 3. Practica 2.
 */
public class Practica2 implements Practice2 {


    /**
     * Sums recursively consecutive integers starting from, and ending in two desired integers.
     * @param m integer where the sum starts
     * @param n integer where the sum ends
     * @return the specified sum
     */
    @Override
    public long exercise8(int m, int n) {
        if(n<m) throw new RuntimeException(); //maximum < minimum
        int result = 0;
        while(m <= n){
            result += m;
            m++;
        }

        return result;
    }


    /**
     * Sums recursively the product of two integers starting from, and ending, in two desired integers.
     * Both of them increase by one. One of the integers is fixed until the other one reaches its max value,
     * then the first one increases by one while the second one returns to its starting value. The process is then
     * repetead until the first and second starting integers reach their max values.
     * @param m integer where the outside sum starts
     * @param n integer where the outside sum ends
     * @param r integer where the inside sum starts
     * @param s integer where the inside sum ends
     * @return the specified sum
     */
    @Override
    public long exercise9(int m, int n, int r, int s) {
        if(n<m) throw new RuntimeException(); //maximum < minimum
        if(r>s) throw new RuntimeException(); //maximum < minimum
        int result = 0;
        int k = r;
        while(m <= n){
            while(k <= s){
                result += m*k;
                k++;
            }
            m++;
            k=r;
        }

        return result;
    }


    /**
     * 1×2 + 2×2^2 + 3×2^3 ... +n×2^n
     * @param n last number to be placed in the expression to be summed
     * @return the specified sumatory
     */

    @Override
    public long exercise10(int n) {
        int result = 0;
        for(int i=1; i <= n; i++){
            result += i*Math.pow(2, i);
        }

        return result;
    }

    /**
     * recursively finds 1*x^1 + 2*x^2 + 3*x^3 ... +n*x^n
     * @param n last number to be placed in the expression to be summed
     * @param x base of the power that is part of the expression
     * @return the specified sum
     */
    @Override
    public double exercise11Sumation(int n, int x) {
        int result = 0;
        for(int j=0; j <= n; j++){
            result += j*Math.pow(x, j);
        }

        return result;
    }

    /**
     * by using a predefined formulae finds 1*x^1 + 2*x^2 + 3*x^3 ... +n*x^n
     * @param n last number to be placed in the expression to be summed
     * @param x base of the power that is part of the expression
     * @return the specified sum
     */
    @Override
    public double exercise11Formula(int n, int x) {
        return (n*Math.pow(x, (n+2)) - (n+1)*Math.pow(x, (n+1)) + x)/Math.pow((x-1), 2);
    }
}
