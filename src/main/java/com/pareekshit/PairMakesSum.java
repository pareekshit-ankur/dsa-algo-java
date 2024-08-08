package main.java.com.pareekshit;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PairMakesSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] numbers = input.split(",");
        int sum = s.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
        for (String number : numbers) {
            int pairNum = sum - Integer.parseInt(number);
            if (set.contains(pairNum)) {
                System.out.println(true);
                System.out.println(number + "," + pairNum);
                return;
            }
        }
        System.out.println(false);
    }
}
