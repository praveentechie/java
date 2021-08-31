package com.ap.runners.shared.complex_fields;

import java.io.Serializable;

public class EmailAddress implements Serializable {
    private static final String STRING_TEMPLATE = "EmailAddress={emailType:'%s', emailAddress:'%s'}";
    private static final long serialVersionUID = 1234567L;

    private String emailType;
    private String emailAddress;

    public EmailAddress() {}

    public EmailAddress(String emailType, String emailAddress) {
        this.emailType = emailType;
        this.emailAddress = emailAddress;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return String.format(STRING_TEMPLATE, emailType, emailAddress);
    }
}
