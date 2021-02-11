package com.ap.runners;

public class GeneralRunner {
    private Boolean nullValue;

    public static void main(String[] args) {
        GeneralRunner runner = new GeneralRunner();
        runner.nullCheckBoolean();
    }

    private void nullCheckBoolean() {
        if (Boolean.FALSE.equals(nullValue)) {
            System.out.println("null check works");
        }
    }
}
