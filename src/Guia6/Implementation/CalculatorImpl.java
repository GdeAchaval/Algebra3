package Guia6.Implementation;

import Guia6.Interfaces.Calculator;

/**
 * @author Gonzalo de Achaval
 */
public class CalculatorImpl implements Calculator {
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public double sum(double a, double b) {
        count ++;
        return a+b;
    }

    @Override
    public double subtraction(double a, double b) {
        count ++;
        return a-b;
    }

    @Override
    public double multiplication(double a, double b) {
        count ++;
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        count ++;
        return a/b;
    }
}
