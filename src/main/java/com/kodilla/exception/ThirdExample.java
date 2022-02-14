package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false; // IJ podkreśla rzucającą metodę
        // i oczekuje dodanie obsługi wyjątku, wybieram z domyślnych try ... catch
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be reached by our airlines.");
        } finally { // w bloku finally umieszczamy fragment kodu,
            // który chcemy, aby wykonał się zawsze – bez względu na to czy wystąpił wyjątek, czy też nie
            System.out.println("Thank you for using Georg's Airlines");
        }
    }
}
