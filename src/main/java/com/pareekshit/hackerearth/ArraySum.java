package main.java.com.pareekshit.hackerearth;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Long sum = 0L;
        Integer noOfInputs = Integer.parseInt(s.nextLine());
        String[] numbers = s.nextLine().trim().split(" ");
        for (int i = 0; i < noOfInputs; i++) {
            sum += Long.parseLong(numbers[i]);
        }
        System.out.println(sum);
    }
}
