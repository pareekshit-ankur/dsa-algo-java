package main.java.com.pareekshit;

import java.util.Scanner;

public class MagicalBinaryString {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int oneCount = 0, zeroCount = 0, digit = -1;
        String[] binary = input.trim().split("");
        for (String num : binary) {
            try {
                digit = Integer.parseInt(num);
                if (digit == 1)
                    oneCount++;
                else if (digit == 0)
                    zeroCount++;

                if (oneCount != zeroCount) {
                    System.out.println(false);
                    return;
                } else {
                    int count1 = 0, count0 = 0;
                    for (int i = 0; i < binary.length; i++) {
                        digit = Integer.parseInt(binary[i]);
                        if (digit == 0 && i == 0) {
                            System.out.println(false);
                            return;
                        }
                        if (digit == 1) {
                            count1++;
                        } else {
                            int nextNum = 0;
                            if (i + 1 < binary.length) {
                                nextNum = Integer.parseInt(binary[i + 1]);
                            }
                            int j;
                            for (j = i; j < binary.length - 1 && nextNum != 1; j++) {
                                count0++;
                                nextNum = Integer.parseInt(binary[j + 1]);
                            }
                            if ((count0 - 1) >= count1) {
                                System.out.println(false);
                                return;
                            }
                        }
                    }
                    System.out.println(true);
                }
            } catch (NumberFormatException e) {
                System.out.println(false);
            }
        }

    }
}

