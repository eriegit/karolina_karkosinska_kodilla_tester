package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
        shapeName = "Circle";
    }

    @Override
    public void calculateArea() {
        area = (radius * radius) * Math.PI;


    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;

    }
}
