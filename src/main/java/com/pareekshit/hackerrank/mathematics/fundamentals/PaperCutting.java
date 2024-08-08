package main.java.com.pareekshit.hackerrank.mathematics.fundamentals;

import java.io.IOException;
import java.util.Scanner;

public class PaperCutting {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the solve function below.
    static long solve(int n, int m) {
        return ((long) n * m) - 1;

    }

    public static void main(String[] args) throws IOException {
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long result = solve(n, m);

        System.out.println(result);

        scanner.close();
    }
}
