package com.leetcode.tasks.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int cur = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[cur]) {
                cur++;
                nums[cur] = nums[i];
            }
        }

        return cur + 1;
    }
}
