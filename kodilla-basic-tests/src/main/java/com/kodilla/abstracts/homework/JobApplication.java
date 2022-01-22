package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Job developer = new Developer(4000);
        developer.printResults();

        Job doctor = new Doctor(3500);
        doctor.printResults();

        Job driver = new Driver(2500);
        driver.printResults();

        Job teacher = new Teacher(2000);
        teacher.printResults();

        Person joanna = new Person("Joanna", 45, driver);
        Person jan = new Person("Jan", 27, developer);
        Person sylwia = new Person("Sylwia", 34, teacher);
        Person kasia = new Person("Kasia", 56, doctor);
        joanna.getPersonJobDescription();
        jan.getPersonJobDescription();
        sylwia.getPersonJobDescription();
        kasia.getPersonJobDescription();

    }
}
