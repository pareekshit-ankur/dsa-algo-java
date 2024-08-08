package main.java.com.pareekshit.scaler.linkedlist;

public class RemoveLoopFromLinkedList {
    public static void main(String[] args) {
        ListNode l2 = new ListNode(2);
        ListNode l1 = new ListNode(1, l2);
        l2.next = l1;
        System.out.println(solve(l1));
    }

    public static ListNode solve(ListNode A) {
        if (A == null) {
            return null;
        }
        if (A.next == A) {
            A.next = null;
            return A;
        }

        ListNode slow = A, fast = A;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        ListNode start = A, startSlow = slow, prev = null;
        while (start != startSlow) {
            prev = startSlow;
            start = start.next;
            startSlow = startSlow.next;
        }
        prev.next = null;
        return A;
    }
}
