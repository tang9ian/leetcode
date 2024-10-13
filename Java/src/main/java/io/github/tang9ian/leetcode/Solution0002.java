package io.github.tang9ian.leetcode;

public class Solution0002 {

    /*
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * Example:
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     */
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        
        ListNode head = new ListNode(0);
        ListNode p = head;

        int temp = 0;
        while (l1 != null || l2 != null || temp != 0) {

            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }

            p.next = new ListNode(temp % 10);
            p = p.next;
            temp = temp / 10;
        }
        return head.next;

    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2;
        } else {
            ListNode l3;
            if (l1.val + l2.val < 10) {
                l3 = new ListNode(l1.val + l2.val);
                l3.next = addTwoNumbers2(l1.next, l2.next);
            } else {
                l3 = new ListNode(l1.val + l2.val - 10);
                l3.next = addTwoNumbers2(l1.next, addTwoNumbers2(l2.next, new ListNode(1)));
            }
            return l3;
        }
    }
}
