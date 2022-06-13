package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NeedleInAHaystackTest {
    private NeedleInAHaystack sut = new NeedleInAHaystack();

    @Test
    public void test0() {
        String haystack = "hlello";
        String needle = "ll";
        int expected = 3;

        int actual = sut.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String haystack = "mississippi";
        String needle = "issip";
        int expected = 4;

        int actual = sut.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String haystack = "mississippi";
        String needle = "issipi";
        int expected = -1;

        int actual = sut.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String haystack = "a";
        String needle = "a";
        int expected = 0;

        int actual = sut.strStr(haystack, needle);

        assertEquals(expected, actual);
    }

}