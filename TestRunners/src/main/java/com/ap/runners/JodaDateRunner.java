package com.ap.runners;

import static com.ap.runners._common.ExceptionUtils.expectException;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

public class JodaDateRunner {
    private LocalDate nullValue = null;

    public static void main(String[] args) {
        JodaDateRunner runner = new JodaDateRunner();
        //runner.compareWithNull();
        runner.toDateTimeAtStartOfDay();
    }

    private void compareWithNull() {
        LocalDate date = LocalDate.now();

        expectException(IllegalArgumentException.class, () -> date.isAfter(nullValue));
        System.out.println("Throws IllegalArgumentException when comparing value is null");
    }

    private void toDateTimeAtStartOfDay() {
        LocalDate date = LocalDate.parse("2020-10-30");
        DateTime dateTime = date.toDateTimeAtStartOfDay();
        System.out.println(dateTime);
    }
}
