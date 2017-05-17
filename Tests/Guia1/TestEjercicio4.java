package Guia1;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by GonzaOK on 14/3/17.
 */
public class TestEjercicio4 {

    @Test
    public void testCapicua(){
        Ejercicio4<Integer> ejercicio4 = new Ejercicio4();
        Integer[] integers = {1, 2, 9, 2, 1};
        assertTrue(ejercicio4.capicua(integers));
    }

    @Test
    public void testCapicuaRecursive(){
        Ejercicio4<Integer> ejercicio4 = new Ejercicio4();
        Integer[] integers = {1, 2, 2, 2, 1};
        assertTrue(ejercicio4.capicuaRecursive(integers));
    }


}
