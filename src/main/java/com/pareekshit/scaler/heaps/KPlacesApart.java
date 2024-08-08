package main.java.com.pareekshit.scaler.heaps;

import main.java.com.pareekshit.Util;

import java.util.PriorityQueue;

public class KPlacesApart {
    public static void main(String[] args) {
        Util.printArray(solve(new int[]{1, 40, 2, 3}, 2));
        Util.printArray(solve(new int[]{4, 7, 9}, 0));
        Util.printArray(solve(new int[]{25, 16, 11, 31, 28, 20, 3, 8}, 6));
    }

    public static int[] solve(int[] A, int B) {
        if (B == 0) return A;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(B + 1);
        int i = 0;
        for (; i <= B; i++) {
            minHeap.add(A[i]);
        }
        int index = 0;
        for (i = B + 1; i < A.length; i++) {
            A[index++] = minHeap.poll();
            minHeap.add(A[i]);
        }
        while (!minHeap.isEmpty()) {
            A[index++] = minHeap.poll();
        }
        return A;
    }
}
