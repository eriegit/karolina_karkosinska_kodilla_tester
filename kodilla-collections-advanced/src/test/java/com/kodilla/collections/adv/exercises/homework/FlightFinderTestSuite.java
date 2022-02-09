package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    void findFlightsFromPointOfDeparture() {
        //given
        //FlightFinder doesn't contain static method,
        // therefore we need to define it first before we can call a method from it
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> results = flightFinder.findFlightsFrom("Munich");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Munich", "Warsaw"));
        expectedList.add(new Flight("Munich", "London"));
        assertEquals(expectedList, results);
    }                                      // we need equals hash code methods in Flight, otherwise, flights being compared have funny @numbers
    @Test
    void findFlightsFromNonexistentPointOfDeparture() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> results = flightFinder.findFlightsFrom("Athens");
        //then
        List<Flight> expectedList = new ArrayList<>();
        assertEquals(0, results.size());
    }
    @Test
    void findFlightsToDestination() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> results = flightFinder.findFlightsTo("Warsaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Munich", "Warsaw"));
        expectedList.add(new Flight("London", "Warsaw"));
        assertEquals(expectedList, results);
    }
    @Test
    void findFlightsToNonexistentDestination() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> results = flightFinder.findFlightsTo("Wroclaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        assertEquals(0, results.size());
    }
}