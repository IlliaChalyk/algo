package com.leetcode.tasks.easy;


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];
            while (!prefix.startsWith(curr)) {
                if (curr.length() <= 0) {
                    return "";
                }
                curr = curr.substring(0, curr.length() - 1);
            }
            prefix = curr;
        }

        return prefix;
    }
}
