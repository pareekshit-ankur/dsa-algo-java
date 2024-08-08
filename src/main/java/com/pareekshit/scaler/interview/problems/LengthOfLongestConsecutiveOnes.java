package main.java.com.pareekshit.scaler.interview.problems;

public class LengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(solve("111000"));
        System.out.println(solve("111011101"));
    }

    public static int solve(String A) {
        int count = 0;
        for (char c : A.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        if (count == A.length() || count == 0) {
            return count;
        }
        int ans = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0') {
                int l = 0, r = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (A.charAt(j) == '1') {
                        l++;
                    } else break;
                }
                for (int j = i + 1; j < A.length(); j++) {
                    if (A.charAt(j) == '1') {
                        r++;
                    } else break;
                }
                ans = Math.max(ans, l + r + 1);
            }
        }
        return Math.min(ans, count);
    }
}
