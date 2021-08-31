package com.ap.runners._common;

import org.junit.Assert;

public class ExceptionUtils {
    public static void expectException(Class exceptionClass, Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            if (exceptionClass != null && e.getClass() != exceptionClass) {
                Assert.fail(String.format("Expected class was %s but actual is %s", exceptionClass, e.getClass()));
            }

            System.out.println(String.format("Expected exception %s: passed", exceptionClass));
        }
    }
}
