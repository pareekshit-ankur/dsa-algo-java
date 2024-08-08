package main.java.com.pareekshit.scaler.hashing;

import java.util.HashMap;
import java.util.Map;

public class ShaggyAndDistances {
    public int solve(int[] A) {
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                min = Math.min(min, i - map.get(A[i]));
            } else {
                map.put(A[i], i);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
