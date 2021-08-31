package com.ap.runners.patterns.factory.impl;

public class Customer extends BaseUser {
    private String pin;

    public Customer(UserCreationRequest request) {
        super(request);
        this.pin = request.getPin();
    }

    public String getPin() {
        return pin;
    }
}
