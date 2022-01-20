package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;

    }

    public void turnOn() {
        System.out.println("OS: It is on");
    }

    public void turnOff() {
        System.out.println("OS: It is off");

    }

    public int getYear() {
        return year;
    }

    public void displayYear() {
        System.out.println("Publishing year: " + year);
    }
}

