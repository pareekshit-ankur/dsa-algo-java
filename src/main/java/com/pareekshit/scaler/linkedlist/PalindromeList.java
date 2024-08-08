package main.java.com.pareekshit.scaler.linkedlist;

public class PalindromeList {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 1};
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        System.out.println(lPalin(head));
        arr = new int[]{1, 2, 3};
        head = new ListNode(arr[0]);
        curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        System.out.println(lPalin(head));
    }

    public static int lPalin(ListNode A) {
        if (A == null || A.next == null) {
            return 1;
        }
        ListNode curr = A;
        int len = 0, count = 0;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        ListNode p1 = A, p2;
        curr = A;
        if (len % 2 == 0) {
            while (count < len / 2 && curr != null) {
                curr = curr.next;
                count++;
            }
            p2 = reverseList(curr);
        } else {
            while (count < len / 2 && curr != null) {
                curr = curr.next;
                count++;
            }
            p2 = reverseList(curr.next);
        }
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return 0;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return 1;
    }

    public static ListNode reverseList(ListNode A) {
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
