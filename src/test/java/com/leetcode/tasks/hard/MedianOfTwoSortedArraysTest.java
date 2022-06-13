package com.leetcode.tasks.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArraysTest {
    public static final double DELTA = 0.0001;
    MedianOfTwoSortedArrays sut = new MedianOfTwoSortedArrays();

    @Test
    public void test0() {
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2};
        double expected = 2;

        double actual = sut.findMedianSortedArrays(a, b);

        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void test1() {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        double expected = 2.5;

        double actual = sut.findMedianSortedArrays(a, b);

        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void test2() {
        int[] a = new int[]{1, 3, 6};
        int[] b = new int[]{2, 5, 6};
        double expected = 4;

        double actual = sut.findMedianSortedArrays(a, b);

        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void test3() {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{2, 2, 5, 6};
        double expected = 2;

        double actual = sut.findMedianSortedArrays(a, b);

        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void test4() {
        int[] a = new int[]{1};
        int[] b = new int[]{};
        double expected = 1;

        double actual = sut.findMedianSortedArrays(a, b);

        Assertions.assertEquals(expected, actual, DELTA);
    }
}
