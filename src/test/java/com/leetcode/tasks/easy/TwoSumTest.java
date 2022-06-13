package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
    private TwoSum sut = new TwoSum();

    @Test
    public void test0() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};

        int[] actual = sut.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] expected = new int[]{1, 2};

        int[] actual = sut.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] expected = new int[]{0, 1};

        int[] actual = sut.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}
