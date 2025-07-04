package main.java.com.pareekshit.leetcode.medium;

import main.java.com.pareekshit.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        while (curr != null) {
            if (nodes.contains(curr)) {
                return curr;
            }
            nodes.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
