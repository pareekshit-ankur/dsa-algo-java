package main.java.com.pareekshit.scaler.contest5;

import java.util.Collections;
import java.util.PriorityQueue;

public class WinnerStone {


    public int solve(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue <>(Collections.reverseOrder());
        for (int i : A) {
            maxHeap.add(i);
        }

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if (y - x > 0) {
                maxHeap.add(y - x);
            }
        }
        if (maxHeap.isEmpty()) {
            return 0;
        } else {
            return maxHeap.poll();
        }

    }


}
