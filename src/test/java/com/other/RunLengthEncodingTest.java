package com.other;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RunLengthEncodingTest {
    RunLengthEncoder uut = new RunLengthEncoder();

    @Test
    public void shouldEncodeNullString() {
        String input = null;
        String expected = "";

        String actual = uut.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeStringOfSameRepetitiveCharacter() {
        String input = "fffff";
        String expected = "5f";

        String actual = uut.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeStringOfOneCharacter() {
        String input = "g";
        String expected = "1g";

        String actual = uut.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeAnEmptyString() {
        String input = "";
        String expected = "";

        String actual = uut.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeMixedCharactersString() {
        String input = "jjjrttnn";
        String expected = "3j1r2t2n";

        String actual = uut.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeStringWithSameCharacterOnBothSides() {
        String input = "ohhhgo";
        String expected = "1o3h1g1o";

        String actual = uut.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeNullString() {
        String input = null;
        String expected = "";

        String actual = uut.decode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeStringOfSameRepetitiveCharacter() {
        String input = "5f";
        String expected = "fffff";

        String actual = uut.decode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeStringOfOneCharacter() {
        String input = "1g";
        String expected = "g";

        String actual = uut.decode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeAnEmptyString() {
        String input = "";
        String expected = "";

        String actual = uut.decode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeMixedCharactersString() {
        String input = "3j1r2t2n";
        String expected = "jjjrttnn";

        String actual = uut.decode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeStringWithSameCharacterOnBothSides() {
        String input = "1o3h1g1o";
        String expected = "ohhhgo";

        String actual = uut.decode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeStringWithDigits() {
        String input = "11223518";
        String expected = "1225558";

        String actual = uut.decode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringWhenDecodeOddLengthString() {
        String input = "1d3g1";
        String expected = "";

        String actual = uut.decode(input);

        assertEquals(expected, actual);
    }
}
