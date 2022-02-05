package maps.complex;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
// constructor
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
//getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
//equals hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName)
                && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
//toString                         TODO po co mieliśmy wygenerować ten toString, jeśli go nie używamy?
//    @Override
//    public String toString() {
//        return "Student{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
}
