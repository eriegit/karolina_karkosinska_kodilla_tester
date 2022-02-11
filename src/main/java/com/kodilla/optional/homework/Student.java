package com.kodilla.optional.homework;

public class Student {
    private String studentName; // IJ - should be final, ?
    private Teacher teacher; // IJ - should be final, ?

    public Student(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

    public String getStudentName() {
        return studentName;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
