package com.ap.runners.shared.complex_fields;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserDetails implements Serializable {
    private static final String STRING_TEMPLATE = "UserDetails={name:'%s', userId:'%s', emailAddressList:'%s'}";
    private static final long serialVersionUID = 1234567L;

    private String name;
    private String userId;
    private List<EmailAddress> emailAddressList = new ArrayList<>();

    public UserDetails() {}

    public UserDetails(String name, String userId, List<EmailAddress> emailAddressList) {
        this.name = name;
        this.userId = userId;
        this.emailAddressList = emailAddressList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<EmailAddress> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(List<EmailAddress> emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    public static UserDetails getInstance() {
        EmailAddress emailAddress = new EmailAddress("PERSONAL", "praveen.arunachalam74@gmail.com");
        return new UserDetails("Praveen", "arunachalamp", Collections.singletonList(emailAddress));
    }

    @Override
    public String toString() {
        return String.format(STRING_TEMPLATE, name, userId,
              emailAddressList.stream().map(Object::toString).collect(Collectors.toList()));
    }
}
