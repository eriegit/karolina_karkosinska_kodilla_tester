package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;


import java.util.LinkedList;
import java.util.List;

class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>(); // Obiekty typu Shape mogą być przechowywany w kolekcji typu List
        // w zmiennej o nazwie shapes do której przypisany jest nowy obiekt klasy LinkedList
        // Shape jest typem zmiennej implementacja kolekcji LinkedList
        Square square = new Square(12.0); //dany obiekt
        shapes.add(square);
        //shapes.add(new Square(10.0));
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.0, 10.77));


        shapes.remove(1); // usuwanie przy pomocy indeksu - metody remove(int index)
        shapes.remove(square); // usuwanie obiektu gdy mamy dany obiekt - przy pomocy metody remove(Object o)
        //Triangle triangle = new Triangle(10.0,  4.0, 10.77); // usuwanie wg. remove(Object o) gdy nie mamy obiektu - musimy go najpierw sami utworzyć, identyczny z tym w kolekcji
        //shapes.remove(triangle);
        shapes.remove(new Triangle(10.0, 4.0, 10.77)); // krótsza wersja obu linijek powyżej

        System.out.println(shapes.size());
        for (Shape shape : shapes) {
            System.out.println(shape + ", area: " + shape.getArea() +
                    ", perimeter: " + shape.getPerimeter());
        }
    }
}

