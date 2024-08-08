package main.java.com.pareekshit.scaler.maths;

import java.util.Arrays;

public class CountOfDivisors {
    public static int max = 1000000;
    public static int[] spfArr = getSpf();

    public static int[] getSpf() {
        int[] spf = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= max; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= max; j = j + i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        return spf;
    }

    public static void main(String[] args) {
        Arrays.stream(solve(new int[]{2, 3, 4, 5})).forEach(System.out::println);
    }

    public static int[] solve(int[] A) {
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = getFactors(A[i]);
        }
        return ans;
    }

    public static int getFactors(int n) {
        int u = spfArr[n];
        int ans = 1;
        while (n > 1) {
            int count = 0;
            while (n % u == 0) {
                count++;
                n /= u;
            }
            u = spfArr[n];
            ans *= (count + 1);
        }
        return ans;
    }
}
