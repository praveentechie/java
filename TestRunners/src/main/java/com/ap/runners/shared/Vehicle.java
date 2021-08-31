package com.ap.runners.shared;

public class Vehicle<T> {
    private int wheels;
    private int capacity;
    private T gen;

    public Vehicle() {}

    public Vehicle(int wheels, int capacity) {
        this.wheels = wheels;
        this.capacity = capacity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
