package com.kodilla.inheritance.homework;

public class AppOperatingSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1998);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        operatingSystem.displayYear();

        Windows windows = new Windows(2009);
        windows.turnOn();
        windows.turnOff();
        windows.displayYear();

        Linux linux = new Linux(2012);
        linux.turnOn();
        linux.turnOff();
        linux.displayYear();
    }
}
