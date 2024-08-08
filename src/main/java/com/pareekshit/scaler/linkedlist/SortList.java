package main.java.com.pareekshit.scaler.linkedlist;

import main.java.com.pareekshit.Util;

public class SortList {
    public static void main(String[] args) {
        //ListNode l5 = new ListNode(5);
        /*ListNode l4 = new ListNode(8);
        ListNode l3 = new ListNode(2, l4);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(3, l2);
        print(sortList(l1));*/
        int [] arr = new int[]{5,66,68,42,73,25,84,63,72,20,77,38,8,99,92,49,74,45,30,51,50,95,56,19,31,26,98,67,100,2,24,6,37,69,11,16,61,23,78,27,64,87,3,85,55,22,33,62};
        Util.printArray(arr);
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        Util.printLinkedList(sortList(head));
    }

    public static ListNode sortList(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode mid = getMiddleOfList(A);
        ListNode h1 = A, h2 = mid.next;
        mid.next = null;
        ListNode left = sortList(h1);
        ListNode right = sortList(h2);
        ListNode head = mergeTwoLists(left, right);
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
            h1 = h1.next;
        } else {
            head = B;
            h2 = h2.next;
        }
        curr = head;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                curr.next = h1;
                h1 = h1.next;
            } else {
                curr.next = h2;
                h2 = h2.next;
            }
            curr = curr.next;
        }
        if (h1 != null) {
            curr.next = h1;
        }
        if (h2 != null) {
            curr.next = h2;
        }
        return head;
    }
}
