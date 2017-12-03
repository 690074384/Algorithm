package com.lph.jianzhi;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0)
            return null;
        ListNode p = head;
        ListNode q = head;
        for (int i = 1; i < k; i++) {
            if (p.next != null)
                p = p.next;
            else
                return null;
        }
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
