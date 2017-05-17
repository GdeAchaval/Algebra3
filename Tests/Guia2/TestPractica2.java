package Guia2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GonzaOK on 21/3/17.
 */
public class TestPractica2 {

    private Practica2 practica2 = new Practica2();

    @Test
    public void testEjercicio8(){
        long result = practica2.exercise8(0, 4);
        assertEquals(10, result);
    }


    @Test
    public void testEjercicio9(){
        long result = practica2.exercise9(1, 2, 1, 3);
        assertEquals(18, result);
    }


    @Test
    public void testEjercicio10(){
        long result = practica2.exercise10(3);
        assertEquals(34, result);
    }


    @Test
    public void testEjercicio11(){
        double resultSumation = practica2.exercise11Sumation(3, 2);
        double resultFormula = practica2.exercise11Formula(3, 2);
        assertEquals(resultSumation, resultFormula, 1);
    }




}
