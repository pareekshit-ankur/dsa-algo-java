package main.java.com.pareekshit.codeforces.strings;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("\\n");
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if (s.length() > 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(0));
                sb.append(s.length() - 2);
                sb.append(s.charAt(s.length() - 1));
                System.out.println(sb.toString());
            } else {
                System.out.println(s);
            }
        }
    }
}
