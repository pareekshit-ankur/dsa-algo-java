package main.java.com.pareekshit.scaler.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode A) {
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
}
