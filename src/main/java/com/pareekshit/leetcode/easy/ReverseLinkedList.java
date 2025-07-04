package main.java.com.pareekshit.leetcode.easy;

import main.java.com.pareekshit.Util;
import main.java.com.pareekshit.leetcode.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i <=5 ; i++) {
            ListNode node = new ListNode(i);
            temp.next = node;
            temp = temp.next;
        }
        Util.printLinkedList(head);
        head = reverseList(head);
        Util.printLinkedList(head);

    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode cur = head.next, prev = head;
        while(cur!=null){
            ListNode temp = cur;
            cur = cur.next;
            temp.next = prev;
            prev = temp;
        }
        head.next = null;
        return prev;
    }
}
