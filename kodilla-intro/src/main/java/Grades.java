public class Grades {
    private int[] grades; // tablica
    private int pointer;

    public Grades() {
        this.grades = new int[10]; // zmiennej grades (tablica przechowująca oceny) przypisujemy wartość 10
        this.pointer = 0; //zmienna, która będzie "monitorować" aktualną liczbę elementów w tablicy(size),
        // a raczej będzie wskazywać na której pozycji w tablicy
    }

    public void add(int value) {
        if (this.pointer == 10) {
            return; // return w metodzie void przerywa działanie metody
        }
        this.grades[this.pointer++] = value; // inaczej: this.grades[this.pointer] = value; this.pointer++;
    }

    public int getLastAddedGrade() {
        if (this.pointer < 1) {
            return -1;
        }
        return this.grades[this.pointer - 1];
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < pointer; i++) {
           sum = sum + grades[i];
        }
//        System.out.println("sum: " + sum + " pointer " + pointer); // pozwala zobaczyć/sprawdzić metodę obliczania
        return sum / pointer;

    }
}



