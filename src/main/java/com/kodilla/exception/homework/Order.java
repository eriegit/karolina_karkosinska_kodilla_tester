package com.kodilla.exception.homework;

public class Order {
    private String number;
    private String content;

    public Order(String number, String content) {
        this.number = number;
        this.content = content;
    }

    public String getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
