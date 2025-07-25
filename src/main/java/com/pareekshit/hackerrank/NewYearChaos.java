package main.java.com.pareekshit.hackerrank;

import java.util.Scanner;

public class NewYearChaos {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        String tooChaotic = "Too chaotic";
        int minBribes = 0;
        boolean isChaotic = false;
        int counter = 0;
        for (int i = 0; i < q.length; i++) {
            if ((q[i] - (i + 1)) > 2) {
                isChaotic = true;
                break;
            } else {
                System.out.println("q[" + i + "]:" + q[i]);
                System.out.println("Max: " + Math.max(0, q[i] - 2));
                System.out.println("Bribes: " + minBribes);
                System.out.println("Counter: " + counter);
                for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                    counter++;
                    if (q[j] > q[i])
                        minBribes++;
                }
            }
        }
        if (isChaotic) {
            System.out.println(tooChaotic);
        } else {
            System.out.println(minBribes);
        }
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
