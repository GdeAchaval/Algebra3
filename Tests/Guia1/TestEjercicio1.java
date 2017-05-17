package Guia1;

import Guia1.Ejercicio1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GonzaOK on 10/3/17.
 */
public class TestEjercicio1 {

    private Ejercicio1 sumas = new Ejercicio1();

    @Test
    public void test1a(){
        int suma = sumas.sumA(4);
        assertEquals(10, suma);
    }

    @Test
    public void test1aRecursive(){
        int suma = sumas.sumARecursive(4);
        assertEquals(10, suma);
    }

    @Test
    public void test1b(){
        int suma = sumas.sumB(4);
        assertEquals(30, suma);
    }

    @Test
    public void test1bRecursive(){
        int suma = sumas.sumBRecursive(4);
        assertEquals(30, suma);
    }

    @Test
    public void test1c(){
        int suma = sumas.sumC(3, 2);
        assertEquals(15, suma);
    }

    @Test
    public void test1cRecursive(){
        int suma = sumas.sumCRecursive(3, 2);
        assertEquals(15, suma);
    }

    @Test
    public void test1d(){
        int suma = sumas.sumD(4);
        assertEquals(16, suma);
    }

    @Test
    public void test1dRecursive(){
        int suma = sumas.sumDRecursive(4);
        assertEquals(16, suma);
    }

    @Test
    public void test1e(){
        int suma = sumas.sumE(3);
        assertEquals(20, suma);
    }

    @Test
    public void test1eRecursive(){
        int suma = sumas.sumERecursive(3);
        assertEquals(20, suma);
    }

    @Test
    public void test1f(){
        int suma = sumas.sumF(3);
        assertEquals(36, suma);
    }

    @Test
    public void test1fRecursive(){
        int suma = sumas.sumFRecursive(3);
        assertEquals(36, suma);
    }


}
