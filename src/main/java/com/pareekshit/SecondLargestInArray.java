package main.java.com.pareekshit;

import java.util.Objects;
import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if (Objects.isNull(input)) {
            System.out.println("NA");
            return;
        }
        String[] numbers = input.split(",");
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        if (numbers.length < 2) {
            System.out.println("NA");
        } else {
            for (String num : numbers) {
                int number = Integer.parseInt(num);
                if (number > max) {
                    secondMax = max;
                    max = number;
                } else if (number > secondMax && number != max) {
                    secondMax = number;
                }
            }
            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("NA");
                return;
            }
            System.out.println(secondMax);
        }
    }
}
