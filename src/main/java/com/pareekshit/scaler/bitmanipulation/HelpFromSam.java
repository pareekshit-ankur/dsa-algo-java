package main.java.com.pareekshit.scaler.bitmanipulation;

public class HelpFromSam {
    public static void main(String[] args) {
        System.out.println(solve(4));
        System.out.println(solve(7));
    }

    public static int solve(int A) {
        int count = 0;
        while (A > 0) {
            if (A % 2 == 1) {
                A -= 1;
                count++;
            } else {
                A /= 2;
            }
        }
        return count;
    }
}
