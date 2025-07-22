package main.java.com.pareekshit.leetcode.easy;

public class ToLowerCase {

    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
}
