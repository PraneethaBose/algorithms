package com.test.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    private MinStack minStackUnderTest;

    @BeforeEach
    void setUp() {
        minStackUnderTest = new MinStack();
        minStackUnderTest.push(-2);
        minStackUnderTest.push(0);
        minStackUnderTest.push(-3);
    }

    @Test
    void testMinStackGetMinCheck() {
        assertEquals(-3,minStackUnderTest.getMin());
    }

    @Test
    void testTop(){
        minStackUnderTest.pop();
        assertEquals(0, minStackUnderTest.top());
    }

    @Test
    void testGetMinAfterPop(){
        minStackUnderTest.pop();
        assertEquals(-2,minStackUnderTest.getMin());
    }
}
