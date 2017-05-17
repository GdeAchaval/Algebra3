package Guia1;

/**
 * Created by Gonzalo de Achaval. Guia 1.
 */

public class Ejercicio3 {

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
}
