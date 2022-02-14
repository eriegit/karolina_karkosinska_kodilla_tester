package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    private static List<Order> orders = new ArrayList<>();

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static List<Order> getOrder(String number) throws OrderDoesntExistException {
        List<Order> searchedOrder = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .collect(Collectors.toList());
        System.out.println(searchedOrder);
        // System.out.println("List size: " + searchedOrder.size());

        if (searchedOrder.size() == 0) {
            throw new OrderDoesntExistException();
        }
        return searchedOrder;
    }

}

