package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>(); //Square jest typem zmiennej przechowującej kolekcję to List,
        // przypisujemy = do niej nowy obiekt klasy ArrayList (najczęściej używana implementacja interfejsu List)
        //typ (List<Square>) – typ obiektów znajdujących się wewnątrz kolekcji.
        // Tego typu zapis nazywamy typem generycznym, gdzie typ danych wewnętrznych jest po prostu w ten sposób przekazanym parametrem,
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

//        for (int n = 0; n < shapes.size(); n++) { // n - iterator - zmienna sterująca
//            Square square = shapes.get(n);
        for (Square square : shapes) { // pętla for-each od prawej: iteruj po kolekcji shapes i kolejne jej elem wstawiaj do zmiennej square typu Square
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }

    }
}
