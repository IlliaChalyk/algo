package com.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ThreeSumTest {
    ThreeSum sut = new ThreeSum();

    @Test
    public void test0() {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );

        List<List<Integer>> actual = sut.threeSum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        int[] input = new int[]{};
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> actual = sut.threeSum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] input = new int[]{0};
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> actual = sut.threeSum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] input = new int[]{-2, -2, -2, 0, 0, 0, 2, 2, 2};
        List<List<Integer>> expected = List.of(
                List.of(-2, 0, 2),
                List.of(0, 0, 0)
        );

        List<List<Integer>> actual = sut.threeSum(input);

        assertEquals(expected, actual);
    }
}
