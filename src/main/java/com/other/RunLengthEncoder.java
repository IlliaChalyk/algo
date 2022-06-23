package com.other;

public class RunLengthEncoder {
    public String encode(String input) {
        if(input == null || input.length() < 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char[] inputChars = input.toCharArray();
        char prev = 0;
        int counter = 0;

        for (char curr : inputChars) {
            if(curr == prev) {
                counter++;
            } else {
                if (prev != 0){
                    sb.append(counter).append(prev);
                }
                prev = curr;
                counter = 1;
            }
        }
        sb.append(counter).append(prev);

        return sb.toString();
    }

    /**
     * This method can decode only even-length strings with [0, 10)
     * repeats of single character, otherwise the result is uncertain.
     */
    public String decode(String input) {
        if(input == null || input.length() < 1 || input.length() % 2 != 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i +=2) {
            int times = Integer.parseInt("" + input.charAt(i));
            char ch = input.charAt(i + 1);
            StringBuilder segment = repeat(ch, times);
            sb.append(segment);
        }

        return sb.toString();
    }

    private StringBuilder repeat(char ch, int times) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < times; i++) {
            sb.append(ch);
        }

        return sb;
    }
}
