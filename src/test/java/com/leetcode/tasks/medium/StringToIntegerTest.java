package com.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringToIntegerTest {
    private StringToInteger sut = new StringToInteger();

    @Test
    public void test0() {
        String input = "524";
        int expected = 524;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String input = "-524";
        int expected = -524;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String input = "+700";
        int expected = 700;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String input = "9" + Integer.MAX_VALUE;
        int expected = Integer.MAX_VALUE;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String input = Integer.MIN_VALUE + "92";
        int expected = Integer.MIN_VALUE;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String input = "26hello";
        int expected = 26;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String input = "hello 26";
        int expected = 0;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        String input = "  26";
        int expected = 26;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        String input = " ";
        int expected = 0;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        String input = "-2147483649";
        int expected = -2147483648;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        String input = Long.MAX_VALUE + "";
        int expected = Integer.MAX_VALUE;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        String input = Long.MIN_VALUE + "";
        int expected = Integer.MIN_VALUE;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

}