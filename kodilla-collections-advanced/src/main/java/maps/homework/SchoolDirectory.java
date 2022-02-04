package maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {


        Map<Principal, School> schools = new HashMap<>();
        Principal jan = new Principal("Jan", "Kowalski"); // nazwisko i nazwa szkoly???
        Principal jerzy = new Principal("Jerzy", "Parys");
        Principal bartlomiej = new Principal("Bartłomiej", "Szymański");

        School janSchool = new School("Władysław IV");
        School jerzySchool = new School("Kołłątaj");
        School bartlomiejSchool = new School("Batory");

        schools.put(jan, janSchool);
        schools.put(jerzy, jerzySchool);
        schools.put(bartlomiej, bartlomiejSchool);
// w tej klasie jest najsensowniej trzymać wszystkie dane,
// w pozostałych klasach tylko konstruktory, metody, logika
        janSchool.addSchoolClass(new SchoolClass("1A", 24));
        janSchool.addSchoolClass(new SchoolClass("1B", 20));
        janSchool.addSchoolClass(new SchoolClass("2A", 26));
        janSchool.addSchoolClass(new SchoolClass("2B", 21));

        jerzySchool.addSchoolClass(new SchoolClass("1", 24));
        jerzySchool.addSchoolClass(new SchoolClass("2", 10));

        bartlomiejSchool.addSchoolClass(new SchoolClass("I", 15));
        bartlomiejSchool.addSchoolClass(new SchoolClass("II", 10));
        bartlomiejSchool.addSchoolClass(new SchoolClass("III", 20));

// w Principal = getKey mamy toString z klasy principal, w School = getValue mamy toString z klasy School
        for (Map.Entry<Principal, School> entry : schools.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
            // nie chce działać bez dodanej spacji, nie wie, że to string
        }
    }
}

