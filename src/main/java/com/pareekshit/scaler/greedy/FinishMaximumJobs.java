package main.java.com.pareekshit.scaler.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FinishMaximumJobs {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 5, 7, 1}, new int[]{7, 8, 8, 8}));
    }

    public static int solve(int[] A, int[] B) {
        List<Pair> lists = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            lists.add(new Pair(A[i], B[i]));
        }
        lists.sort(Comparator.comparingInt(Pair::getEnd));
        int ans = 1;
        int t = lists.get(0).end;
        for (int i = 1; i < A.length; i++) {
            if (lists.get(i).getStart() >= t) {
                ans++;
                t = lists.get(i).getEnd();
            }
        }
        return ans;
    }

    static class Pair {
        int start;
        int end;

        Pair(int i, int val) {
            start = i;
            end = val;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
