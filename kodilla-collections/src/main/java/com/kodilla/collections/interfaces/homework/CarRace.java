package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {

        Citroen citroen = new Citroen();
        doRace(citroen);
//        showCarDoRaceResult(citroen);

        Ford ford = new Ford();
        doRace(ford);
//        showCarDoRaceResult(ford);

        Renault renault = new Renault();
        doRace(renault);
//        showCarDoRaceResult(renault);
    }

    private static void doRace(Car car) {

        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }

//    private static void showCarDoRaceResult(Car car) {
//        System.out.println(car.getSpeed());
//    }
}
