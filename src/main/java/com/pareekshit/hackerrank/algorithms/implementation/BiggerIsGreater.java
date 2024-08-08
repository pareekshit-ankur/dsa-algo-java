package main.java.com.pareekshit.hackerrank.algorithms.implementation;

import java.util.Optional;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BiggerIsGreater {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        StringBuilder sb = new StringBuilder();
        char[] chars = w.toCharArray();
        TreeSet<Character> characters = w.chars().mapToObj(value -> (char) value)
                .collect(Collectors.toCollection(TreeSet::new));
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] > chars[i - 1]) {
                char temp =
                        Optional.ofNullable(characters.ceiling((char) (chars[i - 1] + 1)))
                                .orElse(' ');
                if (temp == ' ') {
                    temp = chars[i - 1];
                    chars[i - 1] = chars[i];
                    chars[i] = temp;
                    return new String(chars);
                } else {
                    sb.append(w, 0, i - 1);
                    for (Character c : w.substring(0, i - 1).toCharArray()) {
                        characters.remove(c);
                    }
                    if (sb.length() > 0 && !characters.contains(temp))
                        sb.append(temp);
                    characters.remove(temp);
                    characters.forEach(sb::append);
                    return sb.toString();
                }
            }
        }
        return "no answer";
    }

    public static void main(String[] args) {
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);
            System.out.println(result);
        }

        scanner.close();
    }
}
