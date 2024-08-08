package main.java.com.pareekshit.scaler.bitmanipulation;

public class SetBit {
    public static void main(String[] args) {
        System.out.println(solve(3, 5));
    }

    public static int solve(int A, int B) {
        int ans;
        ans = (1 << A);
        ans = ans | (1 << B);
        return ans;
    }
}
