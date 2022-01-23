package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    public Doctor(int salary) {
        super(salary);
        setJobName("Doctor");
        setJobDescription(" - prescribes drugs.");
    }

}
