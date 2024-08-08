package main.java.com.pareekshit.hackerrank.mathematics.fundamentals;

import java.io.IOException;
import java.util.Scanner;

public class Handshake {
    /*
     * Complete the handshake function below.
     */
    static int handshake(int n) {
        /*
         * Write your code here.
         */
        int count = 0;
        if (n == 1) {
            return 0;
        } else {
            for (int i = n - 1; i > 0; i--) {
                count += i;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = handshake(n);

            System.out.println(result);
        }

    }
}
