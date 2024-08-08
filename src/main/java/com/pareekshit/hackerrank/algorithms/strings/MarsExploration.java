package main.java.com.pareekshit.hackerrank.algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

public class MarsExploration {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        int changedLetters = 0;
        char[] charecters = s.toCharArray();
        for (int i = 0; i < charecters.length; i++) {
            int mod = i % 3;
            if ((mod == 0 || mod == 2) && charecters[i] != 'S') {
                changedLetters++;
            } else if (mod == 1 && charecters[i] != 'O') {
                changedLetters++;
            }
        }
        return changedLetters;
    }

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        int result = marsExploration(s);

        System.out.println(result);
        scanner.close();
    }
}
