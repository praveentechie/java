package com.ap.runners;

public class BooleanRunner {
    public static void main(String[] args) {
        BooleanRunner runner = new BooleanRunner();
        runner.compareNull();
        try {
            runner.nullBooleanToPrimitive();
        } catch (Exception e) {
            System.out.println("Unboxing null wrapper throws NullPointerException");
        }
        runner.assignPrimitiveToWrapper();
    }

    // TODO: Unboxing null wrapper throws NullPointerException
    private void nullBooleanToPrimitive() {
        Boolean wrapper = null;
        boolean primitive = wrapper;
        System.out.println("\n**************** nullBooleanToPrimitive result start ******************");
        System.out.println("wrapper " + wrapper + " primitive " + primitive);
        System.out.println("**************** nullBooleanToPrimitive result end ******************");
    }

    private void assignPrimitiveToWrapper() {
        boolean primitiveFalse = false;
        boolean primitiveTrue = true;
        Boolean wrapper = primitiveFalse;
        System.out.println("\n**************** assignPrimitiveToWrapper result start ******************");
        System.out.println("wrapper with false primitive " + wrapper);
        wrapper = primitiveTrue;
        System.out.println("wrapper with true primitive " + wrapper);
        System.out.println("Right way assigning primitive to wrapper");
        wrapper = new Boolean(primitiveTrue);
        System.out.println("**************** assignPrimitiveToWrapper result end ******************");
    }

    private void compareNull() {
        Boolean nullValue = null;
        System.out.println(Boolean.FALSE.equals(nullValue));
    }
}
