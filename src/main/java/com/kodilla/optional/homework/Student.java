package com.kodilla.optional.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentName.equals(student.studentName) && teacher.equals(student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, teacher);
    }
}
