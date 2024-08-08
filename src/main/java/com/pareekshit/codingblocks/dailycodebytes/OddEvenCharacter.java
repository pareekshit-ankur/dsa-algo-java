package main.java.com.pareekshit.codingblocks.dailycodebytes;

import java.util.Scanner;

public class OddEvenCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int asciiVal;
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                asciiVal = word.charAt(i) + 1;
            } else {
                asciiVal = word.charAt(i) - 1;
            }
            char c = (char) asciiVal;
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
