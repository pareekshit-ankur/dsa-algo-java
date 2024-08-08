package main.java.com.pareekshit.scaler.hashing;

import java.util.HashMap;

public class CountPairDifference {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 5, 1, 2}, 4));
        System.out.println(solve(new int[]{1, 2, 1, 2}, 1));
        System.out.println(solve(new int[]{2, 1, 2, 1, 2, 1, 2, 1, 2}, 1));

    }

    public static int solve(int[] A, int B) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : A) {
            if (map.containsKey(B + j)) {
                count += map.get(B + j);
            }
            if (map.containsKey(j - B)) {
                count += map.get(j - B);
            }
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        return count;
    }
}
