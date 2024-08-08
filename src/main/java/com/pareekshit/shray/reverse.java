package main.java.com.pareekshit.shray;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get reverse: ");
        int num1 = sc.nextInt();
        int rev1 = 0, d;
        while (num1 != 0) {
            d = num1 % 10;
            rev1 = rev1 * 10 + d;
            num1 = num1 / 10;
        }
        System.out.print("Reverse is :" + rev1);
    }
}
