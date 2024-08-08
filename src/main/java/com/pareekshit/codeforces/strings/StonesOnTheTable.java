package main.java.com.pareekshit.codeforces.strings;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String words = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (words.charAt(i) == words.charAt(i + 1))
                count++;
        }
        System.out.println(count);
    }
}
