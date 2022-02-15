package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.addOrder(new Order("1", "notebook"));
        Warehouse.addOrder(new Order("2", "pen"));
        Warehouse.addOrder(new Order("3", "writing pad"));
        Warehouse.addOrder(new Order("4", "A4 sheets"));
        Warehouse.addOrder(new Order("5", "A4 sleeves"));
        Warehouse.addOrder(new Order("6", "eraser"));
        Warehouse.addOrder(new Order("7", "highlighter green"));
        Warehouse.addOrder(new Order("8", "highlighter pink"));

        try {
            Warehouse.getOrder("7");
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }
}


