package com.ap.runners.conditional_statement;

public class ForRunner {
    public static void main(String[] args) {
        ForRunner.continueLoop();
        ForRunner.breakLoop();
    }

    private static void continueLoop() {
        int[] intArray = new int[]{1, 2, 3};
        for (int val : intArray) {
            if (val == 2) {
                continue;
            }
            System.out.println("Not Skipping " + val);
        }
    }

    private static void breakLoop() {
        int[] intArray = new int[]{1, 2, 3};
        for (int val : intArray) {
            if (val == 2) {
                return;
            }
            System.out.println("Not Skipping " + val);
        }
    }
}
