package main.java.com.pareekshit.hackerrank.algorithms.strings;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {
        int price = 0;
        Set<Character> characters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!characters.contains(c)) {
                price++;
                characters.add(c);
            }
        }
        return price;
    }

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = stringConstruction(s);

            System.out.println(result);
        }
        scanner.close();
    }
}
