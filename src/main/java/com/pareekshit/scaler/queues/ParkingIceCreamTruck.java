package main.java.com.pareekshit.scaler.queues;

import main.java.com.pareekshit.Util;

import java.util.Deque;
import java.util.LinkedList;

public class ParkingIceCreamTruck {
    public static void main(String[] args) {
        Util.printArray(slidingMaximum(new int[]{1}, 1));
    }

    public static int[] slidingMaximum(final int[] A, int B) {
        int[] res = new int[A.length - B + 1];
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < B; i++) {
            while (!queue.isEmpty() && A[queue.getLast()] < A[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }
        res[0] = A[queue.getFirst()];
        int index = 1;
        for (int i = B; i < A.length; i++) {
            while (!queue.isEmpty() && A[queue.getLast()] < A[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
            if (queue.getFirst() == i - B) {
                queue.removeFirst();
            }
            res[index++] = A[queue.getFirst()];
        }
        return res;
    }
}
