package com.ap.runners.patterns.facade.impl;

public class Circle implements Shape {
    @Override
    public String draw() {
        String drawing = "Drawing circle";
        System.out.println(drawing);
        return drawing;
    }
}
