package com.ap.runners;

import org.joda.time.LocalDate;

public class DateRunner {
    public static void main(String[] args) {
        DateRunner runner = new DateRunner();
        runner.compareWithNull();
    }

    private void compareWithNull() {
        LocalDate date = LocalDate.now();
        System.out.println(date.isAfter(null));
    }
}
