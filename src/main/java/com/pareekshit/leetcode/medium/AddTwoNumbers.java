package main.java.com.pareekshit.leetcode.medium;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        //Case 1
        /*ListNode l3 = new ListNode(3, null);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(2, l2);
        ListNode l6 = new ListNode(4, null);
        ListNode l5 = new ListNode(6, l6);
        ListNode l4 = new ListNode(5, l5);
        ListNode node = addTwoNumbers.addTwoNumbers(l1, l4);*/

        //Case 2
        /*ListNode l1 = new ListNode(5, null);
        ListNode l4 = new ListNode(5, null);
        ListNode node = addTwoNumbers.addTwoNumbers(l1, l4);*/

        //Case 3
        /*ListNode l1 = new ListNode(1, null);
        ListNode l5 = new ListNode(9, null);
        ListNode l4 = new ListNode(9, l5);*/


        //Case 4
        ListNode l2 = new ListNode(7, null);
        ListNode l1 = new ListNode(3, l2);
        ListNode l5 = new ListNode(2, null);
        ListNode l4 = new ListNode(9, l5);
        ListNode node = addTwoNumbers.addTwoNumbers(l1, l4);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1C = l1;
        ListNode l1P = l1;
        ListNode l2C = l2;
        int carry = 0;
        while (l1C != null && l2C != null) {
            l1P = l1C;
            int sum = l1C.val + l2C.val + carry;
            l1C.val = sum % 10;
            carry = sum / 10;
            l1C = l1C.next;
            l2C = l2C.next;
        }
        if (l2C != null) {
            l1P.next = l2C;
            while (l2C != null) {
                int sum = l2C.val + carry;
                l2C.val = sum % 10;
                carry = sum / 10;
                l2C = l2C.next;
            }
        } else if (l1C != null) {
            l1P.next = l1C;
            while (l1C != null) {
                int sum = l1C.val + carry;
                l1C.val = sum % 10;
                carry = sum / 10;
                l1C = l1C.next;
            }
        }
        if (carry != 0) {
            l1C = l1;
            while (l1C.next != null) {
                l1C = l1C.next;
            }
            ListNode carryNode = new ListNode(carry, null);
            l1C.next = carryNode;
        }
        return l1;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}