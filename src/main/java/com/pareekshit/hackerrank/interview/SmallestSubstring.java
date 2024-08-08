package main.java.com.pareekshit.hackerrank.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int result = findSmallestDivisor(s, t);

        System.out.println(result);
        bufferedReader.close();
    }
    /*
     * Complete the 'findSmallestDivisor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

    public static int findSmallestDivisor(String s, String t) {
        // Write your code here
        if (t.length() > s.length())
            return -1;
        boolean isCondition1Valid = false;
        int index = 0;
        int result = -1;
        String temp;
        //Condition 1
        if (s.length() == t.length()) {
            isCondition1Valid = true;
        } else {
            temp = t;
            while (temp.length() < s.length()) {
                temp = temp.concat(t);
                if (temp.length() == s.length()) {
                    isCondition1Valid = true;
                    break;
                }
            }
        }
        if (isCondition1Valid) {
            //Condition 2
            if (t.indexOf(t.charAt(0)) == t.lastIndexOf(t.charAt(0))) {
                return t.length();
            } else {
                boolean isValid = true;
                index = t.lastIndexOf(s.charAt(0));
                for (int i = 0, j = index; i < index && j < t.length(); i++, j++) {
                    if (t.charAt(i) != t.charAt(j)) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    isCondition1Valid = false;
                    String substring =
                            t.substring(0, index).length() < t.substring(index).length() ?
                                    t.substring(0, index) :
                                    t.substring(index);
                    temp = substring;
                    while (temp.length() < t.length()) {
                        temp = temp.concat(t.substring(0, index));
                        if (temp.length() == t.length()) {
                            isCondition1Valid = true;
                            break;
                        }
                    }
                    if (isCondition1Valid) {
                        return substring.length();
                    }
                }
            }
        }
        return result;
    }
}

