package main.java.com.pareekshit.scaler.linkedlist;

import main.java.com.pareekshit.Util;

public class FlattenALinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 7};
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.down = new ListNode(arr[i]);
            curr = curr.down;
        }

        arr = new int[]{4, 11};
        ListNode head1 = new ListNode(arr[0]);
        curr = head1;
        for (int i = 1; i < arr.length; i++) {
            curr.down = new ListNode(arr[i]);
            curr = curr.down;
        }
        head.right = head1;
        Util.printLinkedListDown(flatten(head));
    }

    static ListNode flatten(ListNode root) {
        ListNode head = null, prev, curr;
        if (root == null || root.right == null) {
            return root;
        }
        prev = root;
        curr = root.right;
        prev.right = null;
        head = mergeTwoLists(head, prev);
        while (curr != null) {
            prev = curr;
            curr = curr.right;
            head = mergeTwoLists(head, prev);
        }
        return head;
    }

    public static ListNode mergeTwoLists(ListNode A, ListNode B) {
        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }
        ListNode head, h1 = A, h2 = B, curr;
        if (A.val < B.val) {
            head = A;
            h1 = h1.down;
        } else {
            head = B;
            h2 = h2.down;
        }
        curr = head;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                curr.down = h1;
                h1 = h1.down;
            } else {
                curr.down = h2;
                h2 = h2.down;
            }
            curr = curr.down;
        }
        if (h1 != null) {
            curr.down = h1;
        }
        if (h2 != null) {
            curr.down = h2;
        }
        return head;
    }
}
