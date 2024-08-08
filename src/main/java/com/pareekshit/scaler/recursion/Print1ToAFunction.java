package main.java.com.pareekshit.scaler.recursion;

public class Print1ToAFunction {
    public static void main(String[] args) {
        solve(10);
    }

    public static void solve(int A) {
        print(A);
        System.out.println();
    }

    public static void print(int A) {
        if (A == 0) {
            return;
        }
        print(A - 1);
        System.out.print(A + " ");
    }
}
