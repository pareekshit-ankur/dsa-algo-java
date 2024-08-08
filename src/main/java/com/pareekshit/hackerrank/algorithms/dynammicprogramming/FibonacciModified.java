package main.java.com.pareekshit.hackerrank.algorithms.dynammicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

    // Complete the fibonacciModified function below.
    static BigInteger fibonacciModified(int t1, int t2, int n) {
        BigInteger num = BigInteger.ZERO;
        BigInteger n1 = BigInteger.valueOf(t1);
        BigInteger n2 = BigInteger.valueOf(t2);
        for (int i = 0; i < n - 2; i++) {
            num = n1.add(n2.multiply(n2));
            n1 = n2;
            n2 = num;
        }
        return num;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);

        BigInteger result = fibonacciModified(t1, t2, n);

        System.out.println(result);

        scanner.close();
    }
}
