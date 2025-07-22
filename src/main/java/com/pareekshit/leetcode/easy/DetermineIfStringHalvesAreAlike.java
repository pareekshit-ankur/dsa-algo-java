package main.java.com.pareekshit.leetcode.easy;

public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int[] half1 = new int[26];
        int[] half2 = new int[26];
        for (int i = 0; i < arr.length / 2; i++) {
            half1[arr[i] - 'a'] += 1;
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            half2[arr[i] - 'a'] += 1;
        }
        int sum1 = half1[0] + half1['e' - 'a'] + half1['i' - 'a'] + half1['o' - 'a'] + half1['u' - 'a'];
        int sum2 = half2[0] + half2['e' - 'a'] + half2['i' - 'a'] + half2['o' - 'a'] + half2['u' - 'a'];
        return sum2 == sum1;
    }
}
