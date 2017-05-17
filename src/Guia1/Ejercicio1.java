package Guia1;

/**
 * Created by Gonzalo de Achaval. Guia 1.
 */


public class Ejercicio1 {


    /**
     * 1 + 2 + .. n
     * @param n sum until this number
     * @return the sum of all natural numbers until n.
     */
    public int sumA(int n){
        int count = 0;
        for(int i=0; i<=n; i++){
            count += i;
        }
        return count;
    }

    public int sumARecursive(int n){
        if(n<=0) return 0;
        return n + sumARecursive(n-1);
    }


    /**
     * 1^2 + 2^2 + .. n^2
     * @param n sum until this number
     * @return the sum of all natural numbers to the power of 2 until n
     */
    public int sumB(int n){
        int count = 0;
        for(int i=0; i<=n; i++){
            count += Math.pow(i, 2);
        }
        return count;
    }

    public int sumBRecursive(int n){
        if(n<=0) return 0;
        return (int)(Math.pow(n, 2)) + sumBRecursive(n-1);
    }


    /**
     * 1 + p + p^2 + .. p^n
     * @param n increase exponents by one until n
     * @param p base of the exponential expression
     * @return the sum of p rised to the power of 1 until n.
     */
    public int sumC(int n, int p){
        int count = 0;
        for(int i=0; i<=n; i++){
            count += Math.pow(p, i);
        }
        return count;
    }

    public int sumCRecursive(int n, int p){
        if(n<0) return 0;
        return (int)(Math.pow(p, n)) + sumCRecursive(n-1, p);
    }


    /**
     * 1 + 3 + .. 2n-1
     * @param n sum until this number
     * @return the sum of all uneven numbers until 2n-1
     */
    public int sumD(int n){
        int count = 0;
        for(int i=1; i<=2*n-1; i+=2){
            count += i;
        }
        return count;
    }

    public int sumDRecursive(int n){
        if(n<1) return 0;
        if(n==1) return 1;
        return 2*n-1 + sumDRecursive(n-1);
    }


    /**
     * 1*2 + 2*3 + n*(n+1)
     * @param n sum until this number
     * @return the product of every two consecutive numbers until n
     */
    public int sumE(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            count += i*(i+1);
        }
        return count;
    }

    public int sumERecursive(int n){
        if(n<1) return 0;
        if(n==1) return 2;
        return n*(n+1) + sumERecursive(n-1);
    }

    /**
     * 1^2 + 2^2 + .. n^2
     * @param n sum until this number
     * @return the sum of all natural numbers to the power of 3 until n
     */
    public int sumF(int n){
        int count = 0;
        for(int i=0; i<=n; i++){
            count += Math.pow(i, 3);
        }
        return count;
    }

    public int sumFRecursive(int n){
        if(n<=0) return 0;
        return (int)(Math.pow(n, 3)) + sumFRecursive(n-1);
    }
}
