package main.java.com.pareekshit.scaler.queues;

import java.util.Deque;
import java.util.LinkedList;

public class SumOfMinAndMax {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 5, -1, 7, -3, -1, -2}, 4));
    }

    public static int solve(int[] A, int B) {
        long sum = 0, mod = 1000000007;
        Deque<Integer> maxQueue = new LinkedList<>();
        Deque<Integer> minQueue = new LinkedList<>();
        for (int i = 0; i < B; i++) {
            while (!maxQueue.isEmpty() && A[maxQueue.getLast()] < A[i]) {
                maxQueue.removeLast();
            }
            maxQueue.addLast(i);
            while (!minQueue.isEmpty() && A[minQueue.getLast()] > A[i]) {
                minQueue.removeLast();
            }
            minQueue.addLast(i);

        }
        sum += A[maxQueue.getFirst()] + A[minQueue.getFirst()];
        for (int i = B; i < A.length; i++) {
            while (!maxQueue.isEmpty() && A[maxQueue.getLast()] < A[i]) {
                maxQueue.removeLast();
            }
            maxQueue.addLast(i);
            if (maxQueue.getFirst() == i - B) {
                maxQueue.removeFirst();
            }
            while (!minQueue.isEmpty() && A[minQueue.getLast()] > A[i]) {
                minQueue.removeLast();
            }
            minQueue.addLast(i);
            if (minQueue.getFirst() == i - B) {
                minQueue.removeFirst();
            }
            sum += (A[maxQueue.getFirst()] + A[minQueue.getFirst()]) % mod;
            sum %= mod;
        }
        return (int) (sum % mod);
    }
}
