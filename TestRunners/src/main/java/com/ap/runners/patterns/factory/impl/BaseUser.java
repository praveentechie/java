package com.ap.runners.patterns.factory.impl;

public abstract class BaseUser {
    private String fullName;
    private String mobileNumber;
    private String userType;

    public BaseUser(UserCreationRequest request) {
        this.fullName = request.getFullName();
        this.mobileNumber = request.getMobileNumber();
        this.userType = request.getUserType();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
