package com.ap.runners;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.ap.runners.shared.BookInfo;

public class ListRunner {
    public static void main(String[] args) {
        ListRunner listRunner = new ListRunner();
        //listRunner.checkContainsObject();
        listRunner.constructFromSingleton();
    }

    private void checkContainsObject() {
        BookInfo info1 = new BookInfo("Snow ball", "Warren Buffet", LocalDate.of(1990, 10, 10));
        BookInfo info2 = new BookInfo("5am club", "Robin Sharma", LocalDate.of(2005, 11, 10));
        BookInfo info3 = new BookInfo("Win friends", "Dale Carnigae", LocalDate.of(1850, 11, 10));

        BookInfo info4 = new BookInfo("Snow ball", "Warren Buffet", LocalDate.of(1990, 10, 10));

        List<BookInfo> bookList = Arrays.asList(info1, info2, info3);
        System.out.println(bookList.contains(info4));
    }

    /**
     * ### List -> singleton: Pushing entry to singleton list will throw java.lang.UnsupportedOperationException
     */
    private void constructFromSingleton() {
        List<String> singletonList = Collections.singletonList("one");
        List<String> multiSizedList = new ArrayList<>(singletonList);
        multiSizedList.add("two");
        System.out.println(multiSizedList);
        singletonList.add("two");
    }
}
