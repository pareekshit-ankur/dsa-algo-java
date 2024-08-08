package main.java.com.pareekshit.codeforces.strings;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int result = a.toLowerCase().compareTo(b.toLowerCase());
        System.out.println(result == 0 ? 0 : result > 0 ? 1 : -1);
    }
}
