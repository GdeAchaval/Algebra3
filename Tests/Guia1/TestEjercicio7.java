package Guia1;

import org.junit.Test;

/**
 * Created by GonzaOK on 14/3/17.
 */
public class TestEjercicio7 {

    @Test
    public void testMCD(){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        System.out.println(ejercicio2.euclides(123, 277));      //1
        System.out.println(ejercicio2.euclides(111, 201));      //3
        System.out.println(ejercicio2.euclides(14039, 1529));   //139

        System.out.println(ejercicio2.iterativeEuclides(123, 277));
        System.out.println(ejercicio2.iterativeEuclides(111, 201));
        System.out.println(ejercicio2.iterativeEuclides(14039, 1529));


    }
}
