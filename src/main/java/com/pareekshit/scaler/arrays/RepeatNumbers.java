package main.java.com.pareekshit.scaler.arrays;

import java.util.HashMap;
import java.util.Map;

public class RepeatNumbers {
    public static void main(String[] args) {
        System.out.println(repeatedNumber(new int[]{1, 2, 3, 1, 1}));
    }

    public static int repeatedNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : A) {
            if (map.get(i) > A.length / 3) {
                return i;
            }
        }
        return -1;
    }

    public static int repeatedNumber1(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : A) {
            if (map.get(i) > A.length / 3) {
                return i;
            }
        }
        return -1;
    }
}
