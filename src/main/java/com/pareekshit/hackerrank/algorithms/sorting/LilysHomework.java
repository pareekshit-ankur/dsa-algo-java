package main.java.com.pareekshit.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class LilysHomework {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the lilysHomework function below.
    static int lilysHomework(int[] arr) {
        int swap = 0;
        int min;
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            min = Integer.MAX_VALUE;
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (arr[i] != arr[minIndex]) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swap++;
            }
        }
        return swap;
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

        int result = lilysHomework(arr);

        System.out.println(result);
        scanner.close();
    }
}
