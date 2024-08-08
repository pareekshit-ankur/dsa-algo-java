package main.java.com.pareekshit.leetcode.easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        //System.out.println(lengthOfLastWord("Hello World"));
        //System.out.println(lengthOfLastWord(" "));
        //System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        char[] charArray = s.trim().toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == ' ') {
                return (charArray.length - i) - 1;
            }
        }
        return s.length();

    }
}
