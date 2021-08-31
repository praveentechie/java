package com.ap.runners.patterns.factory.impl;

public class Admin extends BaseUser {
    private String password;

    public Admin(UserCreationRequest request) {
        super(request);
        this.password = request.getPassword();
    }

    public String getPassword() {
        return password;
    }
}
