package com.leetcode.tasks.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = (left + right) / 2;
        while (left <= right && mid < nums.length) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return left;
    }
}
