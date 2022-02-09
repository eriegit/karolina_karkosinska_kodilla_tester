package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        List<String> userNames = UsersRepository.getUsersList()
                //    List<String> userNames = dodajemy przy wywołaniu collect i w ten sposób przypisujemy ją do zmiennej
                .stream()// Stream, przez który przepływają obiekty typu User
                .filter(u -> u.getGroup().equals("Chemists"))
                //.map(u -> u.getUserName())
                .map(UsersManager::getUserName)
                //przepuszczamy dalej w strumieniu jedynie te obiekty klasy User,
                // dla których spełniony jest warunek getGroup().equals("Chemists").
                //.forEach(un -> System.out.println(un)); //Metoda forEach klasy Stream jest kolektorem
                .collect(Collectors.toList());
        System.out.println(userNames);


    }

    public static String getUserName(User user) {
        return user.getUserName(); //referencja do metody nazwa_klasy::nazwa_metody
    }
}
