package com.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    // Test 02. 곱셈 테스트
    // 결과: times 메소드 수행 시 Dollar 의 amount 값이 변경됨
    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);
        dollar.times(2);
        assertEquals(10, dollar.amount);
        dollar.times(3);
        assertEquals(15, dollar.amount);
    }
}
