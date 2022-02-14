package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        List<String> userNames = UsersRepository.getUsersList()
                //    List<String> userNames = dodajemy przy wywołaniu collect i w ten sposób przypisujemy ją do zmiennej
                .stream()       // uruchamiamy Stream, przez który przepływają obiekty typu User
                .filter(u -> u.getGroup().equals("Chemists"))
                //przepuszczamy dalej w strumieniu jedynie te obiekty klasy User,
                // dla których spełniony jest(true) warunek getGroup().equals("Chemists").
                //.map(u -> u.getUserName()) //operacja transformująca, wyrażenie lambda, wynik strumień typu String
                .map(UsersManager::getUserName)// tu wywołujemy metodę z tej klasy, która może zastąpić wyrazenie
                // lambda, więc zamiast pisać własne lambda możemy skorzystać z referencji do tej metody

                //.forEach(un -> System.out.println(un)); //Metoda forEach klasy Stream jest kolektorem
                .collect(Collectors.toList()); // collect - kolektor, który wynik zapisuje w zmiennej typu List<String>
        System.out.println(userNames);


    }

    public static String getUserName(User user) {
        return user.getUserName(); //referencja do metody nazwa_klasy::nazwa_metody
    }
}
