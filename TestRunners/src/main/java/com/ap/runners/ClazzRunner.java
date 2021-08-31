package com.ap.runners;

public class ClazzRunner {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.ap.runners.shared.Cycle");
        System.out.println(clazz.getGenericSuperclass());
    }
}
