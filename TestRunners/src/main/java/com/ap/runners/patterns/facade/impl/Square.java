package com.ap.runners.patterns.facade.impl;

public class Square implements Shape {
    @Override
    public String draw() {
        String drawing = "Drawing square";
        System.out.println(drawing);
        return drawing;
    }
}
