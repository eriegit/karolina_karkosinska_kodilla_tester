package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        //String userName = "George Lucky";
        // String userName = null; // Wyjątek NullPointerException
        String userName = "George"; //Wyjątek ArrayIndexOutOfBoundsException
        // oba wyjątki są typu unchecked exceptions z klasy RuntimeException,
        // Java nie wymusza ich obsługi przez programistę
        String[] nameParts = userName.split(" ");
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[1]);

    }
}
