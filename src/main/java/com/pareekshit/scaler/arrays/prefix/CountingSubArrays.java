package main.java.com.pareekshit.scaler.arrays.prefix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountingSubArrays {
    public static void main(String[] args) {
        /*System.out.println(solveBruteForce(new int[]{1, 11, 2, 3, 15}, 10));
        System.out.println(solveOptimal1(new int[]{1, 11, 2, 3, 15}, 10));
        System.out.println(solveOptimal2(new int[]{1, 11, 2, 3, 15}, 10));*/
        System.out.println(solveBruteForce(new int[]{3, 12, 11, 11, 11, 15}, 12));
        System.out.println(solveOptimal1(new int[]{3, 12, 11, 11, 11, 15}, 12));
        System.out.println(solveOptimal2(new int[]{3, 12, 11, 11, 11, 15}, 12));
    }

    public static int solveBruteForce(int[] A, int B) {
        Collections.sort(new ArrayList<Integer>(), Comparator.reverseOrder());
        int count = 0, n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                if (sum < B) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static int solveOptimal1(int[] A, int B) {
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        int count = 0, n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                if (sum < B) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static int solveOptimal2(int[] A, int B) {
        int count = 0, n = A.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (sum < B) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
