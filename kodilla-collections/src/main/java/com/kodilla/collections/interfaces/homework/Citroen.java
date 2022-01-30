package com.kodilla.collections.interfaces.homework;

public class Citroen implements Car {

    private int speed;

    @Override
    public void increaseSpeed() {
        speed = speed + 5;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}