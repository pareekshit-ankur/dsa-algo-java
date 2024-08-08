package main.java.com.pareekshit.scaler.maths;

import java.util.HashMap;

public class ExcelColumnNumber {
    static HashMap<Character, Integer> map = new HashMap<>();

    static {
        for (int i = 0; i < 26; i++) {
            Character c = (char) (65 + i);
            map.put(c, i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("BB"));
    }

    public static int titleToNumber(String A) {
        char[] arr = A.toCharArray();
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += (int) (Math.pow(26, i) * (map.get(arr[arr.length - (i + 1)])));
        }
        return num;
    }
}
