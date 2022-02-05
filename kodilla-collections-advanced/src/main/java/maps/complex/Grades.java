package maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    List<Double> grades = new ArrayList<>();

    public Grades(double... grades) {
        for (double grade : grades)
            this.grades.add(grade);
    }

    public double getAverage() {    // [1]
        double sum = 0.0;            // [2]
        for (double grade : grades)  // [3]
            sum += grade;
        // [4] += to skrót od sum = sum + grade
        return sum / grades.size();  // [5] TODO dlaczego w innych pętlach return było po nawiasie
    }

    @Override
    public String toString() {
        return "Grades{" +
                 grades +
                '}';
    }
}
