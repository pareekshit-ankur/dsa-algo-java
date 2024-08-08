package main.java.com.pareekshit.scaler.sortng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class NobleIntegers {
    public static void main(String[] args) {
        System.out.println(solve(new Integer[]{5, 6, 2}));
        System.out.println(solve(new Integer[]{-4, -2, 0, -1, -6}));
    }

    public static int solve(Integer[] A) {
        Arrays.sort(A, Comparator.reverseOrder());
        int res = -1, count = 0;
        if (A[0] == 0) {
            return 1;
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                count = i;
            }
            if (A[i] == count) {
                return 1;
            }
        }
        return res;
    }

    public int solve(ArrayList<Integer> A) {
        A.sort(Comparator.reverseOrder());
        int res = -1, count = 0;
        if (A.get(0) == 0) {
            return 1;
        }
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) < A.get(i - 1)) {
                count = i;
            }
            if (A.get(i) == count) {
                return 1;
            }
        }
        return res;
    }
}
