package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList() //przypisanie wyniku do zmiennej o nazwie avg
                .stream()
                .map(u -> u.getAge() )//liczby typu Integer na wejściu przetwarza w liczby typu int na wyjściu. Nie jest tu wymagana żadna specjalna konwersja, dlatego też wyrażenie lambda ma po prostu postać n -> n.
                .mapToInt(n -> n)
                .average()          // kolektor
                .getAsDouble(); //zwrócony przez niego typ OptionalDouble do zwykłego typu double
        System.out.println(avg);

    }
}
