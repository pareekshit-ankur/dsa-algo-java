package main.java.com.pareekshit.scaler.contest3;

public class KingAndPalindromes {

    public static void main(String[] args) {
        System.out.println(solve("banana"));
        System.out.println(solve("abcabc"));
        System.out.println(solve("dccbcdaac"));
        System.out.println(solve("abdaccc"));
    }

    public static int solve(String A) {
        int freqOne = 0, freqOdd = 0;
        int[] chars = new int[26];
        for (int i = 0; i < A.length(); i++) {
            chars[A.charAt(i) - 92]++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 1) {
                freqOne++;
            } else if (chars[i] % 2 == 1) {
                freqOdd++;
            }
        }
        if (freqOne == 1 && freqOdd == 0) {
            return A.length();
        }
        if (freqOne % 2 == 1 && freqOdd == 0) {
            return A.length() - freqOne + 1;
        }
        return A.length() - freqOne;
    }
}
