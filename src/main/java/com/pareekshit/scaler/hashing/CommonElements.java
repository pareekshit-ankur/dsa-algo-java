package main.java.com.pareekshit.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer i : B) {
            if (map.containsKey(i)) {
                int value = map.get(i) - 1;
                if (value == 0) {
                    map.remove(i);
                } else {
                    map.put(i, value);
                }
                ans.add(i);
            }
        }
        return ans;
    }
}
