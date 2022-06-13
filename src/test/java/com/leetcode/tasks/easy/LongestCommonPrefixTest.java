package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
    private LongestCommonPrefix sut = new LongestCommonPrefix();

    @Test
    public void test0() {
        String[] input = new String[]{"flower", "flow", "flight"};
        String expected = "fl";

        String actual = sut.longestCommonPrefix(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String[] input = new String[]{"dog", "racecar", "car"};
        String expected = "";

        String actual = sut.longestCommonPrefix(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String[] input = new String[]{"hello", "helloworld", "hell"};
        String expected = "hell";

        String actual = sut.longestCommonPrefix(input);

        assertEquals(expected, actual);
    }

}