package com.ap.runners.patterns.facade;

import com.ap.runners.patterns.facade.impl.Circle;
import com.ap.runners.patterns.facade.impl.Rectangle;
import com.ap.runners.patterns.facade.impl.Shape;
import com.ap.runners.patterns.facade.impl.Square;

public class FacadePattern {
    /*
     * hides the complexities of the system and provides an interface to the client using which the client can access
     * the system
     * */
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public FacadePattern() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public String drawCircle() {
        return circle.draw();
    }

    public String drawRectangle() {
        return rectangle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }
}
