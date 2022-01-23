package com.kodilla.abstracts.homework;

public class Rectangular extends Shape {
    private final int sideALength;
    private final int sideBLength;

    public Rectangular(int sideALength, int sideBLength) {
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
        setShapeName("Rectangular");
    }

    @Override
    public double calculateArea() {
        return sideALength * sideBLength;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * sideALength) + (2 * sideBLength);

    }
}
