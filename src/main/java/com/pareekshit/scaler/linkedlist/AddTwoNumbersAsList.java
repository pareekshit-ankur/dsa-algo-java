package main.java.com.pareekshit.scaler.linkedlist;

public class AddTwoNumbersAsList {
    public static void main(String[] args) {
        ListNode l3 = new ListNode(9);
        ListNode l2 = new ListNode(9, l3);
        ListNode l1 = new ListNode(9, l2);
        l2.next = l1;
        System.out.println(addTwoNumbers(new ListNode(1), l1));
    }

    public static ListNode addTwoNumbers(ListNode A, ListNode B) {
        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }
        ListNode h1 = A, h2 = B, head, curr;
        int carry = 0;
        int sum = h1.val + h2.val + carry;
        if (sum > 9) {
            carry = 1;
            head = new ListNode(sum % 10);

        } else {
            head = new ListNode(sum);
        }
        curr = head;
        h1 = h1.next;
        h2 = h2.next;
        while (h1 != null && h2 != null) {
            sum = h1.val + h2.val + carry;
            if (sum > 9) {
                carry = 1;
                curr.next = new ListNode(sum % 10);

            } else {
                curr.next = new ListNode(sum);
                carry = 0;
            }
            curr = curr.next;
            h1 = h1.next;
            h2 = h2.next;
        }
        while (h1 != null) {
            sum = h1.val + carry;
            if (sum > 9) {
                carry = 1;
                curr.next = new ListNode(sum % 10);

            } else {
                curr.next = new ListNode(sum);
                carry = 0;
            }
            curr = curr.next;
            h1 = h1.next;
        }
        while (h2 != null) {
            sum = h2.val + carry;
            if (sum > 9) {
                carry = 1;
                curr.next = new ListNode(sum % 10);

            } else {
                curr.next = new ListNode(sum);
                carry = 0;
            }
            curr = curr.next;
            h2 = h2.next;
        }
        if (carry == 1) {
            curr.next = new ListNode(1);
        }
        return head;
    }
}
