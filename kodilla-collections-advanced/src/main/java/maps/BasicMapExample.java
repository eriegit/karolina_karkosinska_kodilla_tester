package maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0); //put(K key, V value) — wstawia do mapy nową parę klucz-wartość
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        Double grade = grades.get("Mathematics"); //get(Object key)
        System.out.println(grade);

        grades.entrySet(); //entrySet() — zwraca całą zawartość mapy w postaci kolekcji nadającej się do użycia w pętli for-each,
        //Ta metoda zwraca zawartość całej mapy w postaci zbioru (Set) obiektów
        // typu Entry – czyli pojedynczych wpisów w mapie, z których każdy ma klucz i wartość.
        // Klasa Entry jest zdefiniowana jako wewnętrzna klasa w interfejsie Map,
        // dlatego też, aby się dostać do jej definicji, stosujemy zapis: Map.Entry<String, Double>

        //CEL: wyswietlić zawartość mapy
        //czyli z Mapy by przeiterować robimy kolekcję ,
        // a następnie wstawiane do zmiennej 'note' typu Map.Entry z której będzie można je odczytać



        //for(Typ zmienna : kolekcja) - składnia pętli for-each dla kolekcji,
        // Podczas iterowania po tej kolekcji, kolejne elementy będą wstawiane do zmiennej zmienna, która jest typu Typ.
        for (Map.Entry<String, Double> note : grades.entrySet()) {      // moja próba for (grades note : Map.Entry<String, Double>)
            System.out.println("Grade of " + note.getKey() + " is equal to " + note.getValue());
            //Kolejne pary klucz-wartość będą wstawiane do zmiennej o nazwie 'note'.
            // Z niej zaś możemy odczytać już konkretny klucz oraz związaną z nim wartość.

        }
    }

}
