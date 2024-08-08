package main.java.com.pareekshit.codeforces.strings;

import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        HashSet<Character> characters = new HashSet<>();
        for (char c : word.toCharArray()) {
            characters.add(c);
        }
        if (characters.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
