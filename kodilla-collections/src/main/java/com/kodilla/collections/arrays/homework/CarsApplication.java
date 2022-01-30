package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Renault;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int drawnCarsLength = random.nextInt(15) + 1;
        Car[] cars = new Car[drawnCarsLength]; //random number of array elements from 1 to 15
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars) //executes certain operation for each and every car (array) element
            CarsUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarType = random.nextInt(3);     // possible values: 0, 1, 2
        int increaseBy = random.nextInt() * 1000;   // possible values: 1.000-100.999 ...

        if (drawnCarType == 0) {
            return new Citroen(increaseBy);
        } else if (drawnCarType == 1) {
            return new Ford(increaseBy);
        } else {
            return new Renault(increaseBy);
        }
    }
}

