package main.java.com.pareekshit.scaler.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class BuildAHeap {
    public int[] buildHeap(int[] A) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int i : A) {
            minHeap.add(i);
        }
        int[] ans = new int[A.length];
        int index = 0;
        while (!minHeap.isEmpty()) {
            ans[index++] += minHeap.poll();
        }
        return ans;
    }
}
