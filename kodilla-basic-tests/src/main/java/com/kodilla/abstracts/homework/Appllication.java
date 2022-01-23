package com.kodilla.abstracts.homework;

public class Appllication {
    public static void main(String[] args) {
        Shape square = new Square(5);
        square.calculateArea();
        square.calculatePerimeter();
        System.out.println(square.getShapeName() + " Area:  " + square.calculateArea() + " Perimeter:  " + square.calculatePerimeter());

        Shape circle = new Circle(3);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println(circle.getShapeName() + " Area:  " + circle.calculateArea() + " Perimeter:  " + circle.calculatePerimeter());

        Shape rectangular = new Rectangular(3, 7);
        rectangular.calculateArea();
        rectangular.calculatePerimeter();

        System.out.println(rectangular.getShapeName() + " Area:  " + rectangular.calculateArea() + " Perimeter:  " + rectangular.calculatePerimeter());

    }
}