package main.java.com.pareekshit.scaler.linkedlist;

import main.java.com.pareekshit.Util;

public class KReverseLinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 11, 4, 12, 0};
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        Util.printLinkedList(reverseList(head, 1));
        arr = new int[]{1, 2, 3, 4, 5, 6};
        head = new ListNode(arr[0]);
        curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        Util.printLinkedList(reverseList(head, 2));
    }

    public static ListNode reverseList(ListNode A, int B) {
        ListNode head = null, tail = null;
        if (A == null || A.next == null) {
            return null;
        }
        ListNode curr = A;
        int len = 0;
        while (curr != null) {
            curr = curr.next;
            len++;
            if (len % B == 0) {
                if (head == null) {
                    head = reverseLinkedList(curr, B);
                } else {
                    tail = head;
                    while (tail.next != null) {
                        tail = tail.next;
                    }
                    tail.next = reverseLinkedList(curr, B);
                }
            }
        }
        return head;
    }

    public static ListNode reverseLinkedList(ListNode A, int position) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode prev = null, nxt = A, curr;
        int count = 0;
        while (nxt != null && count < position) {
            curr = nxt;
            nxt = nxt.next;
            curr.next = prev;
            prev = curr;
        }
        return prev;
    }
}
