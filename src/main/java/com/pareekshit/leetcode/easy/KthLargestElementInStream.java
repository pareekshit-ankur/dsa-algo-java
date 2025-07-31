package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElementInStream {
    private int k;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            minHeap.add(num);
        }
        while (minHeap.size() > k) {
            minHeap.poll();
        }
    }

    public int add(int val) {
        List<Integer> list = new ArrayList<>();
        minHeap.add(val);
        while (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
