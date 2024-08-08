package main.java.com.pareekshit.scaler.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInMatrix {
    public int solve(int[][] A, int B) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(B, Collections.reverseOrder());
        for (int[] ints : A) {
            for (int i : ints) {
                if (maxHeap.size() < B) {
                    maxHeap.add(i);
                } else if (!maxHeap.isEmpty() && maxHeap.size() == B && maxHeap.peek() > i) {
                    maxHeap.poll();
                    maxHeap.add(i);
                }
            }
        }
        return maxHeap.peek();
    }
}
