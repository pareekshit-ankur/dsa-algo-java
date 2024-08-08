package main.java.com.pareekshit.hackerrank.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort2 {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
        int[] counterArray = new int[100];
        Arrays.stream(arr).forEach(j -> counterArray[j] += 1);
        int index = 0;
        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] != 0) {
                for (int j = 0; j < counterArray[i]; j++) {
                    arr[index++] = i;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = countingSort(arr);

        Arrays.stream(result).mapToObj(j -> j + " ").forEach(System.out::print);
        System.out.println();
        scanner.close();
    }
}
