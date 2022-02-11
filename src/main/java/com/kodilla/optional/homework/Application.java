package com.kodilla.optional.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        for (Student newStudent : Application.getStudentsTeachers()) {
            System.out.print("Student: " + newStudent.getStudentName() + ", ");
            Optional<Teacher> optionalTeacher = Optional.ofNullable(newStudent.getTeacher());
            optionalTeacher.ifPresentOrElse(
                    (value) // lambda ?
                            -> {
                        System.out.println(
                                "Teacher: "
                                        + value.getTeacherName());
                    },
                    () // null
                            -> {
                        System.out.println(
                                "Teacher undefined");
                    });
        }
    }


    public static List<Student> getStudentsTeachers() {
        List<Student> students = new ArrayList<>(6);
        students.add(new Student("Walter White", new Teacher("John")));
        students.add(new Student("Jessie Pinkman", new Teacher("Mary")));
        students.add(new Student("Tuco Salamanca", new Teacher("Bart")));
        students.add(new Student("Gus Firing", null));
        students.add(new Student("Gale Boetticher", new Teacher("Gabi")));
        students.add(new Student("Mike Ehrmantraut", null));

        return students;
    }


}

