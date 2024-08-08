package main.java.com.pareekshit.scaler.hashing;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 0, 1}, 1));
        System.out.println(solve(new int[]{0, 0, 0}, 0));

    }

    public static int solve(int[] A, int B) {
        int count = 0;
        long sum = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            sum += (A[i] % 1000000007);
            sum %= 1000000007;
            if (sum == B) {
                count++;
            }
            if (map.containsKey(sum - B)) {
                count += map.get(sum - B);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
