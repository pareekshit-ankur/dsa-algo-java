package main.java.com.pareekshit.leetcode.easy;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (characters.isEmpty()) {
                characters.add(c);
            } else if (characters.peek() != c) {
                characters.add(c);
            } else {
                while (!characters.isEmpty() && characters.peek() == c) {
                    characters.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!characters.isEmpty()) {
            sb.append(characters.pop());
        }
        return sb.reverse().toString();
    }
}
