package main.java.com.pareekshit.hackerrank.datastructures;

import java.util.Scanner;

public class NoPrefixSet {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] strings = new String[tests];
        for (int i = 0; i < tests; i++) {
            strings[i] = scanner.nextLine();
        }
        System.out.println(checkSet(strings));

    }

    private static String checkSet(String[] strings) {
        int position = Integer.MAX_VALUE;
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            for (int j = 0; j < strings.length; j++) {
                if (!s.equals(strings[j]) && strings[j].startsWith(s)) {
                    if (j < position) {
                        position = j;
                    }
                }
            }
        }
        if (position != Integer.MAX_VALUE) {
            System.out.println("BAD SET");
            return strings[position];
        }
        return "GOOD SET";
    }
}
