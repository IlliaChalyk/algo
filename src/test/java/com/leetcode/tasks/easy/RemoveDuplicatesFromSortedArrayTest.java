package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray sut = new RemoveDuplicatesFromSortedArray();

    @Test
    public void shouldReturnProperCount() {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expected = 5;

        int actual = sut.removeDuplicates(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPermuteArray() {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        String expected = "0 1 2 3 4 ";

        int count = sut.removeDuplicates(input);
        String actual = getString(input, count);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPermuteArray2() {
        int[] input = new int[]{1, 1, 2, 3, 4, 4 };
        String expected = "1 2 3 4 ";

        int count = sut.removeDuplicates(input);
        String actual = getString(input, count);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPermuteArrayStartingWithFive() {
        int[] input = new int[]{5, 5, 6, 7, 7, 8 };
        String expected = "5 6 7 8 ";

        int count = sut.removeDuplicates(input);
        String actual = getString(input, count);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldWorkWithArrayOfOneElement() {
        int[] input = new int[]{0};
        String expected = "0 ";

        int count = sut.removeDuplicates(input);
        String actual = getString(input, count);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldWorkWithArrayOfTwoElements() {
        int[] input = new int[]{0, 2, 2, 3};
        String expected = "0 2 3 ";

        int count = sut.removeDuplicates(input);
        String actual = getString(input, count);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldWorkWithLeetCodeExample() {
        int[] input = new int[]{1, 1, 2};
        String expected = "1 2 ";

        int count = sut.removeDuplicates(input);
        String actual = getString(input, count);

        assertEquals(expected, actual);
    }

    private String getString(int[] input, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(input[i]).append(" ");
        }

        return sb.toString();
    }

}