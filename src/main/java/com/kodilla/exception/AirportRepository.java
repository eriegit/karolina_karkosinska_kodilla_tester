package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListsOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("Las Palmas", false);
        airports.put("Warsaw", true);
        return airports;
    }
    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        //po zaakceptowaniu throwable pojawia się ten dopisek powyżej
        if(getListsOfAirports().containsKey(airport))
            return getListsOfAirports().get(airport);
        throw new AirportNotFoundException();
        //Do rzucania wyjątku służy polecenie throw i jako argument przyjmuje obiekt wyjątku, który ma zostać rzucony
    }
}
