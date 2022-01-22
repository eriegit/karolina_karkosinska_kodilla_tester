package com.kodilla.abstracts.homework;

public abstract class Job {
    public int salary;
    public String jobDescription;
    public String jobName;

    public Job(int salary) {
        this.salary = salary;
    }

    public String printResults() {
        return jobName + " Responsibilities: " + jobDescription;

    }

}