package com.lph.jianzhi;

import java.util.ArrayList;

public class ReversePrintList {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 递归需要判断node和node next是否为空
     */
    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (listNode != null) {
                if (listNode.next != null)
                    list = printListFromTailToHead(listNode.next);
                list.add(listNode.val);
            }
            return list;
        }
    }
}
