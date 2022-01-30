package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Renault;

public class CarsUtils {
    //z metodą statyczną opisującą samochody (patrz poprzednie zadanie)
    // o nazwie public static void describeCar(Car car).

    public static void describeCar(Car car) {
        System.out.println("______________");
        System.out.println("Car type: " + getCarType(car));
        System.out.println("increases speed by " + car.getIncreaseBy());
               System.out.println("It's speed is " + car.getSpeed());

    }
            private static String getCarType(Car car) {
                if (car instanceof Citroen)
                    return "Citroen";
                else if (car instanceof Ford)
                    return "Ford";
                else if (car instanceof Renault)
                    return "Renault";
                else
                    return "Unknown car name";
            }
    }

