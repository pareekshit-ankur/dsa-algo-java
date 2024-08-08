package main.java.com.pareekshit;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TrendingTweets1 {
    static Map<String, Integer> trendingTweets = new TreeMap<>(Comparator.reverseOrder());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 2) {
            option = scanner.nextInt();
            if (option == 1) {

            } else {
                printTopTweets(trendingTweets);
            }
        }

    }

    static void printOptions() {
        System.out.println("1: Enter a tweet");
        System.out.println("2: Exit");
    }

    static void printTopTweets(Map<String, Integer> trendingTweets) {
        trendingTweets.entrySet().forEach(System.out::println);
    }


}
