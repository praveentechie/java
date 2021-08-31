package com.ap.runners.patterns.singleton;

// a singleton class is a class that can have only one object (an instance of the class) at a time
public class SingletonPattern {
    /*
    * KEY POINTS
    * 1. Make constructor private
    * 2. Write a static method that has return type object of this singleton class.
    * */

    private static SingletonPattern instance = null;

    private String additionalProperties;

    private SingletonPattern() {
        this.additionalProperties = "additional props";
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }

        return instance;
    }

    public String getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(String additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
