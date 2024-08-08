package main.java.com.pareekshit.hackerrank.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortPart1 {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * else if (arr[i] > num && i == 0) {
     * arr[i+1] = arr[i];
     * arr[i] = num;
     * }
     *
     * @param n
     * @param arr
     */
    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int num = arr[n - 1];
        int i = n - 2;
        boolean isPlaced = false;
        while (i >= 0 && !isPlaced) {
            if (arr[i] > num) {
                arr[i + 1] = arr[i];
            } else {
                arr[i + 1] = num;
                Arrays.stream(arr).mapToObj(operand -> operand + " ").forEach(System.out::print);
                isPlaced = true;
                break;
            }
            Arrays.stream(arr).mapToObj(operand -> operand + " ").forEach(System.out::print);
            System.out.println();
            i--;
        }
        if (!isPlaced) {
            arr[0] = num;
            Arrays.stream(arr).mapToObj(operand -> operand + " ").forEach(System.out::print);
        }
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

        insertionSort1(n, arr);

        scanner.close();
    }
}
