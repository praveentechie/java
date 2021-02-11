package com.ap.runners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

public class Main {

    public static void main(String[] args) {

        List<Boolean> strings = Arrays.asList(false);
        System.out.println(Boolean.TRUE.equals(true));
        System.out.println(CollectionUtils.isNotEmpty(strings) && Boolean.TRUE.equals(strings.get(0)));
        System.out.println("Hello World!");
        System.out.println(Collections.emptySet().size());
        BreakLoop breakLoopObj = new BreakLoop();
        breakLoopObj.breakLoop();
        //int result = breakLoopObj.breakForLoop();
        //breakLoopObj.compareSets();
//        System.out.println(breakLoopObj.getSet1().add("new"));
        //System.out.print("result " + result + "\n");
//        if (Boolean.TRUE) {
//            System.out.print("result " + breakLoopObj.getSet1());
//        }
    }
}

class BreakLoop {
    private List<Integer> integerList = new ArrayList<>();
    private Set<String> set1 = new HashSet<>(3);
    private Set<String> set2 = new HashSet<>(3);

    public Set<String> getSet1() {
        return set1;
    }

    public void setSet1(Set<String> set1) {
        this.set1 = set1;
    }

    public void breakLoop() {
        integerList.add(0, 0);
        integerList.add(1, 1);
        integerList.add(2, 2);
        integerList.add(3, 3);
        integerList.add(4, 4);

        for (Integer integer : integerList) {
            System.out.print("value " + integer + "\n");
            if (integer == 2) {
                return;
            }
        }

/*
        integerList.forEach(integer -> {
            System.out.print("value " + integer + "\n");
            if (integer == 2) {
                return;
            }
        });
*/
    }

    public int breakForLoop() {
        for (Integer integer : integerList) {
            System.out.print("value " + integer + "\n");
            if (integer == 2) {
                return integer;
            }
        }
        return 0;
    }

    public void compareSets() {
        set1.add("one");
        set1.add("two");
        set1.add("three");
        set1.add("five");
        set2.add("one");
        set2.add("two");
        set2.add("three");
        set2.add("six");

        //System.out.print(hasAtLeastOneMatch(set1, set2));
        set1.retainAll(set2);
        if (!set1.add("one")) {
            set1.add("seven");
        }
        System.out.println("dis jun " + set1.add("one"));
        System.out.println("diff" + set1);
    }

    private boolean hasAtLeastOneMatch(Set<?> set1, Set<?> set2) {
        if (CollectionUtils.isEmpty(set1)) {
            System.out.print("empty coll \n");
        }
        for (Object entry : set1) {
            if (set2.contains(entry)) {
                return true;
            }
        }
        return false;
    }

}
