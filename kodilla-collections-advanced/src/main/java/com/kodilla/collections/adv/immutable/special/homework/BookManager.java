package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    private static Set<Book> books = new HashSet<>(); // hash set bedzie eliminowal duplikaty z automatu


    public static Book createBook(String title, String author) {

        Book book = new Book(title, author);
        books.add(book);
        // idea: for loop iterates thru this set<> and if theres a book 1 already returns this book 1
        System.out.println(books);
        return book;

        // Zmodyfikuj klasę BookManager tak, aby podczas tworzenia obiektów klasy Book
        // klasa ta sprawdzała, czy dany obiekt klasy Book już istnieje
        // (o takim samym tytule i autorze).

        // W tym celu musisz wyposażyć klasę BookManager
        // w kolekcję utworzonych dotychczas obiektów klasy Book.
        // Pole to powinno być statyczne,
        // aby metoda createBook również mogła być statyczna
        // (wywoływana bez potrzeby tworzenia obiektu klasy BookManager).

    }


}
