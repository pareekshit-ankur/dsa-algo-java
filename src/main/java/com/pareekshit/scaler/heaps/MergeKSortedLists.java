package main.java.com.pareekshit.scaler.heaps;

import main.java.com.pareekshit.scaler.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (ListNode listNode : a) {
            ListNode temp = listNode;
            while (temp!=null){
                minHeap.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode root = new ListNode(minHeap.poll());
        ListNode temp = root;
        while (!minHeap.isEmpty()){
            ListNode node = new ListNode(minHeap.poll());
            temp.next = node;
            temp = temp.next;
        }
        return root;
    }
}
