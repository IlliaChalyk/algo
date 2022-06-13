package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {
    private SearchInsertPosition sut = new SearchInsertPosition();

    @Test
    public void test0() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int target = 3;
        int expected = 2;

        int actual = sut.searchInsert(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        int[] input = new int[]{1, 3, 5, 6};
        int target = 2;
        int expected = 1;

        int actual = sut.searchInsert(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] input = new int[]{1, 3, 5, 6, 8};
        int target = 7;
        int expected = 4;

        int actual = sut.searchInsert(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] input = new int[]{1, 3, 5, 6, 8};
        int target = 9;
        int expected = 5;

        int actual = sut.searchInsert(input, target);

        assertEquals(expected, actual);
    }
}
