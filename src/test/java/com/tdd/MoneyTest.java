package com.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    // Test 03. 곱셈 테스트
    // 결과: 성공
    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);
        assertEquals(10, dollar.times(2));
        assertEquals(15, dollar.times(3));
    }
}
