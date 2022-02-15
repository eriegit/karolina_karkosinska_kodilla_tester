package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Warehouse {
    private static List<Order> orders = new ArrayList<>();

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> searchedOrder = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst();
        // System.out.println("List size: " + searchedOrder.size());

        if (searchedOrder.isEmpty()) {
            throw new OrderDoesntExistException("Order does not exist. Try again.");
        }
        System.out.println(searchedOrder.get());
        return searchedOrder.get();
    }
}

