package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.arrays.homework.CarsUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication { // TODO czy public czy nie?
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(10));
        cars.add(new Ford(15));
        cars.add(new Ford(4));
        cars.add(new Ford(6));
        cars.add(new Ford(20));
        Ford ford = new Ford(35);
        cars.add(ford);

        for (Car car : cars) { // pętla for-each od prawej: iteruj po kolekcji cars
            // i kolejne jej elem wstawiaj do zmiennej car/ford typu Car/Ford
            CarsUtils.describeCar(car); // No getter here! static method describeCar I access by  NameOfClass.methodName
        }
        cars.remove(2); //position 3(no. 2 in array) - ford with speed by 4 should disappear
        cars.remove(ford); // ford with speed by 35 should be removed

        System.out.print("______________________________________");
        for (Car car : cars) {
            CarsUtils.describeCar(car);
            System.out.println("_____________" + "Collection size is " + cars.size());
        }
    }
}

