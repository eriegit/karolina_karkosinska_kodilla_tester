package com.kodilla.basic_assertion;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int square(int c) {
        return c * c;
    }

//this method below was added to test 'double' not 'int' type
    public double square(double c) {
        return c * c;
    }
}
