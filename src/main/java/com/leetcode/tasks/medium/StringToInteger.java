package com.leetcode.tasks.medium;

public class StringToInteger {
    public int myAtoi(String s) {
        s = s.strip();
        if (s.length() <= 0) {
            return 0;
        }

        boolean isNegative = false;
        int res = 0;
        int cur = 0;

        if (s.charAt(0) == '-') {
            isNegative = true;
            cur++;
        }
        if (s.charAt(0) == '+') {
            cur++;
        }

        while (cur < s.length() && (s.charAt(cur) >= '0' && s.charAt(cur) <= '9')) {
            int pop = s.charAt(cur) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + pop;

            cur++;
        }

        return isNegative ? (res * -1) : (res);
    }
}
