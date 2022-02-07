package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 1160;
        Integer b = 1160;
        System.out.println(a == b);       // false dwa różne adresy(referencje) obiektów
        System.out.println(a.equals(b));  // true porównanie obiektów (o tej samej wartości) boolean equals(Object o)

        Integer e = 112;
        Integer f = 112;
        System.out.println(e == f);       // true !ten sam adres obiektu, zmienna a i b wskazuja na ten sam obiekt - wyjaśnienie poziżej
        System.out.println(e.equals(f));  // true
//klasa Integer posiada z góry utworzone, predefiniowane obiekty dla liczb o wartościach od -128 do 127.
// Zakres ten odpowiada zakresowi wartości, który można zapisać w jednym bajcie pamięci (w wersji ze znakiem).
// Dzięki temu częste używanie małych liczb nie powoduje zapełniania pamięci komputera nowymi obiektami
// – po prostu Java używa ponownie już raz wykorzystane obiekty dla tych wartości. Stąd też w przypadku liczb
// o zakresie wartości od -128 do 127 adresy obiektów przechowujących te liczby będą takie same,
// jeżeli stworzymy kilka zmiennych o tej samej wartości. W przypadku wartości bardziej odległych od zera
// sytuacja taka nie będzie już miała miejsca i dwie zmienne przechowujące tę samą wartość
// będą tak naprawdę osobnymi obiektami w pamięci komputera.
        System.out.println("-----");
        String x = "This is a string";
        String y = "This is a string";
        System.out.println(x == y);         // true w przeciwieństwie do oczekiwanego 'false'
        System.out.println(x.equals(y));    // true
        // Java optymalizuje przechowywanie obiektów klasy String, ponieważ często
        // mogą one zawierać długie łańcuchy znaków. Przy tworzeniu nowej zmiennej Java sprawdza,
        // czy posiada już zmienną o takiej zawartości – jeżeli posiada,
        // zostanie ona wykorzystana ponownie, czyli dwie zmienne będą wskazywały na ten sam obiekt w pamięci komputera.
        System.out.println("-----");
        Integer c = 100;                      // [1]
        Integer d = 100;                      // [2]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 10;                           // [3]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = 10567;                            // [4]
        d = 10567;                            // [5]
        System.out.println(c.hashCode()); //Ich hashCode jest taki sam, ponieważ wynika on wprost
        System.out.println(d.hashCode());// z wartości zapisanych w zmiennych (zmienne te są równe pod względem equals, więc muszą zwracać taki sam hashCode).
        System.out.println(c == d);  // Wynik porównania c == d zwróci jednak tym razem false,
        // ponieważ są to osobne obiekty w pamięci komputera
        String s = "text";
        s = s + "1";//nie zmodyfikuje obiektu wskazywanego przez zmienną s
        // – w jego miejsce zostanie utworzony zupełnie nowy obiekt.
        // Dlatego też używanie tych samych obiektów przy tworzeniu nowych zmiennych jest bezpieczne.
        // Właśnie dzięki temu, że obiekty te są niemutowalne.
        System.out.println(s);

        String s1 = "text";
        String s2 = new String("text");// < ten sposób zapisu wymusza utworzenie nowego obiektu
        // i wyłącza możliwość ponownego użycia tych samych obiektów klasy String przez Javę.

    }
}
