package com.ap.runners;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class PhoneNumberRunner {
    public static void main(String[] args) {
        PhoneNumberRunner runner = new PhoneNumberRunner();
        runner.parseNumber();
    }

    private void parseNumber() {
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        try {
            System.out.println(phoneNumberUtil.isPossibleNumber("+17027594720", null));
            System.out.println(phoneNumberUtil.isPossibleNumber(null, null));
            PhoneNumber phoneNumber = phoneNumberUtil.parseAndKeepRawInput("+171", null);
            System.out.println(phoneNumber);
            phoneNumber = phoneNumberUtil.parseAndKeepRawInput("+9 471 560 4888", null);
            System.out.println(phoneNumber);
            phoneNumber = phoneNumberUtil.parseAndKeepRawInput("+1 (702) 759 4720", null);
            System.out.println(phoneNumber + " " + phoneNumber.getCountryCode() + " " + phoneNumber.getNationalNumber());
            phoneNumber = phoneNumberUtil.parseAndKeepRawInput("+1 702-759-4720", null);
            System.out.println(phoneNumber);
            //phoneNumber = phoneNumberUtil.parseAndKeepRawInput("702-759-4720", null);
            System.out.println(phoneNumberUtil.format(phoneNumber, PhoneNumberFormat.E164));
            System.out.println(phoneNumber);
        } catch (NumberParseException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("RTE: ");
            e.printStackTrace();
        }
    }
}
