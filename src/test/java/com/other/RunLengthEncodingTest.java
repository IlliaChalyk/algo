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
}
