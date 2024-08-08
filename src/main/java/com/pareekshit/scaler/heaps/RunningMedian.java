package main.java.com.pareekshit.scaler.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {
    public int[] solve(int[] A) {
        int[] ans = new int[A.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            if (maxHeap.isEmpty() || A[i] <= maxHeap.peek()) {
                maxHeap.add(A[i]);
                if (maxHeap.size() - minHeap.size() > 1) {
                    minHeap.add(maxHeap.poll());
                }
            } else {
                minHeap.add(A[i]);
                if (minHeap.size() - maxHeap.size() > 0) {
                    maxHeap.add(minHeap.poll());
                }
            }
            ans[i] = maxHeap.peek();
        }
        return ans;
    }
}
