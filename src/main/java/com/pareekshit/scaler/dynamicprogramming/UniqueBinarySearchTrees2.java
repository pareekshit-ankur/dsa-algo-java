package main.java.com.pareekshit.scaler.dynamicprogramming;

public class UniqueBinarySearchTrees2 {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
        System.out.println(numTrees(4));
        System.out.println(numTrees(5));
        System.out.println(numTrees(11));
    }

    public static int numTrees(int A) {
        int res = 1;
        for (int i = 1; i < A; i++) {
            res = (res * (4 * i - 2)) / (i + 1);
        }
        return res;
    }
}
