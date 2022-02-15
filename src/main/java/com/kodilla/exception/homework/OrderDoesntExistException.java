package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Throwable {
    public OrderDoesntExistException(String message) {
        super(message);
    }
}
