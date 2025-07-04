package main.java.com.pareekshit.hackerrank.algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class AppendAndDelete {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        /*String[] chars1 = s.trim().split("");
        String[] chars2 = t.trim().split("");
        int i;
        for (i = 0; i < chars1.length && i < chars2.length; i++) {
            if (chars1[i].equals(chars2[i]))
                continue;
            else
                break;
        }
        int moves;
        if (chars1.length - i > 0 && chars2.length - i != 0) {
            moves = i * 2 + (chars2.length - i);
        } else if (chars1.length - i == 0 && chars2.length - i != 0) {
            moves = (chars2.length - i);
        } else {
            moves = (chars1.length - i) + (chars2.length - i);
        }
        if (moves <= k)
            return "Yes";
        else
            return "No";*/

        int length_s = s.length();
        int length_t = t.length();
        if (k >= length_s + length_t) return "Yes";
        else {
            int differenciator = 0;
            int min_operations = 0;

            for (int i = 0; i < (Math.min(length_s, length_t)); i++) {
                if (s.charAt(i) == t.charAt(i)) differenciator++;
                else break;
            }

            min_operations = (length_s - differenciator) + (length_t - differenciator);

            if (k < min_operations) return "No";
            else if (k == min_operations) return "Yes";
            else {
                if (min_operations % 2 == 0) {
                    if (k % 2 == 0) return "Yes";
                    else return "No";
                } else {
                    if (k % 2 != 0) return "Yes";
                    else return "No";
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        scanner.close();
    }
}
