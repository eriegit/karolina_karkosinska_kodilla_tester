package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    LocalDate currentDate = LocalDate.now();

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();

        LocalDate myDate1 = LocalDate.of(2021, 11, 20);
        LocalDate myDate2 = LocalDate.of(2022, 2, 9);
        LocalDate myDate3 = LocalDate.of(2022, 5, 20);
        LocalDate myDate4 = LocalDate.of(2022, 4, 15);

        tasks.add(new Task("Call Mary", myDate1, myDate2));
        tasks.add(new Task("Close old bank account", myDate2, myDate3));
        tasks.add(new Task("Open new bank account", LocalDate.of(2022, 2, 2), myDate2));
        tasks.add(new Task("Transfer money to your new bank account", LocalDate.of(2022, 2, 16), myDate3));
        tasks.add(new Task("Schedule appointment with Zac", LocalDate.of(2022, 2, 11), myDate4));
        tasks.add(new Task("Return parcel 3", myDate1, LocalDate.of(2021, 12, 19)));
        tasks.add(new Task("Submit report Y", myDate2, LocalDate.of(2022, 2, 13)));
        tasks.add(new Task("Send invitation email", LocalDate.of(2022, 3, 1), myDate4));
        tasks.add(new Task("Order catering food", LocalDate.of(2022, 3, 30), myDate3));

        return tasks;
    }


}
