package main.java.com.pareekshit.hackerearth.codemonk.arrays;

import java.util.Scanner;

public class MonkAndRotation {
    public static void main(String[] args) {
        //Scanner
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        try {

            for (int j = 0; j < testCases; j++) {
                int arrayLength = s.nextInt();
                int rotateBy = s.nextInt();
                int[] array = new int[arrayLength];
                for (int i = 0; i < arrayLength; i++) {
                    array[i] = s.nextInt();
                }
                for (int i = 0, k = arrayLength - rotateBy; i < arrayLength; i++, k++) {
                    int rotatedIndex = k % arrayLength;
                    System.out.print(array[rotatedIndex] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getLocalizedMessage());
        }
    }
}
