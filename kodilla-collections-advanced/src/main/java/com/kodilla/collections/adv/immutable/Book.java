//package com.kodilla.collections.adv.immutable;
//// ta klasa służy do tworzenia obiektów opisujących książki
//public final class Book { // dodanie tutaj 'final' zablokuje możliwość
//    // dziedziczenia z tej klasy(rozszerzania jej) i modyfikowanie jej działania
//
// // dwa argumenty
//    protected final String author; // akcesor ustawiony 'protected'
//    //protected = jak pola prywatne z tym, że dostęp do nich
//    // mogą mieć również klasy dziedziczące z klasy Book
//    // oraz inne klasy w obrębie tego samego pakietu.
//    protected final String title; // ustawienie akcesora 'protected final'
//    // zabezpiecza przed modyfikacją w klasach dziedziczących po klasie Book.
//    // Kluczowe słowo FINAL umieszczone przed polem informuje Javę,
//    // że wartość wpisana w tym polu powinna być traktowana jako stała
//    // i może być zmieniana jedynie w momencie tworzenia obiektu
//    // (jako przypisanie wartości w miejscu deklaracji pola lub jako wynik działania konstruktora).
//
//
//// konstruktor ustawiający wartości pól
//    public Book(String author, String title) {
//        this.author = author;
//        this.title = title;
//    }
//// gettery do odczytu wartości pól
//    public final String getAuthor() { // dodanie 'final' do gettera
//        // blokuje nadpisywanie gettera wykorzystane w kroku 2 hackowania
//        return author;
//    }
//
//    public final String getTitle() {
//        return title;
//    }
//
//}
