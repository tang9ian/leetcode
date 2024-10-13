package io.github.tang9ian.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
class Solution0002Test {
    private final Solution0002 s0002 = new Solution0002();

    @Test
    public void addTwoNumbers() {
        // example 1
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        ListNode result = s0002.addTwoNumbers(l1, l2);

        assertTrue(compareLists(result, expected));

        // example 2
        // Input: l1 = [0], l2 = [0]
        // Output: [0]

        ListNode ll1 = new ListNode(0);
        ListNode ll2 = new ListNode(0);

        ListNode expected2 = new ListNode(0);

        ListNode result2 = s0002.addTwoNumbers(ll1, ll2);

        assertTrue(compareLists(result2, expected2));

        // example 3
        // Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        // Output: [8,9,9,9,0,0,0,1]

        ListNode lll1 = new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode lll2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode expected3 = new ListNode(8, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        ListNode result3 = s0002.addTwoNumbers(lll1, lll2);

        assertTrue(compareLists(result3, expected3));
    }

    @Test
    public void addTwoNumbers2() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        ListNode result = s0002.addTwoNumbers2(l1, l2);

        assertTrue(compareLists(result, expected));
        
        // example 2
        // Input: l1 = [0], l2 = [0]
        // Output: [0]

        ListNode ll1 = new ListNode(0);
        ListNode ll2 = new ListNode(0);

        ListNode expected2 = new ListNode(0);

        ListNode result2 = s0002.addTwoNumbers2(ll1, ll2);

        assertTrue(compareLists(result2, expected2));

        // example 3
        // Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        // Output: [8,9,9,9,0,0,0,1]

        ListNode lll1 = new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode lll2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode expected3 = new ListNode(8, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        ListNode result3 = s0002.addTwoNumbers2(lll1, lll2);

        assertTrue(compareLists(result3, expected3));
    }

    private boolean compareLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val)
                return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

}
