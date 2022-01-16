public class GradesMain {
    public static void main(String[] args) {
        Grades gradeBook = new Grades();

        gradeBook.add(5);
        gradeBook.add(1);
        gradeBook.add(9);
        gradeBook.add(23);
        gradeBook.add(3);
        gradeBook.add(7);
        gradeBook.add(8);
        gradeBook.add(2);
        gradeBook.add(0);
        gradeBook.add(4);

        int lastAddedGrade = gradeBook.getLastAddedGrade();
        System.out.println("last added grade: " + lastAddedGrade);

        double averageGrade = gradeBook.getAverageGrade();
        System.out.println("average grade: " + averageGrade);
    }
}
