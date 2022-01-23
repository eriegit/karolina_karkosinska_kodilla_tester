package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
        setShapeName("Circle");
    }

    @Override
    public double calculateArea() {
        return (radius * radius) * Math.PI;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;

    }
}
