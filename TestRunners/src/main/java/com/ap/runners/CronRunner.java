package com.ap.runners;

import org.quartz.CronExpression;

public class CronRunner {
    public static void main(String[] args) {
        CronRunner runner = new CronRunner();
        runner.getTime();
    }

    public void getTime() {
        CronExpression.isValidExpression("");
    }
}
