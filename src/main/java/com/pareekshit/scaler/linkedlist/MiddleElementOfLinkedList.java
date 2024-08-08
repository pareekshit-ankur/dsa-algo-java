package main.java.com.pareekshit.scaler.linkedlist;

public class MiddleElementOfLinkedList {
    public int solve(ListNode A) {
        if (A == null || A.next == null) {
            return A.val;
        }
        ListNode slow = A, fast = A;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
