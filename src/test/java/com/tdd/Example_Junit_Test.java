package com.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Example_Junit_Test {
    @Test
    void testSum() {
        Example_Junit ex_jnuit = new Example_Junit();
        assertEquals(30, ex_jnuit.sum(10, 20));
    }
}
