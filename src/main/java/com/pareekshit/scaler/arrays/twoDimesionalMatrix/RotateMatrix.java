package main.java.com.pareekshit.scaler.arrays.twoDimesionalMatrix;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        printMatrix(matrix);
        solve(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void solve(int[][] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        printMatrix(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0, k = A[0].length - 1; j < k; j++, k--) {
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
            }
        }
        printMatrix(A);
    }
}
