package main.java.com.pareekshit.scaler.linkedlist;

import main.java.com.pareekshit.Util;

public class ReorderList {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        Util.printLinkedList(reorderList(head));
    }

    public static ListNode reorderList(ListNode A) {
        ListNode mid = getMiddleOfList(A);
        ListNode h2 = reverseList(mid.next);
        mid.next = null;
        ListNode head = mergeTwoLists(A, h2);
        return head;
    }

    public static ListNode getMiddleOfList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode slow = A, fast = A;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverseList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode prev = null, nxt = A, curr;

        while (nxt != null) {
            curr = nxt;
            nxt = nxt.next;
            curr.next = prev;
            prev = curr;
        }
        return prev;
    }

    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }
        ListNode h1 = A, h2 = B, curr;
        h1 = h1.next;
        curr = A;
        while (h1 != null && h2 != null) {
            curr.next = h2;
            h2 = h2.next;
            curr = curr.next;
            curr.next = h1;
            h1 = h1.next;
            curr = curr.next;
        }
        if (h1 != null) {
            curr.next = h1;
        }
        if (h2 != null) {
            curr.next = h2;
        }
        return A;
    }
}
