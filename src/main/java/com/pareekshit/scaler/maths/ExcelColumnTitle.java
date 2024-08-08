package main.java.com.pareekshit.scaler.maths;

import java.util.HashMap;

public class ExcelColumnTitle {
    static HashMap<Integer, Character> map = new HashMap<>();

    static {
        for (int i = 0; i < 26; i++) {
            Character c = (char) (65 + i);
            map.put(i, c);
        }
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(3));
        System.out.println(convertToTitle(27));
        System.out.println(convertToTitle(703));
        System.out.println(convertToTitle(702));
        System.out.println(convertToTitle(943566));
    }

    public static String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        if (A <= 26) {
            sb.append(map.get(A - 1));
            return sb.toString();
        }
        while (A > 26) {
            sb.append(map.get((A - 1) % 26));
            A = (A - 1) / 26;
        }
        sb.append(map.get((A - 1) % 26));
        return sb.reverse().toString();
    }
}
