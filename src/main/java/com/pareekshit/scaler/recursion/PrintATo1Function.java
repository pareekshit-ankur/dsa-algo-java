package main.java.com.pareekshit.scaler.recursion;

public class PrintATo1Function {
    public static void main(String[] args) {
        solve(10);
    }

    public static void solve(int A) {
        print(A);
        System.out.println();
    }

    public static void print(int A) {
        System.out.print(A + " ");
        if (A == 1) {
            return;
        }
        print(A - 1);
    }
}
