package main.java.com.pareekshit.leetcode.easy;

import main.java.com.pareekshit.leetcode.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode l6 = new ListNode(3, null);
        ListNode l5 = new ListNode(3, l6);
        ListNode l4 = new ListNode(3, l5);
        ListNode l3 = new ListNode(2, l4);
        ListNode l2 = new ListNode(1, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode node = deleteDuplicates(l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode temp = head != null ? current.next : null;
        while (temp != null) {
            if (current.val == temp.val) {
                temp = temp.next;
                current.next = temp;
            } else {
                current = current.next;
                temp = temp.next;
            }
        }

        return head;
    }

    public ListNode deleteDuplicatesWithRecursion(ListNode head) {
        if (head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }

}


