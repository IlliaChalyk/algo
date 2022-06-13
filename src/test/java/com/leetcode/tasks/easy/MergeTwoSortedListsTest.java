package com.leetcode.tasks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {
    private MergeTwoSortedLists sut = new MergeTwoSortedLists();

    @Test
    public void test0() {
        ListNode ln3 = new ListNode(5);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode head1 = new ListNode(1, ln2);
        ListNode ln4 = new ListNode(3);
        ListNode head2 = new ListNode(2, ln4);
        String expected = "1 2 3 4 5 ";

        ListNode merged = sut.mergeTwoLists(head1, head2);
        String actual = ListNodesToString(merged);

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        ListNode ln3 = new ListNode(5);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode head1 = new ListNode(1, ln2);
        ListNode ln4 = new ListNode(5);
        ListNode head2 = new ListNode(2, ln4);
        String expected = "1 2 4 5 5 ";

        ListNode merged = sut.mergeTwoLists(head1, head2);
        String actual = ListNodesToString(merged);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(2);
        String expected = "2 2 ";

        ListNode merged = sut.mergeTwoLists(head1, head2);
        String actual = ListNodesToString(merged);

        assertEquals(expected, actual);
    }

    @Test
    public void test22() {
        ListNode l2 = new ListNode(3);
        ListNode head1 = new ListNode(2, l2);
        ListNode head2 = new ListNode(2);
        String expected = "2 2 3 ";

        ListNode merged = sut.mergeTwoLists(head1, head2);
        String actual = ListNodesToString(merged);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        ListNode head1 = null;
        ListNode head2 = new ListNode(2);
        String expected = "2 ";

        ListNode merged = sut.mergeTwoLists(head1, head2);
        String actual = ListNodesToString(merged);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        ListNode head1 = null;
        ListNode head2 = null;
        String expected = "";

        ListNode merged = sut.mergeTwoLists(head1, head2);
        String actual = ListNodesToString(merged);

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        ListNode l12 = new ListNode(5);
        ListNode l11 = new ListNode(4, l12);
        ListNode head1 = new ListNode(2, l11);
        ListNode l21 = new ListNode(3);
        ListNode head2 = new ListNode(1, l21);
        String expected = "1 2 3 4 5 ";

        ListNode merged = sut.mergeTwoLists(head1, head2);
        String actual = ListNodesToString(merged);

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        ListNode l12 = new ListNode(3);
        ListNode l11 = new ListNode(2, l12);
        ListNode head1 = new ListNode(1, l11);
        ListNode l22 = new ListNode(3);
        ListNode l21 = new ListNode(2, l22);
        ListNode head2 = new ListNode(1, l21);
        String expected = "1 1 2 2 3 3 ";

        ListNode merged = sut.mergeTwoLists(head1, head2);
        String actual = ListNodesToString(merged);

        assertEquals(expected, actual);
    }

    private String ListNodesToString(ListNode listNodes) {
        StringBuilder res = new StringBuilder();
        for (ListNode i = listNodes; i != null; i = i.next) {
            res.append(i);
        }
        return res.toString();
    }
}