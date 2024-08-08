package main.java.com.pareekshit.scaler.linkedlist;

import main.java.com.pareekshit.Util;

public class RemoveNthNodeFromListEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        Util.printLinkedList(removeNthFromEnd(head, 5));
        Util.printLinkedList(removeNthFromEnd(head, 2));
        Util.printLinkedList(removeNthFromEnd(head, 6));
    }

    public static ListNode removeNthFromEnd(ListNode A, int B) {
        if (A == null || (A.next == null && B == 1)) {
            return null;
        }
        ListNode curr = A, prev = null;
        int len = 0, count = 0;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        if (B >= len) {
            return A.next;
        }
        curr = A;
        while (count < (len - B) && curr != null) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        if (prev != null && curr != null) {
            prev.next = curr.next;
        }
        return A;
    }
}
