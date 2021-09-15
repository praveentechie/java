package com.ap.runners.patterns.facade.impl;

public class Rectangle implements Shape {
    @Override
    public String draw() {
        String drawing = "Drawing rectangle";
        System.out.println(drawing);
        return drawing;
    }
}
