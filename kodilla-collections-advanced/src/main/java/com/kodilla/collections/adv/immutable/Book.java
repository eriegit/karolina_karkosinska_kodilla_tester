package com.kodilla.collections.adv.immutable;

public class final Book { // dodanie tutaj 'final' blokuje całą klasę i nie da się po niej dziedziczyć!
    protected final String author;
    protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final String getAuthor() {
        return author;
    }

    public final  String getTitle() {
        return title;
    }

}
