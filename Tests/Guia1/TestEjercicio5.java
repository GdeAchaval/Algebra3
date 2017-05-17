package Guia1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Gonzalo de Achaval
 */
public class TestEjercicio5 {

    @Test
    public void test001(){
        Ejercicio5 ejercicio5 = new Ejercicio5();
        int[] array = {1, 2, 3, 4, 5};
        boolean isFalse = ejercicio5.checkForNumeroEnteroRecursive(array, 6);
        boolean isTrue = ejercicio5.checkForNumeroEnteroRecursive(array, 4);

        assertTrue(isTrue);
        assertFalse(isFalse);
    }

    @Test
    public void test002(){
        Ejercicio5 ejercicio5 = new Ejercicio5();
        int[] array = {1, 2, 3, 4, 5};
        boolean isFalse = ejercicio5.checkForNumeroEntero(array, 6);
        boolean isTrue = ejercicio5.checkForNumeroEntero(array, 4);

        assertTrue(isTrue);
        assertFalse(isFalse);
    }


}
