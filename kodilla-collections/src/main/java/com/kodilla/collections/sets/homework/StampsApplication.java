package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Polska", 3.0, 1.8, true));
        stamps.add(new Stamp("Nowa Zelandia", 2.8, 1.7, true));
        stamps.add(new Stamp("Czechy", 3.0, 1.8, true));
        stamps.add(new Stamp("Niemcy", 3.0, 3.0, false));
        stamps.add(new Stamp("Francja", 3.8, 5.0, true));
        stamps.add(new Stamp("USA", 3.0, 4.8, false));
        stamps.add(new Stamp("Rosja", 4.0, 3.5, false));
//        powtarzające się:
        stamps.add(new Stamp("Polska", 3.0, 1.8, true));
        stamps.add(new Stamp("Francja", 3.8, 5.0, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
