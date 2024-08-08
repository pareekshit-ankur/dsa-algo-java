package main.java.com.pareekshit.codeforces.strings;

import java.util.Scanner;

public class Translation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        boolean result = true;
        if (a.length() == b.length()) {
            for (int i = 0, j = a.length() - 1; i < a.length(); i++, j--) {
                if (a.charAt(i) != b.charAt(j)) {
                    result = false;
                    break;
                }
            }
            System.out.println(result ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }

    }
}
