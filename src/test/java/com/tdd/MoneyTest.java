package com.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    // Test 01. 곱셈 테스트
    // 결과: 컴파일 에러(Dollar 클래스 없음, 생성자 없음, times(int) 메소드 없음, amount 필드 없음)
    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);
        dollar.times(2);
        assertEquals(10, dollar.amount);
        dollar.times(3);
        assertEquals(15, dollar.amount);
    }
}
