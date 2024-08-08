package main.java.com.pareekshit.scaler.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class InventoryManagement {
    public int solve(int[] A, int[] B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Pair> lists = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            lists.add(new Pair(A[i], B[i]));
        }
        lists.sort(Comparator.comparingInt(Pair::getExpiry).thenComparingInt(Pair::getProfit));
        long sum = 0;
        int t = 0;
        for (int i = 0; i < A.length; i++) {
            if (t < lists.get(i).getExpiry()) {
                sum += lists.get(i).getProfit();
                minHeap.add(lists.get(i).getProfit());
                t++;
            } else if (!minHeap.isEmpty() && (lists.get(i).getProfit() > minHeap.peek())) {
                sum -= minHeap.poll();
                sum += lists.get(i).getProfit();
                minHeap.add(lists.get(i).getProfit());
            }
        }
        return (int) (sum % 1000000007);
    }

    static class Pair {
        int expiry;
        int profit;

        Pair(int i, int val) {
            expiry = i;
            profit = val;
        }

        public int getExpiry() {
            return expiry;
        }

        public int getProfit() {
            return profit;
        }
    }
}
