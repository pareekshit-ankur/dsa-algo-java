package main.java.com.pareekshit.scaler.heaps;

import main.java.com.pareekshit.Util;

import java.util.Collections;
import java.util.PriorityQueue;

public class ProductOfThree {
    public static void main(String[] args) {
        Util.printArray(solve(new int[]{1, 2, 3, 4, 5}));
    }

    public static int[] solve(int[] A) {
        int[] ans = new int[A.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            minHeap.add(A[i]);
            if (minHeap.size() < 3) {
                ans[i] = -1;
            } else {
                int num1 = minHeap.poll();
                int num2 = minHeap.poll();
                int num3 = minHeap.poll();
                ans[i] = num1 * num2 * num3;
                minHeap.add(num1);
                minHeap.add(num2);
                minHeap.add(num3);
            }
        }
        return ans;
    }
}
