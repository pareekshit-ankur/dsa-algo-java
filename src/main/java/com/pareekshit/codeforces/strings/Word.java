package main.java.com.pareekshit.codeforces.strings;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int lowerCaseCount = 0, upperCaseCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)))
                upperCaseCount++;
            else
                lowerCaseCount++;
        }
        if (upperCaseCount > lowerCaseCount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
