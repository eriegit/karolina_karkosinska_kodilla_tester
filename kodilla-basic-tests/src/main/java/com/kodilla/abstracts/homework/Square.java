package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        shapeName = "Square";
    }

    @Override
    public void calculateArea() {
        area = sideLength * sideLength;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * sideLength;

    }
}
