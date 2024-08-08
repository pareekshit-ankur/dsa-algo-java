package main.java.com.pareekshit.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    public static void main(String[] args) {
        System.out.println(convertToDecimal("MXVII"));
        System.out.println(decode("MXVII"));
    }

    public static Integer decode(String roman) {
        int number = 0;
        Map<Character, Integer> romanTable = new HashMap<>();
        romanTable.put('I', 1);
        romanTable.put('V', 5);
        romanTable.put('X', 10);
        romanTable.put('L', 50);
        romanTable.put('C', 100);
        romanTable.put('D', 500);
        romanTable.put('M', 1000);


        for (int i = 0; i < roman.length(); i++) {
            int stringValue = -1;
            if (romanTable.containsKey(roman.charAt(i))) {
                stringValue = romanTable.get(roman.charAt(i));
            }
            if (i + 1 < roman.length()) {
                int nextStringValue = -1;
                if (romanTable.containsKey(roman.charAt(i + 1))) {
                    nextStringValue = romanTable.get(roman.charAt(i + 1));
                }
                if (stringValue > nextStringValue) {
                    number += stringValue - nextStringValue;
                    i++;
                }
            } else {
                number += stringValue;
            }
        }
        return number;
    }

    public static Integer convertToDecimal(String roman) {
        int number = 0, previousNumber = 0, decimalNumber = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            char character = Character.toUpperCase(roman.charAt(i));
            switch (character) {
                case 'I':
                    previousNumber = number;
                    number = 1;
                    break;
                case 'V':
                    previousNumber = number;
                    number = 5;
                    break;
                case 'X':
                    previousNumber = number;
                    number = 10;
                    break;
                case 'L':
                    previousNumber = number;
                    number = 50;
                    break;
                case 'C':
                    previousNumber = number;
                    number = 100;
                    break;
                case 'D':
                    previousNumber = number;
                    number = 500;
                    break;
                case 'M':
                    previousNumber = number;
                    number = 1000;
                    break;
            }
            if (number < previousNumber) {
                decimalNumber = decimalNumber - number;
            } else {
                decimalNumber = decimalNumber + number;
            }
        }
        return decimalNumber;
    }

}
