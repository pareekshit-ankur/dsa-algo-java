package main.java.com.pareekshit.scaler.linkedlist;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode curr = A, nxt = A.next;
        while (nxt != null) {
            if (curr.val == nxt.val) {
                nxt = nxt.next;
                curr.next = nxt;
            } else {
                curr = curr.next;
                nxt = nxt.next;
            }
        }
        return A;
    }
}
