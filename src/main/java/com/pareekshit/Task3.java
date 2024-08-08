package main.java.com.pareekshit;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int a[] = {0, 4, -1, 0, 3};
        int b[] = {0, -2, 5, 0, 3};
        System.out.println(solution(a, b));
    }

    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        long totalA = Arrays.stream(A).sum();
        long totalB = Arrays.stream(B).sum();
        long sumA = A[0], sumB = B[0];
        int count = 0;
        for (int i = 1; i < A.length && i < B.length; i++) {
            long diffA = totalA - sumA;
            long diffB = totalB - sumB;
            if ((sumB == diffB) && (sumA == sumB) && (diffA == diffB)) count++;
            sumA += A[i];
            sumB += B[i];
        }
        return count;
    }
}
