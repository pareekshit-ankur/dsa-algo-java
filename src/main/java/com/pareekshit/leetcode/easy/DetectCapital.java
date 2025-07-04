package main.java.com.pareekshit.leetcode.easy;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("FlaG"));
    }
    public static boolean detectCapitalUse(String word) {
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
        int count =0;
        if(isFirstCapital){
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)){
                    count++;
                }
            }
            if (count>1 && count<word.length()){
                return false;
            }
        }else {
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)){
                    return false;
                }
            }
        }
        return true;
    }
}
