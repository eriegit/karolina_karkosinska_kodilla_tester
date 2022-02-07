//package com.kodilla.collections.adv.immutable;
//
//public class ImmutableExample {
//    public static void main(String[] args) {
//
//        Book book = new BookHacked("John Stewart", "The Last Chance");
//        BookHacked bookHacked = (BookHacked) book;
//        //Zmienne book oraz bookHacked wskazują tak naprawdę na ten sam obiekt w pamięci komputera.
//        // Wywołanie metody modifyTitle spowoduje więc zmianę tytułu w obiekcie book.
//        bookHacked.modifyTitle("New Title After Hacking");
//        System.out.println(book.getTitle());
//    }
//}
