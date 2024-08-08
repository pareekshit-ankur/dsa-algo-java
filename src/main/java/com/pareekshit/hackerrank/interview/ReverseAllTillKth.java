package main.java.com.pareekshit.hackerrank.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseAllTillKth {

    public static String modifyQueue(String input, int k) {
        String[] array = input.split(" ");
        String[] modArr = new String[array.length];
        StringBuilder sb = new StringBuilder();
        int i, j;
        for (i = 0, j = k - 1; i < k; i++, j--) {
            modArr[i] = array[j];
        }
        for (; i < array.length; i++) {
            modArr[i] = array[i];
        }
        for (String s : modArr) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String input = bufferedReader.readLine().trim();

        String result = modifyQueue(input, k);
        System.out.println(result);
        bufferedReader.close();
    }
}
