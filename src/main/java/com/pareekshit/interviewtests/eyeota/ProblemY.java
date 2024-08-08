package main.java.com.pareekshit.interviewtests.eyeota;

import java.util.Objects;
import java.util.Scanner;

public class ProblemY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s;
        while (scanner.hasNext()) {
            s = scanner.nextLine().trim();
            if (s.length() == 1 && s.equals("0")) {
                System.exit(0);
            }
            if (Objects.nonNull(s) && !s.isEmpty()) {
                try {
                    minimumGuestsToInvite(Integer.parseInt(s.trim()));
                } catch (Exception e) {
                    System.out.println("No Solution");
                }
            }
        }
    }

    public static void minimumGuestsToInvite(Integer noOfSushi) {
        int noOfGuests = 0;
        for (int i = 2; i <= noOfSushi / 2; i++) {
            if (noOfSushi % i == 0) {
                noOfGuests = i;
                break;
            }
        }
        if (noOfGuests == 0) {
            System.out.println("No Solution");
        } else {
            System.out.println(noOfGuests - 1);
        }
    }

    public static void maximumGuestsToInvite(Integer noOfSushi) {
        int noOfGuests = 0;
        for (int i = 2; i <= noOfSushi / 2; i++) {
            if (noOfSushi % i == 0) {
                noOfGuests = i;
            }
        }
        if (noOfGuests == 0) {
            System.out.println("No Solution");
        } else {
            System.out.println(noOfGuests - 1);
        }
    }

}
