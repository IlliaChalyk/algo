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

    public String decode(String input) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
