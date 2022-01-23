package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        setShapeName("Square");

    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;

    }
}
