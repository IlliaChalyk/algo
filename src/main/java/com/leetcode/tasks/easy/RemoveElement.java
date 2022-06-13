package com.leetcode.tasks.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[i - cur] = nums[i];
            } else {
                cur++;
            }
        }
        return nums.length - cur;
    }

    public int removeElementProposedSolution(int[] nums, int val) {
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[cur] = nums[i];
                cur++;
            }
        }
        return cur;
    }
}
