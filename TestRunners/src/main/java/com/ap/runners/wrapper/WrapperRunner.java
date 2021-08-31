package com.ap.runners.wrapper;

import java.math.BigDecimal;
import java.util.HashMap;

import com.ap.runners.shared.BaseRunner;

public class WrapperRunner extends BaseRunner {
    public static void main(String[] args) {
        WrapperRunner wrapperRunner = new WrapperRunner();
        wrapperRunner.splitBigDecimal();
        //wrapperRunner.assignNullToPrimitive();
    }

    private void splitBigDecimal() {
        BigDecimal bd = BigDecimal.valueOf(8.30/2);
        writeLog("Without scale: " + bd + ". Working as expected", LogLevel.INFO);
        try {
            bd.setScale(2);
            writeLog("Error occurs only for odd values, even values will work as expected", LogLevel.KEY);
        } catch (ArithmeticException e) {
            writeLog("Setting scale without rounding mode causes ArithmeticException!!!", LogLevel.KEY);
        }
    }

    private void assignNullToPrimitive() {
        HashMap<String, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put("one", 1);

        try {
            int value = integerHashMap.get("two");
        } catch (NullPointerException e) {
            writeLog("Assigning null to primitive type throws NPE!!!", LogLevel.KEY);
        }
    }
}
