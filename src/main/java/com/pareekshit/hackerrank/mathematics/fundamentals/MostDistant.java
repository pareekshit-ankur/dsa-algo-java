package main.java.com.pareekshit.hackerrank.mathematics.fundamentals;

import java.io.IOException;
import java.util.Scanner;

public class MostDistant {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the solve function below.
    static double solve(int[][] coordinates) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < coordinates.length - 1; i++) {
            int diff = 0;
            if (coordinates[i][0] == coordinates[i + 1][0]) {
                diff = Math.abs(coordinates[i][1] - coordinates[i + 1][1]);
            } else if (coordinates[i][1] == coordinates[i + 1][1]) {
                diff = Math.abs(coordinates[i][0] - coordinates[i + 1][0]);
            }
            if (max < diff) {
                max = diff;
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] coordinates = new int[n][2];

        for (int coordinatesRowItr = 0; coordinatesRowItr < n; coordinatesRowItr++) {
            String[] coordinatesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int coordinatesColumnItr = 0; coordinatesColumnItr < 2; coordinatesColumnItr++) {
                int coordinatesItem = Integer.parseInt(coordinatesRowItems[coordinatesColumnItr]);
                coordinates[coordinatesRowItr][coordinatesColumnItr] = coordinatesItem;
            }
        }

        double result = solve(coordinates);
        System.out.println(result);
        scanner.close();
    }
}
