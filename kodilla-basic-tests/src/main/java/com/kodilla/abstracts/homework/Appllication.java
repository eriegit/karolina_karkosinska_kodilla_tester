package com.kodilla.abstracts.homework;

public class Appllication {
    public static void main(String[] args) {
        Shape square = new Square(5);
        square.calculateArea();
        square.calculatePerimeter();
        square.printResults();

        Shape circle = new Circle(3);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.printResults();

        Shape rectangular = new Rectangular(3, 7);
        rectangular.calculateArea();
        rectangular.calculatePerimeter();
        rectangular.printResults();

    }
}
