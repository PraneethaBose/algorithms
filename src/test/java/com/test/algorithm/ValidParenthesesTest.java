package com.test.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    private ValidParentheses validParenthesesUnderTest;

    @BeforeEach
    void setUp() {
        validParenthesesUnderTest = new ValidParentheses();
    }

    @Test
    void testIsValidTrue1() {
        assertTrue(validParenthesesUnderTest.isValid("()"));

    }

    @Test
    void testIsValidTrue2() {
        assertTrue(validParenthesesUnderTest.isValid("()[]{}"));
    }

    @Test
    void testIsValidTrue3() {
        assertTrue(validParenthesesUnderTest.isValid("{[]}"));
    }

    @Test
    void testIsValidFalse1() {
        assertFalse(validParenthesesUnderTest.isValid("(]"));
    }

    @Test
    void testIsValidFalse2() {
        assertFalse(validParenthesesUnderTest.isValid("([)]"));
    }

}
