package main.java.com.pareekshit.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MansaAndTheStones {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the stones function below.
    static int[] stones(int n, int a, int b) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n - 1; i++) {
            int val = (a * i) + a * (n - (i + 1));
            set.add(val);
            val = (b * i) + b * (n - (i + 1));
            set.add(val);
            val = (a * i) + b * (n - (i + 1));
            set.add(val);
            val = (b * i) + a * (n - (i + 1));
            set.add(val);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = stones(n, a, b);
            Arrays.stream(result).forEach(System.out::println);
        }
        scanner.close();
    }
}
