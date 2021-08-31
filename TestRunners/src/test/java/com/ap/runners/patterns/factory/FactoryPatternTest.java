package com.ap.runners.patterns.factory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

import org.junit.Test;

import com.ap.runners.patterns.factory.impl.Admin;
import com.ap.runners.patterns.factory.impl.BaseUser;
import com.ap.runners.patterns.factory.impl.Customer;
import com.ap.runners.patterns.factory.impl.UserCreationRequest;

public class FactoryPatternTest {

    @Test
    public void testAdminCreation() {
        BaseUser baseUser = FactoryPattern.buildUser(getAdminRequest());
        assertEquals(baseUser.getClass(), Admin.class);
        Admin adminUser = (Admin) baseUser;
        assertNotNull(adminUser.getPassword());
    }

    @Test
    public void testCustomerCreation() {
        BaseUser baseUser = FactoryPattern.buildUser(getCustomerRequest());
        assertEquals(baseUser.getClass(), Customer.class);
        Customer customerUser = (Customer) baseUser;
        assertNotNull(customerUser.getPin());
    }

    private static UserCreationRequest getAdminRequest() {
        UserCreationRequest request = new UserCreationRequest();
        request.setFullName("Praveen Arunachalam");
        request.setMobileNumber("9876543210");
        request.setEmail("praveen.arunachalam74@gmail.com");
        request.setUserType("2");
        request.setPassword("password");
        return request;
    }

    private static UserCreationRequest getCustomerRequest() {
        UserCreationRequest request = new UserCreationRequest();
        request.setFullName("Ashrith Vikarna");
        request.setMobileNumber("8765432190");
        request.setEmail("mailtopraveen74@gmail.com");
        request.setUserType("1");
        request.setPin("pin");
        return request;
    }
}
