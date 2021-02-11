package com.ap.runners;

import java.math.BigDecimal;

public class WrapperRunner {
    public static void main(String[] args) {
        WrapperRunner wrapperRunner = new WrapperRunner();
        wrapperRunner.splitBigDecimal();
    }

    private void splitBigDecimal() {
        BigDecimal bd = BigDecimal.valueOf(8.32/2);
        bd.setScale(2);
        System.out.println(bd);
    }
}
