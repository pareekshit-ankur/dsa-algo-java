package main.java.com.pareekshit.hackerrank.mathematics.fundamentals;

import java.io.IOException;
import java.util.Scanner;

public class SummingTheNSeries {

    private static final Scanner scanner = new Scanner(System.in);

    /*
     * Complete the summingSeries function below.
     */
    static int summingSeries(long n) {
        /*
         * Write your code here.
         */
        return (int) (((n % 1000000007) * (n % 1000000007)) % 1000000007);
    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = summingSeries(n);
            System.out.println(result);
            System.out.println("-------------------------------------------------------------");
        }

    }
}
