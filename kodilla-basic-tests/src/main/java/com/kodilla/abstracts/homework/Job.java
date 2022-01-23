package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String jobDescription;
    private String jobName;

    public Job(int salary) {
        this.salary = salary;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void printResults() {
        System.out.println(jobName + " Responsibilities: " + jobDescription);
    }

}