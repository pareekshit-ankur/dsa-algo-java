package main.java.com.pareekshit.scaler.linkedlist;

public class ListNode {

    public int val;
    public ListNode next, down, right;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
        down = next = right = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(ListNode right, int val, ListNode down) {
        this.right = right;
        this.val = val;
        this.down = down;
    }
}
