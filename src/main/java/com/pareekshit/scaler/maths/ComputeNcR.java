package main.java.com.pareekshit.scaler.maths;

public class ComputeNcR {
    public static void main(String[] args) {
        System.out.println(solve(5, 2, 13));
        System.out.println(solve(38, 5, 81));
        System.out.println(solve(30, 24, 56));
        System.out.println(solve(300, 116, 643));
    }

    public static int solve(int A, int B, int C) {
        /*long n = 1, r=1;
        int limit = Math.max((A - B), B);
        for (int i = A, j= Math.min((A - B), B); i > limit; i--, j--) {
            n *= i;
            //n %= C;
            r *= j;
            //r %= C;
        }
        long val = n / r;
        return (int) (val % C);*/

        int[][] ans = new int[A + 1][B + 1];

        for (int i = 0; i <= A; i++) {
            ans[i][0] = 1;
            if (i <= B) ans[i][i] = 1;
            for (int j = 1; j < i && j <= B; j++) {
                ans[i][j] = (ans[i - 1][j - 1] + ans[i - 1][j]) % C;
            }
        }

        return ans[A][B];
    }

    public static int solveNumberOverflow(int A, int B, int C) {
        long n = 1, r = 1;
        int limit = Math.max((A - B), B);
        for (int i = A, j = Math.min((A - B), B); i > limit; i--, j--) {
            n *= i;
            //n %= C;
            r *= j;
            //r %= C;
        }
        long val = n / r;
        return (int) (val % C);


    }
}
