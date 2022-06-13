package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {
    private PalindromeNumber sut = new PalindromeNumber();

    @Test
    public void test0() {
        int num = 101;
        boolean actual = sut.isPalindrome(num);

        assertTrue(actual);
    }

    @Test
    public void test1() {
        int num = 777;
        boolean actual = sut.isPalindrome(num);

        assertTrue(actual);
    }

    @Test
    public void test2() {
        int num = 10;
        boolean actual = sut.isPalindrome(num);

        assertFalse(actual);
    }

    @Test
    public void test3() {
        int num = 1002;
        boolean actual = sut.isPalindrome(num);

        assertFalse(actual);
    }

    @Test
    public void test4() {
        int num = 0;
        boolean actual = sut.isPalindrome(num);

        assertTrue(actual);
    }

    @Test
    public void test5() {
        int num = 5;
        boolean actual = sut.isPalindrome(num);

        assertTrue(actual);
    }
}
