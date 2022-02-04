package maps.homework;

import java.util.Objects;

public class Principal {
    //Klasę Principal, która będzie reprezentowała dyrektora szkoły.

    private String firstName;
    private String lastName;

    // constructor
    public Principal(String firstName, String lastName) {
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
        Principal principal = (Principal) o;
        return Objects.equals(firstName, principal.firstName)
                && Objects.equals(lastName, principal.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    //"toString" okazuje się być bardzo przydatny :)
    @Override
    public String toString() {
        return "Principal " + firstName + " " +
                lastName + ", ";
    }
}


