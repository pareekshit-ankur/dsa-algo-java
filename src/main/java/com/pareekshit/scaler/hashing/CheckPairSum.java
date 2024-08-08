package main.java.com.pareekshit.scaler.hashing;

import java.util.HashSet;

public class CheckPairSum {

    public static void main(String[] args) {
        System.out.println(solve(8, new int[]{3, 5, 1, 2, 1, 2}));
        System.out.println(solve(21, new int[]{9, 10, 7, 10, 9, 1, 5, 1, 5}));
    }

    public static int solve(int A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < B.length; i++) {
            if (set.contains(A - B[i])) {
                return 1;
            }
            set.add(B[i]);
        }
        return 0;
    }
}
