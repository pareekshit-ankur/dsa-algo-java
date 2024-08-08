package main.java.com.pareekshit.hackerrank.mathematics.fundamentals;

import java.util.Scanner;

public class FillingJars {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the solve function below.
    static int solve(int n, int[][] operations) {
        long sum = 0;
        for (int[] operation : operations) {
            sum += ((operation[1] - operation[0]) + 1) * operation[2];
        }
        return (int) Math.floor(sum / n);
    }

    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] operations = new int[m][3];

        for (int operationsRowItr = 0; operationsRowItr < m; operationsRowItr++) {
            String[] operationsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int operationsColumnItr = 0; operationsColumnItr < 3; operationsColumnItr++) {
                int operationsItem = Integer.parseInt(operationsRowItems[operationsColumnItr]);
                operations[operationsRowItr][operationsColumnItr] = operationsItem;
            }
        }

        int result = solve(n, operations);
        System.out.println(result);
        scanner.close();
    }
}
