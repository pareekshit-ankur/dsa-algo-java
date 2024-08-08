package main.java.com.pareekshit.scaler.hashing;

import main.java.com.pareekshit.Util;

import java.util.HashMap;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        Util.printArray(dNums(new int[]{1, 2, 1, 3, 4, 3}, 3));
    }

    public static int[] dNums(int[] A, int B) {
        int[] ans = new int[A.length - B + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        ans[0] = map.size();
        int index = 1;
        for (int i = B; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if (map.get(A[i - B]) == 1) {
                map.remove(A[i - B]);
            } else {
                map.put(A[i - B], map.get(A[i - B]) - 1);
            }
            ans[index++] = map.size();
        }
        return ans;
    }
}
