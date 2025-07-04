package main.java.com.pareekshit.leetcode.easy;

public class FindTheKthCharacterInStringGame1 {
    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }

    public static char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        while (sb.length() < k) {
            char[] arr = sb.toString().toCharArray();
            for (char c : arr) {
                if (c =='z'){
                    sb.append('a');
                }else {
                    char ch = (char) (c + 1);
                    sb.append(ch);
                }
            }
        }
        return sb.charAt(k-1);
    }
}
