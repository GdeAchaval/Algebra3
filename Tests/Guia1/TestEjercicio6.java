package Guia1;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by GonzaOK on 14/3/17.
 */
public class TestEjercicio6 {

    private Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void testPrimo(){
        assertTrue(ejercicio6.isPrimo(7));
        assertFalse(ejercicio6.isPrimo(25));
    }

    @Test
    public void testPrimoRecursive(){
        assertTrue(ejercicio6.isPrimoRecursive(7));
        assertFalse(ejercicio6.isPrimoRecursive(25));
    }

    @Test
    public void testPrimoMayor(){
        int result = ejercicio6.primoMayor(14);
        assertEquals(17, result);
    }

    @Test
    public void testPrimoMayorRecursive(){
        int result = ejercicio6.primoMayorRecursive(14);
        assertEquals(17, result);
    }

    @Test
    public void testPrimeFactors(){
        print(ejercicio6.findPrimeFactors(21));
    }

    @Test
    public void testPrimeFactorsRecusrive(){
        print(ejercicio6.findPrimeFactorsRecursive(21));
    }

    @Test
    public void testQOPF(){
        int result = ejercicio6.findQuantityOfPrimeFactorsFromRecursive(100);
        assertEquals(3, result);
    }


    private void print(ArrayList<Integer> arraylist){
        for(int i=0; i<arraylist.size(); i++){
            System.out.print(arraylist.get(i) + "\t");
            System.out.println();
        }
    }
}
