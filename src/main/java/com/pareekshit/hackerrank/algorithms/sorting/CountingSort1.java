package main.java.com.pareekshit.hackerrank.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort1 {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
        int[] counterArray = new int[100];
        Arrays.stream(arr).forEach(j -> counterArray[j] += 1);
        return counterArray;
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
