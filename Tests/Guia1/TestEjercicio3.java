package Guia1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GonzaOK on 14/3/17.
 */
public class TestEjercicio3 {

    @Test
    public void test0(){
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int result = ejercicio3.count0(809);
        assertEquals(1, result);
    }

    @Test
    public void test0Recursive(){
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int result = ejercicio3.count0Recursive(80220);
        assertEquals(2, result);
    }
}
