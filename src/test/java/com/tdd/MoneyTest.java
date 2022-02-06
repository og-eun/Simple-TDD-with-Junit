package com.tdd;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    // 곱셈
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.ammount);
    }
}
