package main.java.com.pareekshit.scaler.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapQueries {
    public int[] solve(int[][] A) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> pop = new ArrayList<>();
        for (int[] ints : A) {
            if (ints[0] == 1) {
                if (minHeap.isEmpty()) {
                    pop.add(-1);
                } else {
                    pop.add(minHeap.poll());
                }
            } else {
                minHeap.add(ints[1]);
            }
        }
        int[] arr = new int[pop.size()];
        for (int i = 0; i < pop.size(); i++) {
            arr[i] = pop.get(i);
        }
        return arr;
    }

}
