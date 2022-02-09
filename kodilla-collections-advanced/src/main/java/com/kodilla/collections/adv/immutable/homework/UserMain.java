package com.kodilla.collections.adv.immutable.homework;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("john", "doe");
        System.out.println("User name: " + user.getName() + ", user surname: " + user.getSurname());

        user.setName("albert");
        user.setSurname("smith");

        System.out.println("User name: " + user.getName() + ", user surname: " + user.getSurname());

    }
}
