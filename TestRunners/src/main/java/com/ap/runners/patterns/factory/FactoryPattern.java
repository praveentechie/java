package com.ap.runners.patterns.factory;

import com.ap.runners.patterns.factory.impl.Admin;
import com.ap.runners.patterns.factory.impl.BaseUser;
import com.ap.runners.patterns.factory.impl.Customer;
import com.ap.runners.patterns.factory.impl.UserCreationRequest;

public class FactoryPattern {
    /*
     *
     */
    private static final String USER_TYPE_CUSTOMER = "1";
    private static final String USER_TYPE_ADMIN = "2";

    public static BaseUser buildUser(UserCreationRequest request) {
        switch (request.getUserType()) {
            case USER_TYPE_CUSTOMER:
                return new Customer(request);
            case USER_TYPE_ADMIN:
                return new Admin(request);
            default:
                throw new RuntimeException("Invalid user type");
        }
    }
}
