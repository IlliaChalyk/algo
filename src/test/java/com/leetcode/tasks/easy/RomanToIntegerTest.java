package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanToIntegerTest {
    private RomanToInteger sut = new RomanToInteger();

    @Test
    public void test0() {
        String input = "III";
        int expected = 3;

        int actual = sut.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String input = "LVIII";
        int expected = 58;

        int actual = sut.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String input = "MCMXCIV";
        int expected = 1994;

        int actual = sut.romanToInt(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String input = "IV";
        int expected = 4;

        int actual = sut.romanToInt(input);

        assertEquals(expected, actual);
    }
}
