package main.java.com.pareekshit.scaler.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class ConnectingRopes {
    public int solve(int[] A) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int i : A) {
            minHeap.add(i);
        }
        int count = 0;
        while (minHeap.size() > 1) {
            int val1 = minHeap.poll();
            int val2 = minHeap.poll();
            count += (val1 + val2);
            minHeap.add(val1 + val2);
        }
        return count;
    }
}
