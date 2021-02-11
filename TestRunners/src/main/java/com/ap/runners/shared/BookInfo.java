package com.ap.runners.shared;

import java.time.LocalDate;

public class BookInfo implements Comparable<BookInfo> {
    private static final String STRING_TEMPLATE = "{title:'%s', author:'%s', publishedDate:'%s'}";

    private String title;
    private String author;
    private LocalDate publishedDate;

    public BookInfo() {}

    public BookInfo(String title, String author, LocalDate publishedDate) {
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return String.format(STRING_TEMPLATE, title, author, publishedDate);
    }

    @Override
    public int compareTo(BookInfo o) {
        return publishedDate.compareTo(o.getPublishedDate());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BookInfo)) {
            return false;
        }
        BookInfo bookInfo = (BookInfo) obj;
        return author.equals(bookInfo.getAuthor());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        return result;
    }
}
