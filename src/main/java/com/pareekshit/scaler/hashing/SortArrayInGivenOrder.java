package main.java.com.pareekshit.scaler.hashing;

import java.util.Map;
import java.util.TreeMap;

public class SortArrayInGivenOrder {
    public int[] solve(int[] A, int[] B) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int index = 0;
        for (int i : B) {
            if (map.containsKey(i) && map.get(i) != -1) {
                int freq = map.get(i);
                for (int j = 0; j < freq; j++) {
                    A[index++] = i;
                }
                map.put(i, -1);
            }
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            int freq = integerIntegerEntry.getValue();
            for (int j = 0; j < freq; j++) {
                A[index++] = integerIntegerEntry.getKey();
            }
            map.put(integerIntegerEntry.getKey(), -1);
        }
        return A;
    }
}
