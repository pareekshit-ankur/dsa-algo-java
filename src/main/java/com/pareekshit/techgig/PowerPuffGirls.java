package main.java.com.pareekshit.techgig;

import java.util.Arrays;
import java.util.Scanner;

public class PowerPuffGirls {
    public static void main(String[] args) {
        long maxNumberOfPowerPuffGirlsCreated = 0;
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        long noOfIngridient = Integer.parseInt(scanner.next().trim());

        long[] ingridients;
        String s = scanner.next().trim();
        ingridients = Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).toArray();
        long[] totalIngridients;
        s = scanner.next().trim();
        totalIngridients = Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).toArray();
        if (ingridients.length == totalIngridients.length) {
            long min = Integer.MAX_VALUE;
            for (int i = 0; i < ingridients.length; i++) {
                long val;
                if (ingridients[i] == 0) {
                    val = totalIngridients[i];
                } else {
                    val = totalIngridients[i] / ingridients[i];
                }
                if (min > val) {
                    min = val;
                }
            }
            maxNumberOfPowerPuffGirlsCreated = min;
        }
        System.out.println(maxNumberOfPowerPuffGirlsCreated);
    }
}
