package main.java.com.pareekshit.scaler.linkedlist;

import main.java.com.pareekshit.Util;

public class IntersectionOfLinkedLists {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode head1 = new ListNode(arr[0]);
        ListNode curr = head1;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        arr = new int[]{6, 3, 4, 5};
        ListNode head2 = new ListNode(arr[0]);
        curr = head2;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        Util.printLinkedList(getIntersectionNode(head1, head2));
    }

    public static ListNode getIntersectionNode(ListNode A, ListNode B) {
        int lenA = 0;
        int lenB = 0;
        ListNode tempA = A, tempB = B;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        tempA = A;
        tempB = B;
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                tempA = tempA.next;
            }
        } else if (lenB > lenA) {
            for (int i = 0; i < lenB - lenA; i++) {
                tempB = tempB.next;
            }
        }
        while (tempB != null && tempA != null) {
            if (tempA.val == tempB.val) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}
