package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    void getOrderThatDoesntExistString() {
       assertThrows(OrderDoesntExistException.class, () -> {
           Warehouse.getOrder("hjk");
       });
    }
    @Test
    void getOrderThatDoesntExistNumber() {
        assertThrows(OrderDoesntExistException.class, () -> {
            Warehouse.getOrder("0");
        });
    }
}