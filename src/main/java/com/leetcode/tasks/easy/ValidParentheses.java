package com.leetcode.tasks.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur == '(' || cur == '[' || cur == '{') {
                stack.push(cur);
            }

            if (stack.isEmpty()) {
                return false;
            }

            if (cur == ')' && stack.pop() != '('
                    || cur == ']' && stack.pop() != '['
                    || cur == '}' && stack.pop() != '{') {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
