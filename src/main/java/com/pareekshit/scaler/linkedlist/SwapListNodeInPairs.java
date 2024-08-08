package main.java.com.pareekshit.scaler.linkedlist;

import main.java.com.pareekshit.Util;

public class SwapListNodeInPairs {
    public static void main(String[] args) {
        int [] arr = new int[]{27,67,10,64,85,4};
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        Util.printLinkedList(swapPairs(head));
    }
    public static ListNode swapPairs(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode curr = A, nxt = A.next;
        while (curr.next != null) {
            int temp = curr.val;
            curr.val = nxt.val;
            nxt.val = temp;
            if (nxt.next == null){
                break;
            }
            curr = nxt.next;
            nxt = nxt.next.next;
        }
        return A;
    }
}
