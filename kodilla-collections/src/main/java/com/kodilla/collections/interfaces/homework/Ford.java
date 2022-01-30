package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;

    @Override
    public void increaseSpeed() {
        speed = speed + 15;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 12;

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}