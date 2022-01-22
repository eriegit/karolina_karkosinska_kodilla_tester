package com.kodilla.abstracts.homework;

public abstract class Shape {
    double area;
    double perimeter;
    String shapeName;

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

    public void printResults() {
        System.out.println(shapeName + " Area: " + area + " Perimeter: " + perimeter);
    }

}
