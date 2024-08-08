package main.java.com.pareekshit.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;


public class PasswordDecryption {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String decryptPassword(String s) {
        // Write your code here
        String originalPassword = "";
        List<Character> chars = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        for (int i = chars.size() - 1; i > 0; i--) {
            if (chars.get(i) == '0') {
                chars.set(i, chars.get(0));
                chars.remove(0);
            } else if (chars.get(i) == '*') {
                chars.remove(i);
                i--;
                char temp = chars.get(i - 1);
                chars.set(i - 1, chars.get(i));
                chars.set(i, temp);
            }
        }
        originalPassword = chars.stream().map(String::valueOf).collect(Collectors.joining());
        return originalPassword;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        String result = decryptPassword(s);

        System.out.println(result);

        bufferedReader.close();
    }
}