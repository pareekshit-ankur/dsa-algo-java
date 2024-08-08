package main.java.com.pareekshit.interviewtests.eyeota;

import java.util.Objects;
import java.util.Scanner;

public class ProblemX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s;
        while (scanner.hasNext()) {
            s = scanner.nextLine().trim();
            if (s.length() == 1 && s.equals("0")) {
                System.exit(0);
            }
            if (Objects.nonNull(s) && !s.isEmpty()) {
                boringDaysCount(s.trim());
            }
        }
    }

    public static void boringDaysCount(String s) {
        int count = 0;
        for (int i = 0; i + 1 < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i + 1)) count++;
        }
        System.out.println(count);
    }
}
