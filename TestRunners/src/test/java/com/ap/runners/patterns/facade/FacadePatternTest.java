package com.ap.runners.patterns.facade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FacadePatternTest {
    private FacadePattern pattern = new FacadePattern();

    @Test
    public void testFacadePattern() {
        assertEquals("Drawing circle", pattern.drawCircle());
        assertEquals("Drawing rectangle", pattern.drawRectangle());
        assertEquals("Drawing square", pattern.drawSquare());
    }
}
