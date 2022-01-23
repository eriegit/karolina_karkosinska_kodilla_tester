package com.kodilla.abstracts.homework;

public abstract class Shape {

    private String shapeName;

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();


}