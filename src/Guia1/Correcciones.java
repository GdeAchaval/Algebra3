package Guia1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * @author Gonzalo de Achaval
 */
public class Correcciones<T> {

    //**************************** EJERCICIO 1 ***********************************

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





    //**************************** EJERCICIO 2 ***********************************

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






    //**************************** EJERCICIO 3 ***********************************


    /**
     * Count the amount of 0 in a natural number. Works by getting the remain of dividing by 10 (last digit), then
     * doing the same by actually dividing by 10.
     * @param a the number to be analyzed
     * @return the amount of 0 in a.
     */

    public int count0(long a){
        int counter = 0;
        if(a < 10 && a!=0) return 0;
        while(a>=10) {
            if (a % 10 == 0) counter++;
            a = a/10;
        }
        return counter;
    }

    public int count0Recursive(long a){
        return count0Recursive(a, 0);
    }

    private int count0Recursive(long a, int amount){
        if(a%10==0) amount ++;
        if(a<10 && a!=0) return amount;
        return count0Recursive(a/10, amount);
    }






    //**************************** EJERCICIO 4 ***********************************


    /**
     * Find if a certain array contains "mirrored" elements. Index from the right and index from the left that
     * are used to compare elements.
     * @param array the array to be analyzed
     * @return true or false
     */

    public boolean capicua(T[] array){
        boolean b = true;

        int indexLeft = 0;
        int indexRight = array.length-1;

        while(indexRight - indexLeft > 1){
            if(!array[indexLeft].equals(array[indexRight])) b = false;
            indexLeft ++;
            indexRight --;
        }
        return b;
    }


    public boolean capicuaRecursive(T[] array){
        return capicuaRecursive(array, 0, array.length-1);
    }

    private boolean capicuaRecursive(T[] array, int first, int last) {
        if(array[first] != array[last]) return false;
        if(first >= last) return true;
        return capicuaRecursive(array, first+1, last-1);
    }




    //**************************** EJERCICIO 5 ***********************************

    /**
     * Simple for sentence that checks one by one for the target value
     * @param array array of integers where the target is looked for.
     * @param target the number looked for
     * @return true or false
     */

    public boolean checkForNumeroEntero(int[] array, int target){
        boolean b = false;
        for(int i=0; i<array.length; i++){
            if(array[i] == target) b = true;
        }
        return b;
    }

    public boolean checkForNumeroEnteroRecursive(int[] array, int target){
        return checkForNumeroEnteroRecursive(array, target, 0);
    }

    private boolean checkForNumeroEnteroRecursive(int[] array, int target, int i) {
        if(i==array.length) return false;
        if(array[i] == target) return true;
        return checkForNumeroEnteroRecursive(array, target, i+1);
    }






    //**************************** EJERCICIO 6 ***********************************


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




    //**************************** EJERCICIO 7 ***********************************

    //no lo habia hecho porque ya estaba hecho en el ejercicio 2......

    /**
     * Method for computing the greatest common divisor (GCD) of two numbers, the largest number
     * that divides both of them without leaving a remainder.
     * @param a number 1
     * @param b number 2
     * @return the GCD between a and b
     */
    public int euclides7(int a, int b) {
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
    public int iterativeEuclides7(int a, int b){
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

    @Test
    public void testEuclides(){
        assertEquals(iterativeEuclides7(123, 277), euclides7(123, 277));
        System.out.println("Result MCD(123, 277) :   " + iterativeEuclides(123, 277));

        assertEquals(iterativeEuclides7(111, 201), euclides7(111, 201));
        System.out.println("Result MCD(111, 201):   " + iterativeEuclides(111, 201));

        assertEquals(iterativeEuclides7(14039, 1529), euclides7(14039, 1529));
        System.out.println("Result MCD(14039, 1529):    " + iterativeEuclides(14039, 1529));
    }
}





