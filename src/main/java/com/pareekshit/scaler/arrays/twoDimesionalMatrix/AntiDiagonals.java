package main.java.com.pareekshit.scaler.arrays.twoDimesionalMatrix;

public class AntiDiagonals {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        printMatrix(matrix);
        printMatrix(diagonal(matrix));
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] diagonal(int[][] A) {
        int[][] res = new int[2 * A.length - 1][A.length];
        int index = 0;
        for (int col = 0; col < A[0].length; col++) {
            int j = col, row = 0;
            int[] arr = new int[A.length];
            int p = 0;
            while (j >= 0 && row < A.length) {
                arr[p] = A[row][j];
                j--;
                row++;
                p++;
            }
            res[index] = arr;
            index++;
        }
        for (int row = 1; row < A.length; row++) {
            int i = row, col = A[0].length - 1;
            int[] arr = new int[A.length];
            int p = 0;
            while (col >= 0 && i < A.length) {
                arr[p] = A[i][col];
                col--;
                i++;
                p++;
            }
            res[index] = arr;
            index++;
        }
        return res;
    }
}
