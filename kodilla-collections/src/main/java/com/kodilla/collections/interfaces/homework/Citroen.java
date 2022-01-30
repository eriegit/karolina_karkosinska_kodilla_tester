package com.kodilla.collections.interfaces.homework;

public class Citroen implements Car {

    private int increaseBy;
    private int speed;

    public Citroen(int increaseBy) {
        this.increaseBy = increaseBy;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increaseBy;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getIncreaseBy() {
        return increaseBy;
    }
}