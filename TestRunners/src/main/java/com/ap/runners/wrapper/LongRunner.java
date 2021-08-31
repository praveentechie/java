package com.ap.runners.wrapper;

public class LongRunner {
    public static void main(String[] args) {
        LongRunner.compareWrapperAndPrimitive();
    }

    private static void compareWrapperAndPrimitive() {
        Long wrapper = Long.valueOf("330");
        Long wrapper2 = Long.valueOf("330");
        long primitive = 330;

        System.out.println("Wrapper 130 equals to primitive 130? " + (wrapper == wrapper2));
    }
}
