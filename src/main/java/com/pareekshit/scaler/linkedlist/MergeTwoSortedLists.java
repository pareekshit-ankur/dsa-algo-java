package main.java.com.pareekshit.scaler.linkedlist;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
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
