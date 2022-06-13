package com.leetcode.tasks.medium;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (s.length() < 2 || numRows < 2 || s.length() <= numRows) {
            return s;
        }

        List<StringBuilder> strings = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            strings.add(new StringBuilder());
        }

        boolean up = false;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (i > 0 && (i) % (numRows - 1) == 0) {
                up = !up;
            }
            strings.get(j).append(s.charAt(i));
            j = up ? --j : ++j;
        }

        StringBuilder res = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            res.append(strings.get(i));
        }

        return res.toString();
    }
}
