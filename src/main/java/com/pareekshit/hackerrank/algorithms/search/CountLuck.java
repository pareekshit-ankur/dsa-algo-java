package main.java.com.pareekshit.hackerrank.algorithms.search;

import java.util.Scanner;

//TODO complete the program
public class CountLuck {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the countLuck function below.
    static String countLuck(String[] matrix, int k) {
        int count = 0;
        for (String s : matrix) {
            System.out.println(s);
            for (char c : s.toCharArray()) {
                if (c == '1')
                    count++;
            }
        }
        return count == k ? "Impressed" : "Oops!";
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            String[] matrix = new String[n];

            for (int i = 0; i < n; i++) {
                String matrixItem = scanner.nextLine();
                matrix[i] = matrixItem;
            }

            int k = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = countLuck(matrix, k);
            System.out.println(result);
        }

        scanner.close();
    }
}
