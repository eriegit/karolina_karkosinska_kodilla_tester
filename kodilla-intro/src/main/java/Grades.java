public class Grades {
    private int[] grades;
    private int pointer;

    public Grades() {
        this.grades = new int[10];
        this.pointer = 0;
    }

    public void add(int value) {
        if (this.pointer == 10) {
            return;
        }
        this.grades[this.pointer++] = value;
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
//        System.out.println("sum: " + sum + " pointer " + pointer);
        return sum / pointer;

    }
}



