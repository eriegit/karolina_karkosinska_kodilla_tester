package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {

        Citroen citroen = new Citroen(5);
        doRace(citroen);
//        showCarDoRaceResult(citroen);

        Ford ford = new Ford(15);
        doRace(ford);
//        showCarDoRaceResult(ford);

        Renault renault = new Renault(25);
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
