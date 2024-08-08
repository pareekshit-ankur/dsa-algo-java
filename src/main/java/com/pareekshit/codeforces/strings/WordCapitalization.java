package main.java.com.pareekshit.codeforces.strings;

import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (Character.isUpperCase(word.charAt(0))) {
            System.out.println(word);
        } else {
            char c = (char) (word.charAt(0) - 32);
            System.out.print(c);
            System.out.print(word.substring(1));
        }
    }
}
