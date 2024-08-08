package main.java.com.pareekshit;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TrendingTweets {
    static Map<String, Integer> tweets = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        int option = 0;
        String tweet;
        printOptions();
        while (option != 2) {
            option = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if (option == 1) {
                System.out.print("Enter your tweet: ");
                tweet = scanner.nextLine();
                extractHashTagsFromTweet(tweet);
            } else if (option == 2) {
                printTopTweets(tweets);
                System.exit(0);
            }
            printOptions();
        }

    }

    static void printOptions() {
        System.out.println("1: Enter a tweet");
        System.out.println("2: Exit");
    }

    static void extractHashTagsFromTweet(String tweet) {
        String[] words = tweet.split(" ");
        for (String word : words) {
            if (word.contains("#")) {
                char[] chars = word.toCharArray();
                int index = -1;
                extractHashTags(word, chars, index);
            }
        }
    }

    private static void extractHashTags(String word, char[] chars, int index) {
        String hashtag;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#' && index == -1) {
                index = i;
            } else if (chars[i] == '#' && index != -1) {
                hashtag = word.substring(index, i);
                tweets.computeIfPresent(hashtag, (key, value) -> value + 1);
                tweets.putIfAbsent(hashtag, 1);
                index = i;
            }
        }
        if (index < word.length()) {
            hashtag = word.substring(index);
            tweets.computeIfPresent(hashtag, (key, value) -> value + 1);
            tweets.putIfAbsent(hashtag, 1);
        }
    }

    static void printTopTweets(Map<String, Integer> tweets) {
        Comparator<Entry<String, Integer>> compareByValue = Comparator.comparing(
                Map.Entry<String, Integer>::getValue).reversed().thenComparing(Entry::getKey);
        LinkedHashMap<String, Integer> topTweets = tweets.entrySet().stream()
                .sorted(compareByValue).collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                        LinkedHashMap::new));
        int counter = 1;
        for (Entry<String, Integer> entry : topTweets.entrySet()) {
            if (counter > 10) {
                break;
            }
            System.out.println(entry);
            counter++;
        }
    }

}
