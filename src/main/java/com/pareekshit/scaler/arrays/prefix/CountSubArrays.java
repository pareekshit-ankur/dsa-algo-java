package main.java.com.pareekshit.scaler.arrays.prefix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CountSubArrays {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 3, 2}));
        System.out.println(optimal(new int[]{1, 1, 3, 2}));
    }

    public static int solveArrList(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                Set<Integer> set = new HashSet<>();
                boolean isUnique = true;
                for (int k = i; k <= j; k++) {
                    if (!set.add(A.get(k))) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int solve(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                Set<Integer> set = new HashSet<>();
                boolean isUnique = true;
                for (int k = i, p = 0; k <= j; k++, p++) {
                    if (!set.add(A[k])) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int optimal(int[] A) {
        int MOD = 1000000007;
        int n = A.length;
        int count = 0;
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();
        while (i < n && j < n) {
            if (!set.contains(A[j])) {
                set.add(A[j]);
                j++;
                count += j - i;
                count %= MOD;
            } else {
                set.remove(A[i]);
                i++;
            }
        }
        return count;
    }

}
