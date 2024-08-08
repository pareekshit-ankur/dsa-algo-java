package main.java.com.pareekshit.hackerrank.algorithms.strings;

import java.util.Scanner;

public class SeparateTheNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        String result = "YES";
        int jumpCount = 1;
        int num1, num2;
        for (int i = 0; i < s.length() - jumpCount; i++) {
            if (s.charAt(i) == '9') {
                num1 = Integer.parseInt(s.substring(i, i + jumpCount));
                jumpCount++;
                num2 = Integer.parseInt(s.substring(i + jumpCount, i + (2 * jumpCount)));
                if (num1 + 1 != num2) {
                    result = "NO";
                    break;
                }
            } else {
                if (Integer.parseInt(s.substring(i, i + jumpCount)) + 1 != Integer
                        .parseInt(s.substring(i + jumpCount, i + (2 * jumpCount)))) {
                    result = "NO";
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
