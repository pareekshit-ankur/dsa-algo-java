package main.java.com.pareekshit.scaler.queues;

import java.util.LinkedList;
import java.util.Queue;

public class ReversingElementsOfQueue {
    public int[] solve(int[] A, int B) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < B; i++) {
            queue.add(A[i]);
        }
        for (int i = B - 1; i >= 0; i--) {
            A[i] = queue.poll();
        }
        return A;
    }
}
