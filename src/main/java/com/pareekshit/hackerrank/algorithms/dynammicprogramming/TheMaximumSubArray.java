package main.java.com.pareekshit.hackerrank.algorithms.dynammicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class TheMaximumSubArray {

    // Complete the maxSubarray function below.
    static int[] maxSubarray(int[] arr) {
        int[] result = new int[2];
        int count;
        int max = Integer.MIN_VALUE;
        int subsequence = 0;
        if (isAllElementsNegative(arr)) {
            max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
            result[0] = max;
            result[1] = max;
        } else if (isNegativeElementPresent(arr)) {
            for (int i = 0; i < arr.length; i++) {
                count = 0;
                for (int j = i; j < arr.length; j++) {
                    count += arr[j];
                    if (max < count) {
                        max = count;
                    }
                }
                if (arr[i] >= 0) subsequence += arr[i];
            }
            result[0] = max;
            result[1] = subsequence;
        } else {
            count = Arrays.stream(arr).sum();
            result[0] = count;
            result[1] = count;
        }
        return result;
    }

    private static boolean isNegativeElementPresent(int[] arr) {
        return Arrays.stream(arr).anyMatch(j -> j < 0);
    }

    private static boolean isAllElementsNegative(int[] arr) {
        return Arrays.stream(arr).noneMatch(j -> j >= 0);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = maxSubarray(arr);

            Arrays.stream(result).forEach(System.out::println);

        }

        scanner.close();
    }
}
