package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }

    public static int deleteGreatestValue(int[][] grid) {
        int ans = 0, max = 0;
        List<Queue<Integer>> list = new ArrayList<>();
        for (int[] ints : grid) {
            Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
            for (int i : ints) {
                maxHeap.add(i);
            }
            list.add(maxHeap);
        }
        int emptyCount = 0;
        while (emptyCount != list.size()) {
            for (Queue<Integer> integers : list) {
                if (!integers.isEmpty()) {
                    max = Math.max(max, integers.poll());
                } else {
                    emptyCount++;
                }
            }
            ans += max;
            max = 0;
        }
        return ans;
    }
}
