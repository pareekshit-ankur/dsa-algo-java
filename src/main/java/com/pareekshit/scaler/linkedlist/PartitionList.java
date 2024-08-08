package main.java.com.pareekshit.scaler.linkedlist;

public class PartitionList {
    public static void main(String[] args) {

    }
    public static ListNode partition(ListNode A, int B) {
        ListNode head, temp = A, left = null, right = null, leftHead = null, rightHead = null;
        if (temp == null) {
            return null;
        }
        if (temp.val < B) {
            left = temp;
            head = left;
            leftHead = left;
        } else {
            right = temp;
            head = right;
            rightHead = right;
        }
        while (temp != null) {
            if (temp.val < B) {
                if (left == null) {
                    left = temp;
                } else {
                    left.next = temp;
                    left = left.next;
                }
            } else {
                if (right == null) {
                    right = temp;
                } else {
                    right.next = temp;
                    right = right.next;
                }
            }
            temp = temp.next;
        }
        if (leftHead != null) {
            left.next = rightHead;
        }
        return head;
    }
}
