package main.java.com.pareekshit.scaler.linkedlist;

public class ReverseLinkedListTwo {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        //reverseBetween(l1, 4, 5);
        reverseBetween(l1, 1, 2);
    }

    public static ListNode reverseBetween(ListNode A, int B, int C) {

        if (A == null || A.next == null) {
            return A;
        }
        ListNode curr = A, startTail = null, endTail = null, from = null, to = null;
        int count = 1;
        while (curr != null) {
            if (count < B) {
                startTail = curr;
            }
            if (count == B) {
                from = curr;
            }
            if (count == C) {
                to = curr;
                endTail = to.next;
                break;
            }
            curr = curr.next;
            count++;
        }
        to.next = null;
        reverseList(from);
        if (startTail != null) {
            startTail.next = to;
        } else {
            A = to;
        }
        from.next = endTail;
        return A;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null, nxt, curr = head;

        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
