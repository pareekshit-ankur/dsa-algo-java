package main.java.com.pareekshit.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int count;
        if (year < 1918) {
            if (year % 4 == 0) {
                count = 31 * 5 + 30 * 2 + 29;
            } else {
                count = 31 * 5 + 30 * 2 + 28;
            }
        } else if (year == 1918) {
            count = 31 * 5 + 30 * 2 + 15;
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                count = 31 * 5 + 30 * 2 + 29;
            } else {
                count = 31 * 5 + 30 * 2 + 28;
            }
        }
        int day = 256 - count;
        return day + "." + "09." + year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);
        System.out.println(result);
        bufferedReader.close();

    }
}
