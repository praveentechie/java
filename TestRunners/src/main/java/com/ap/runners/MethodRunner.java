package com.ap.runners;

import java.time.LocalDate;

import com.ap.runners.shared.BookInfo;

public class MethodRunner {
    public static void main(String[] args) {
        MethodRunner methodRunner = new MethodRunner();
        methodRunner.updateByReference();
    }

    private void updateByReference() {
        BookInfo bookInfo = null;
        updateObject(bookInfo);
        System.out.println(bookInfo);
    }

    private void updateObject(BookInfo bookInfo) {
        bookInfo = new BookInfo("Snow ball", "Warren Buffet", LocalDate.of(1990, 10, 10));
    }
}
