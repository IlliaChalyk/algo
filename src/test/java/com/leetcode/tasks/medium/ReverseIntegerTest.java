package com.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseIntegerTest {
    private ReverseInteger sut = new ReverseInteger();

    @Test
    public void test0() {
        int input = 123;
        int expected = 321;

        int actual = sut.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        int input = -123;
        int expected = -321;

        int actual = sut.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int input = 120;
        int expected = 21;

        int actual = sut.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int input = 5;
        int expected = 5;

        int actual = sut.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        int input = -7;
        int expected = -7;

        int actual = sut.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        int input = 2147483647;
        int expected = 0;

        int actual = sut.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        int input = 1003;
        int expected = 3001;

        int actual = sut.reverse(input);

        assertEquals(expected, actual);
    }
}
