package main.java.com.pareekshit.hackerrank.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SuperReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        List<Character> characters = new LinkedList<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }
        int operationCount = -1;
        while (operationCount != 0) {
            operationCount = 0;
            for (int i = 0; i < characters.size() - 1; i++) {
                if (characters.get(i).equals(characters.get(i + 1))) {
                    characters.remove(i);
                    characters.remove(i);
                    operationCount++;
                    break;
                }
            }
        }
        String res = characters.stream().map(String::valueOf).collect(Collectors.joining());
        return (res.isEmpty()) ? "Empty String" : res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        String result = superReducedString(s);
        System.out.println(result);
        bufferedReader.close();
    }
}
