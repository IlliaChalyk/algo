package com.leetcode.tasks.hard;

/**
 * My comment:
 *  I don't quite get the solution, I've copied it from
 *  YouTube explanation video, I've got some concepts, yet
 *  I probably would newer come up with this solution.
 *  I still have a room to grow, though :)
 * (5/22/2022)
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arrA = nums1;
        int[] arrB = nums2;

        if (arrB.length < arrA.length) {
            arrA = nums2;
            arrB = nums1;
        }

        int totalLength = arrA.length + arrB.length;
        int half = totalLength / 2;

        int left = -1;
        int right = arrA.length - 1;
        while (true) {
            int aMid = (right + left) / 2;
            int bMid = half - aMid - 2;

            double aLeft = aMid >= 0
                    ? arrA[aMid]
                    : Double.NEGATIVE_INFINITY;
            double aRight = aMid + 1 < arrA.length
                    ? arrA[aMid + 1]
                    : Double.POSITIVE_INFINITY;

            double bLeft = bMid >= 0
                    ? arrB[bMid]
                    : Double.NEGATIVE_INFINITY;
            double bRight = bMid + 1 < arrB.length
                    ? arrB[bMid + 1]
                    : Double.POSITIVE_INFINITY;

            if (aLeft <= bRight && bLeft <= aRight) {
                if (totalLength % 2 == 0) {
                    double lp = Math.max(aLeft, bLeft);
                    double rp = Math.min(aRight, bRight);
                    return (lp + rp) / 2;
                }
                return Math.min(aRight, bRight);
            } else if (bLeft > aLeft) {
                left = aMid + 1;
            } else {
                right = aMid - 1;
            }
        }
    }
}
