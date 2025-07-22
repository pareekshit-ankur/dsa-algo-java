package main.java.com.pareekshit.leetcode.easy;

public class ReplaceAllDigitsWithCharacters {

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }
    public static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        char letter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0){
                letter = s.charAt(i);
                sb.append(s.charAt(i));
            }else {
                int num = Character.getNumericValue(s.charAt(i));
                char shiftedChar = (char) (letter + num);
                sb.append(shiftedChar);
            }
        }
        return sb.toString();
    }
}
