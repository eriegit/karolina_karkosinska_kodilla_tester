package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    private static final double DELTA = 1e-15;
    // DELTA source: https://stackoverflow.com/questions/5686755/meaning-of-delta-or-epsilon-argument-of-assertequals-for-double-values

    @Test
    public void testSquareCBelow0() {
        Calculator calculator = new Calculator();
        double c = -5.0;
        double squareResult = calculator.square(c);
        assertEquals(25.0, squareResult, DELTA);
    }


    @Test
    public void testSquareCEquals0() {
        Calculator calculator = new Calculator();
        double c = 0.0;
        double squareResult = calculator.square(c);
        assertEquals(0.0, squareResult, DELTA);
    }

    @Test
    public void testSquareCAbove0() {
        Calculator calculator = new Calculator();
        double c = 5.0;
        double squareResult = calculator.square(c);
        assertEquals(25.0, squareResult, DELTA);

    }

}
