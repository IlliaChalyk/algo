package com.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {
    ContainerWithMostWater sut = new ContainerWithMostWater();

    @Test
    public void test0() {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;

        int actual = sut.maxArea(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        int[] input = new int[]{1, 1};
        int expected = 1;

        int actual = sut.maxArea(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] input = new int[]{4, 3, 2, 1, 4};
        int expected = 16;

        int actual = sut.maxArea(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] input = new int[]{1, 2, 4, 3};
        int expected = 4;

        int actual = sut.maxArea(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        int[] input = new int[]{2, 3, 4, 5, 18, 17, 6}; //15
        int expected = 17;

        int actual = sut.maxArea(input);

        assertEquals(expected, actual);
    }
}
