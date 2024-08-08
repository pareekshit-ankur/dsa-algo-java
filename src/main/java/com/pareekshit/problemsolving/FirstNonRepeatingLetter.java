package main.java.com.pareekshit.problemsolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FirstNonRepeatingLetter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("sTress"));
        System.out.println(firstNonRepeatingLetter("sTresS"));
        System.out.println(firstNonRepeatingLetter1("sTress"));
        System.out.println(firstNonRepeatingLetter1("sTresS"));
    }

    public static String firstNonRepeatingLetter(String str) {
        String returnValue = "";
        char[] charecters = str.toCharArray();
        Map<Character, Integer> charSet = new HashMap<>();
        Character unique = null;
        for (int i = charecters.length - 1; i > -1; i--) {
            charSet.computeIfPresent(charecters[i], (charecter, goal) -> goal + 1);
            charSet.putIfAbsent(charecters[i], 1);
            /*if (charSet.containsKey(charecters[i])) {
                charSet.put(charecters[i], charSet.get(charecters[i]) + 1);
                //charSet.compute(charecters[i],(charecter, goal) -> goal+1);
            } else {
                charSet.put(charecters[i], 1);
            }*/
        }
        for (Character key : charecters) {
            if (charSet.get(key) == 1 && Objects.isNull(unique)) {
                unique = key;
            } else if (charSet.get(key) == 1 && Objects.nonNull(unique) && key < unique) {
                unique = key;
            }
        }
        returnValue = (unique == null) ? "" : String.valueOf(unique);
        return returnValue;
    }

    public static String firstNonRepeatingLetter1(String str) {
        char[] charecters = str.toCharArray();
        Map<Character, Integer> charSet = new HashMap<>();
        Character unique = null;
        for (int i = charecters.length - 1; i > -1; i--) {
            if (charSet.containsKey(charecters[i])) {
                charSet.put(charecters[i], charSet.get(charecters[i]) + 1);
            } else {
                charSet.put(charecters[i], 1);
            }
        }
        for (Character key : charecters) {
            if (charSet.get(key) == 1) {
                unique = key;
                return String.valueOf(unique);
            }
        }
        return "";
    }

    /*public static Integer firstNonRepeatingLetterIndex(String str) {
        Integer returnIndex;
        char[] charecters = str.toCharArray();
        Map<Character, Integer> charSet = new HashMap<>();
        Integer unique = null;
        for (int i = charecters.length - 1; i > -1; i--) {
            if (charSet.containsKey(charecters[i])) {
                charSet.put(charecters[i], charSet.get(charecters[i]) + 1);
            } else {
                charSet.put(charecters[i], 1);
            }
        }
        for (int i = 0; i < charecters.length; i++) {
            Character key = charecters[i];
            if (charSet.get(key) == 1 && Objects.isNull(unique)) {
                unique = key;
            } else if (charSet.get(key) == 1 && Objects.nonNull(unique) && key < unique) {
                unique = key;
            }
        }
        returnIndex = (unique == null) ? -1 : unique;
        return returnIndex;
    }*/
}
