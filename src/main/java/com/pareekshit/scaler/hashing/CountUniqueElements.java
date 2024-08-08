package main.java.com.pareekshit.scaler.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountUniqueElements {

    public int solve(int[] A) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }
        return count;
    }
}
