package main.java.com.pareekshit.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumXor {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the maxXor function below.
    static int[] maxXor(int[] arr, int[] queries) {
        // solve here
        int[] result = new int[queries.length];
        int maxNumber = Arrays.stream(arr).max().getAsInt();
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int max = Integer.MIN_VALUE;
            if (query == 0) {
                max = query ^ maxNumber;
            } else {
                for (int num : arr) {
                    int res = query ^ num;
                    if (res > max) {
                        max = res;
                    }
                    if (max == Integer.MAX_VALUE) break;
                }
            }
            result[i] = max;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[m];

        for (int i = 0; i < m; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = maxXor(arr, queries);

        Arrays.stream(result).forEach(System.out::println);

        scanner.close();
    }
}
