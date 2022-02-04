package maps.homework;

public class SchoolClass {// nie mogę użyć nazwy "class", to słowo zarezerwowane dla Javy
    private String schoolClassName;
    private int numberOfStudents;

    //constructor - tworzę klasę
    SchoolClass(String schoolClassName, int numberOfStudents) {
        this.schoolClassName = schoolClassName;
        this.numberOfStudents = numberOfStudents;
    }

    // obie zmienne są private w tej klasie,
// dlatego potrzebuję gettera do zmiennej numberOfStudents,
// który wykorzystam w addSchool do zliczania total students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}

