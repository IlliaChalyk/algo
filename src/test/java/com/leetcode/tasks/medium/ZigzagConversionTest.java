package com.leetcode.tasks.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ZigzagConversionTest {
    private ZigzagConversion sut = new ZigzagConversion();

    @Test
    public void test0() {
        String input = "PAYPALISHIRING";
        int numOgRows = 3;
        String expected = "PAHNAPLSIIGYIR";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String input = "PAYPALISHIRING";
        int numOgRows = 4;
        String expected = "PINALSIGYAHRPI";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String input = "PAYPALISHIRING";
        int numOgRows = 1;
        String expected = "PAYPALISHIRING";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String input = "A";
        int numOgRows = 2;
        String expected = "A";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String input = "HELLO";
        int numOgRows = 5;
        String expected = "HELLO";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String input = "HELLOWORLD";
        int numOgRows = 10;
        String expected = "HELLOWORLD";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String input = "HELLOWORLD";
        int numOgRows = 15;
        String expected = "HELLOWORLD";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        String input = "HELLOWORLD";
        int numOgRows = 2;
        String expected = "HLOOLELWRD";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        String input = "HELLOWORLD";
        int numOgRows = 4;
        String expected = "HOEWRLOLLD";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        String input = "HELLOWORLD";
        int numOgRows = 3;
        String expected = "HOLELWRDLO";

        String actual = sut.convert(input, numOgRows);

        assertEquals(expected, actual);
    }
}