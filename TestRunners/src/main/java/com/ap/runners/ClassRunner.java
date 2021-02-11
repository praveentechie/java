package com.ap.runners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ap.runners.shared.BookInfo;

public class ClassRunner {
    public static void main(String[] args) {
        ClassRunner runner = new ClassRunner();
        runner.reuseClass();
    }

    private void reuseClass() {
        BookInfo info = new BookInfo();
        List<BookInfo> bookList = new ArrayList<>();
        List<String> bookName = Arrays.asList("Ponniyin selvan", "GOT");
        for (String book : bookName) {
            info.setTitle(book);
            bookList.add(info);
            info = new BookInfo();
        }

        System.out.println("BookList " + bookList);
    }
}
