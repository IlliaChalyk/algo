package com.leetcode.tasks.easy;

import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map =
                Map.of(
                        'I', 1,
                        'V', 5,
                        'X', 10,
                        'L', 50,
                        'C', 100,
                        'D', 500,
                        'M', 1000
                );

        int res = map.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            int prev = map.get(s.charAt(i - 1));

            if (curr > prev) {
                res += curr - prev * 2;
            } else {
                res += curr;
            }
        }

        return res;
    }
}
