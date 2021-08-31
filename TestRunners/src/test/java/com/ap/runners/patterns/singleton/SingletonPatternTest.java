package com.ap.runners.patterns.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonPatternTest {
    @Test
    public void testSingletonAdditionalProperties() {
        System.out.println("\n********** Test singleton additional props value **********");
        SingletonPattern firstTry = SingletonPattern.getInstance();
        SingletonPattern secondTry = SingletonPattern.getInstance();
        SingletonPattern thirdTry = SingletonPattern.getInstance();
        System.out.println("First try " + firstTry.getAdditionalProperties());
        System.out.println("Second try " + secondTry.getAdditionalProperties());
        System.out.println("Third try " + thirdTry.getAdditionalProperties());

        assertEquals(firstTry, secondTry);
        assertEquals(thirdTry, secondTry);
    }

    @Test
    public void testSingletonHashCode() {
        System.out.println("\n********** Test singleton hash code **********");
        SingletonPattern firstTry = SingletonPattern.getInstance();
        SingletonPattern secondTry = SingletonPattern.getInstance();
        SingletonPattern thirdTry = SingletonPattern.getInstance();
        System.out.println("First try " + firstTry.hashCode());
        System.out.println("Second try " + secondTry.hashCode());
        System.out.println("Third try " + thirdTry.hashCode());

        assertEquals(firstTry.hashCode(), secondTry.hashCode());
        assertEquals(thirdTry.hashCode(), secondTry.hashCode());
    }
}
