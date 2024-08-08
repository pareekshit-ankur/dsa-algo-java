package main.java.com.pareekshit.scaler.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumArraySumAfterBNegations {
    public int solve(int[] A, int B) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int i : A) {
            minHeap.add(i);
        }
        for (int i = 0; i < B; i++) {
            int num = minHeap.poll();
            num *= -1;
            minHeap.add(num);
        }
        int count = 0;
        while (!minHeap.isEmpty()) {
            count += minHeap.poll();
        }
        return count;
    }
}
