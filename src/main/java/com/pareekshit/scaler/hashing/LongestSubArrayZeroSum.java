package main.java.com.pareekshit.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubArrayZeroSum {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, -2, 1, 2}));
        System.out.println(solve(new int[]{3, 2, -1}));
    }

    public static int solve(int[] A) {
        int max = 0;
        long sum = 0;
        HashMap<Long, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            sum %= 1000000007;
            if (sum == 0) {
                if (map.containsKey(0L)) {
                    max = Math.max(max, i - map.get(sum).get(0));
                } else {
                    max = Math.max(max, i + 1);
                }
            }
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum).get(0));
            } else {
                int finalI = i;
                map.put(sum,
                        new ArrayList<Integer>() {{
                            add(finalI);
                        }});
            }
        }
        return max;
    }
}
