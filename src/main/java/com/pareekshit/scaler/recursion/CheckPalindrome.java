package main.java.com.pareekshit.scaler.recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(solve("naman"));
        System.out.println(solve("strings"));
    }

    public static int solve(String A) {
        if (A.length() == 1) {
            return 1;
        }
        if (A.length() == 2) {
            if (A.charAt(0) == A.charAt(1)) {
                return 1;
            } else {
                return 0;
            }
        }
        if (A.charAt(0) == A.charAt(A.length() - 1)) {
            return solve(A.substring(1, A.length() - 1));
        }
        return 0;
    }
}
