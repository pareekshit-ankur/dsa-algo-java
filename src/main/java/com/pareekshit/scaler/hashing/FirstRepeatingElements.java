package main.java.com.pareekshit.scaler.hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElements {

    public int solve(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (Integer i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
