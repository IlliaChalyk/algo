package com.leetcode.tasks.easy;

import com.leetcode.common.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode head;
        ListNode tmp1 = list1;
        ListNode tmp2 = list2;

        if (tmp1.val < tmp2.val) {
            head = tmp1;
            tmp1 = tmp1.next;
        } else {
            head = tmp2;
            tmp2 = tmp2.next;
        }

        ListNode curr = head;
        while (tmp1 != null && tmp2 != null) {
            if (tmp1.val <= tmp2.val) {
                curr.next = tmp1;
                tmp1 = tmp1.next;
            } else {
                curr.next = tmp2;
                tmp2 = tmp2.next;
            }
            curr = curr.next;
        }
        curr.next = tmp1 != null ? tmp1 : tmp2;

        return head;
    }
}

