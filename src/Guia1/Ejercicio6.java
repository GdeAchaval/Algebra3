package Guia1;


import java.util.ArrayList;

/**
 Created by Gonzalo de Achaval. Guia 1.
 */

public class Ejercicio6 {

    /**
     * Checks if a certain natural number is prime. It does so by checking only divisors that are smaller than the
     * square root of the number to be analyzed.
     * @param n number to be checked
     * @return true or false
     */

    public boolean isPrimo(int n){
        if(n<4 && n>0) return true;
        boolean b = true;

        int raizEntera = (int)Math.sqrt(n);

        while (raizEntera>1){
            if(n%raizEntera == 0) b = false;
            raizEntera--;
        }
        return b;
    }

    public boolean isPrimoRecursive(int n){
        if(n<4 && n>0) return true;
        return isPrimoRecursive(n, (int)Math.sqrt(n));
    }

    private boolean isPrimoRecursive(int n, int sqRt){
        if(sqRt == 1) return true;
        if(n%sqRt == 0) return false;

        return isPrimoRecursive(n, sqRt-1);
    }

    /**
     * Checks for the next prime number by using an infinite loop.
     * @param n find prime bigger than this.
     * @return the chosen prime number
     */

    public int primoMayor(int n){
        while(true){
            if(isPrimo(n)) return n;
            n++;
        }
    }

    public int primoMayorRecursive(int n){
        if(isPrimo(n)) return n;
        return primoMayorRecursive(n+1);
    }

    /**
     * Finds the prime factors of a certain number. First stores every smaller prime number in an array,
     * and then checks if it is a factor.
     * @param n number to be analyzed
     * @return an arrayList of the prime factors of n.
     */

    public ArrayList<Integer> findPrimeFactors(int n){
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if(isPrimo(n)){
            primeFactors.add(n);
            return primeFactors;
        }

        ArrayList<Integer> primosMenores = primosMenores(n);
        for(int i=0; i<primosMenores.size(); i++){
            if(n%primosMenores.get(i) == 0) primeFactors.add(primosMenores.get(i));
        }

        return primeFactors;
    }

    private ArrayList<Integer> primosMenores(int n){
        ArrayList<Integer> primosMenores = new ArrayList<>();

        while(n>0){
            if(isPrimo(n)) primosMenores.add(n);
            n--;
        }
        return primosMenores;
    }


    public ArrayList<Integer> findPrimeFactorsRecursive(int n){
        return findPrimeFactorsRecursive(n, 0, new ArrayList<>());
    }

    private ArrayList<Integer> findPrimeFactorsRecursive(int n, int index, ArrayList<Integer> integers){
        ArrayList<Integer> pm = primosMenores(n);
        if(index==pm.size()) return integers;
        if(n% pm.get(index) == 0) integers.add(pm.get(index));

        return findPrimeFactorsRecursive(n, index+1, integers);
    }


    /**
     * Finds the amount of prime factors of a certain natural number. Size of the array found by findPrimeFactors.
     * @param n the number to be analyzed
     * @return size of the list which contains the prime factors
     */

    public int findQuantityOfPrimeFactors(int n){
        return findPrimeFactors(n).size();
    }

    public int findQuantityOfPrimeFactorsFromRecursive(int n) { return findPrimeFactorsRecursive(n).size(); }






}
