package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");
    // User user = null; //opakowana zmienna jest nullem - sprawdzamy co sie wyswietli - pusta linia,
        // użyty został domyślny "pusty" obiekt klasy User w metodzie orElse.

        Optional<User> optionalUser = Optional.ofNullable(user);
        //Do opakowania obiektu user użyliśmy metody statycznej ofNullable klasy Optional

        String userName =
               optionalUser.orElse(new User("", 0, 0, "")).getUserName();
                // wywołujemy metodę orElse na obiekcie optionalUser. Metoda ta,
        // gdy optionalUser zawiera w środku null, zwróci to, co przekazano jej jako argument,
        // czyli w naszym przypadku będzie to "pusty" obiekt klasy User.
        // Dzięki temu wywołanie metody getUsername() nie zakończy się wyjątkiem NullPointerException.

       // System.out.println(userName); // wynik: user1 przy user 1, a przy user=null pusta linia

        optionalUser.ifPresent(u -> System.out.println(u.getUserName()));
        // Metoda ta jako argument przyjmuje wyrażenie lambda, które zostanie wykonane
        // gdy opakowany obiekt nie ma wartości null, w przeciwnym wypadku żadna akcja nie zostanie wykonana.
    }
}
