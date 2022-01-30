package com.kodilla.collections.interfaces.homework;

public class Renault implements Car {

    private int speed;


    @Override
    public void increaseSpeed() {
        speed = speed + 25;

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
