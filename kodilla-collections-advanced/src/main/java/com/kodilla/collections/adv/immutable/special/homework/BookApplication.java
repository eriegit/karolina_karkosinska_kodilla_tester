package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book b1 = BookManager.createBook("Gra na wielu bębenkach", " Olga Tokarczuk");
        Book b2 = BookManager.createBook("Prowadż swój pług...", " Olga Tokarczuk");
        Book b3 = BookManager.createBook("Prawiek i inne czasy", " Olga Tokarczuk");
        Book b4 = BookManager.createBook("Tao Kubusia Puchatka", " Benjamin Hoff");
        Book b5 = BookManager.createBook("Tao Kubusia Puchatka", " Benjamin Hoff");

        System.out.println(b4 == b5);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);


    }

}
