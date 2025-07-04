package main.java.com.pareekshit.leetcode.hard;

import main.java.com.pareekshit.leetcode.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));
        for (ListNode list : lists) {
            ListNode cur = list;
            while (cur != null) {
                minHeap.add(cur);
                cur = cur.next;
            }
        }
        ListNode head = minHeap.poll();
        ListNode cur = head;
        while (!minHeap.isEmpty()) {
            cur.next = minHeap.poll();
            cur = cur.next;
            if (minHeap.isEmpty()) {
                cur.next = null;
            }
        }
        return head;
    }
}
