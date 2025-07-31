package main.java.com.pareekshit.leetcode.easy;

public class SumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c-'a'+1);
        }
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (char c : sb.toString().toCharArray()) {
                sum+= Character.getNumericValue(c);
            }
            sb.setLength(0);
            sb.append(sum);
        }
        return sum;
    }
}
