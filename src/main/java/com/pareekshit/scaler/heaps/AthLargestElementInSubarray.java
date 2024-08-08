package main.java.com.pareekshit.scaler.heaps;

import main.java.com.pareekshit.Util;

import java.util.PriorityQueue;

public class AthLargestElementInSubarray {
    public static void main(String[] args) {
        Util.printArray(solve(4, new int[]{1, 2, 3, 4, 5, 6}));
    }

    public static int[] solve(int A, int[] B) {
        int[] ans = new int[B.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i = 0;
        for (; i < A; i++) {
            minHeap.add(B[i]);
            ans[i] = -1;
        }
        for (i = A - 1; i < B.length; i++) {
            ans[i] = minHeap.peek();
            if (minHeap.peek() < B[i]) {
                minHeap.poll();
                minHeap.add(B[i]);
            }
        }
        return ans;
    }
}
