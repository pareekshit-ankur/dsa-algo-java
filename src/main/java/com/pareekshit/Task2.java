package main.java.com.pareekshit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        String input = "id,name,age,score\n1,Jack,NULL,12\n17,Betty,28,11";
        System.out.println(solution(input));
    }

    public static String solution(String S) {
        // write your code in Java SE 8
        String[] data = S.split("\n");
        List<String> rows = new ArrayList<>(Arrays.asList(data));
        for (int i = rows.size() - 1; i > 0; i--) {
            List<String> values = Arrays.asList(rows.get(i).split(","));
            if (values.contains("NULL")) {
                rows.remove(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String row : rows) {
            sb.append(row);
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
