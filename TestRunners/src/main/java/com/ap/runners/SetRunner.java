package com.ap.runners;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.ap.runners.shared.BookInfo;

public class SetRunner {
    public static void main(String[] args) {
        SetRunner setRunner = new SetRunner();
        //setRunner.copySet();
        //setRunner.treeSetForObject();
        setRunner.compareDateWithSet();
        //setRunner.compareTwoSets();
        //setRunner.uniqueObjectSet();
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.now().plusDays(1);
        List<LocalDate> dates = Arrays.asList(date1, date);
        Collections.sort(dates);
        System.out.println(date.compareTo(date1) + " " + dates);
    }

    /** will object be validated for unique by Set as it does for primitives */
    private void uniqueObjectSet() {
        BookInfo info1 = new BookInfo("Snow ball", "Warren Buffet", LocalDate.of(1990, 10, 10));
        BookInfo info2 = new BookInfo("5am club", "Robin Sharma", LocalDate.of(2005, 11, 10));
        BookInfo info3 = new BookInfo("Win friends", "Dale Carnigae", LocalDate.of(1850, 11, 10));
        Set<BookInfo> bookInfoSet = new HashSet<>(Arrays.asList(info1, info2, info3));

        System.out.println("********************** start uniqueObjectSet()  **********************");
        System.out.println("bookInfoSet size() before " + bookInfoSet.size());
        BookInfo info4 = new BookInfo("The monk who sold his ferrari", "Robin Sharma", LocalDate.of(2005, 11, 10));
        bookInfoSet.add(info4);
        System.out.println("bookInfoSet size() after " + bookInfoSet.size());
        System.out.println("********************** end uniqueObjectSet()  **********************");
    }
    /** To compare two sets if it has at least one matching value */
    private void compareTwoSets() {
        Set<String> source = new HashSet<>(2);
        source.add("one");
        source.add("two");

        Set<String> target = new HashSet<>(2);
        target.add("one1");
        target.add("three");

        boolean hasMatch = false;
        for (String s : source) {
            if (target.contains(s)) {
                hasMatch = true;
            }
        }
        System.out.println("has match " + hasMatch);
    }

    private void compareDateWithSet() {
        org.joda.time.LocalDate dateToCheck = org.joda.time.LocalDate.now().plusDays(12);
        Set<org.joda.time.LocalDate> hashSet = new HashSet<>();

        hashSet.add(org.joda.time.LocalDate.now().plusDays(5));
        hashSet.add(org.joda.time.LocalDate.now().plusDays(3));
        hashSet.add(org.joda.time.LocalDate.now().plusDays(-1));
        hashSet.add(org.joda.time.LocalDate.now().plusDays(1));
        TreeSet<org.joda.time.LocalDate> localDates = new TreeSet<>(hashSet);

        System.out.println("************* Compare and get closest dates *************");
        System.out.println("Days " + localDates);
        org.joda.time.LocalDate minDates = localDates.higher(dateToCheck);
        System.out.println("date to check " + dateToCheck + " min date " + minDates);
        System.out.println("set in reverse order " + localDates.descendingSet());
        System.out.println("*****************************************************");
    }

    private void copySet() {
        Set<String> source = new HashSet<>(2);
        source.add("one");
        source.add("two");

        Set<String> target = new HashSet<>(source);
        source.remove("one");

        System.out.println("********** copy set **********");
        System.out.println("source " + source);
        System.out.println("target " + target);
        System.out.println("copied set will not change when source set is modified");
        System.out.println("******************************");
    }

    private void treeSetForObject() {
        BookInfo info1 = new BookInfo("Snow ball", "Warren Buffet", LocalDate.of(1990, 10, 10));
        BookInfo info2 = new BookInfo("5am club", "Robin Sharma", LocalDate.of(2005, 11, 10));
        BookInfo info3 = new BookInfo("Win friends", "Dale Carnigae", LocalDate.of(1850, 11, 10));
        Set<BookInfo> bookInfoSet = new HashSet<>(Arrays.asList(info1, info2, info3));

        System.out.println("************* Sort object in a tree set *************");
        System.out.println("original set " + bookInfoSet);
        System.out.println("tree set " + new TreeSet<>(bookInfoSet));
        System.out.println("The object should implement Comparator<T> for tree set to work");
        System.out.println("*****************************************************");
    }
}
