package main.java.com.pareekshit.recursion;

public class AllPathsInMatrix {

    public static void main(String[] args) {
        System.out.println(paths(4, 4));
    }

    //One can only go right or down in the matrix
    public static int paths(int m, int n) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return paths(m, n - 1) + paths(m - 1, n);
    }
}
