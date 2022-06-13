package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {
    private ValidParentheses sut = new ValidParentheses();

    @Test
    public void test0() {
        String input = "()";
        assertTrue(sut.isValid(input));
    }

    @Test
    public void test1() {
        String input = "()[]{}";
        assertTrue(sut.isValid(input));
    }

    @Test
    public void test2() {
        String input = "(({{}})[()]{})[]";
        assertTrue(sut.isValid(input));
    }

    @Test
    public void test3() {
        String input = "(]";
        assertFalse(sut.isValid(input));
    }

    @Test
    public void test4() {
        String input = "({[";
        assertFalse(sut.isValid(input));
    }

    @Test
    public void test5() {
        String input = ")))";
        assertFalse(sut.isValid(input));
    }

    @Test
    public void test6() {
        String input = "[[[";
        assertFalse(sut.isValid(input));
    }
}