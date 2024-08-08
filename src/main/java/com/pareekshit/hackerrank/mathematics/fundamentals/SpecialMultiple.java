package main.java.com.pareekshit.hackerrank.mathematics.fundamentals;

import java.io.IOException;
import java.util.Scanner;

public class SpecialMultiple {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the solve function below.
    static String solve(int n) {
        long num = 0;
        int remainder = 1;
        String number = "";

        while (num < Long.MAX_VALUE && remainder != 0) {
            num = Long.parseLong(number.concat("0"));
            if (num != 0 && num % n == 0) {

            }
            num = Long.parseLong(number.concat("9"));
        }
        return number;

    }

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = solve(n);

            System.out.println(result);
        }
        scanner.close();
    }
}
