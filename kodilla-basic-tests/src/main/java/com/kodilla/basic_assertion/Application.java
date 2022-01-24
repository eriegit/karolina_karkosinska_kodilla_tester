package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 10;


        int sumResult = calculator.sum(a, b);
        boolean sumCorrect = ResultChecker.assertEquals(13, sumResult);
        if (sumCorrect) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }


        int subtractResult = calculator.subtract(a, b);
        boolean subtractCorrect = ResultChecker.assertEquals(-3, subtractResult);
        if (subtractCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }


        int squareResult = calculator.square(c);
        boolean squareCorrect = ResultChecker.assertEquals(100, squareResult);
        if (squareCorrect) {
            System.out.println("Metoda square działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + c);
        }
    }
}
