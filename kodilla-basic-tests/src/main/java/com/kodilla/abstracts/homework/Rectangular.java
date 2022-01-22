package com.kodilla.abstracts.homework;

public class Rectangular extends Shape {
    private final int sideALength;
    private final int sideBLength;


    public Rectangular(int sideALength, int sideBLength) {
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
        shapeName = "Rectangular";

    }

    @Override
    public void calculateArea() {
        area = sideALength * sideBLength;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = (2 * sideALength) + (2 * sideBLength);

    }
}
