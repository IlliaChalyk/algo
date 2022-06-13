package com.leetcode.tasks.medium;

import com.leetcode.common.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;

        while (p != null || q != null) {
            int f = 0;
            int s = 0;

            if (p != null) {
                f = p.val;
                p = p.next;
            }
            if (q != null) {
                s = q.val;
                q = q.next;
            }

            int sum = f + s + carry;
            carry = sum / 10;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
        }
        if (carry != 0){
            tmp.next = new ListNode(carry);
        }

        return head.next;
    }
}
