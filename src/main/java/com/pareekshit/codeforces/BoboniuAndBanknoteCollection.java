package main.java.com.pareekshit.codeforces;

import java.util.Scanner;

public class BoboniuAndBanknoteCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("\\n");
        int count = 0;
        String[] arr = scanner.nextLine().trim().split(" ");
        int[] notes = new int[n];
        for (int i = 0; i < arr.length; i++) {
            notes[i] = Integer.parseInt(arr[i]);
        }
        int i;
        for (i = 0; i < notes.length - 1; i++) {
            System.out.print(count + " ");
            if (notes[i] == notes[i + 1]) {
                count++;
            }
        }
        System.out.print(count);
    }
}
