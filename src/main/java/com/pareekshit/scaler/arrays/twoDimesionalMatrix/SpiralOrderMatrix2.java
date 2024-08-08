package main.java.com.pareekshit.scaler.arrays.twoDimesionalMatrix;

public class SpiralOrderMatrix2 {
    public static void main(String[] args) {
        //generateMatrix(4);
        generateMatrix(1);
        printMatrix(generateMatrix(5));
        printMatrix(generateMatrix(6));
        printMatrix(generateMatrix(7));
        printMatrix(generateMatrix(21));
    }

    public static int[][] generateMatrix(int A) {
        int[][] matrix = new int[A][A];
        int num = 1, boundary = A * A;
        int rowUp = 0, rowDown = A - 1;
        int colLeft = 0, colRight = A - 1;
        if (A == 1) {
            return new int[][]{{1}};
        }
        while (num <= boundary && rowUp < A) {
            for (int i = colLeft; i < colRight && num <= boundary; i++) {
                matrix[rowUp][i] = num;
                num++;
            }
            for (int i = rowUp; i < rowDown && num <= boundary; i++) {
                matrix[i][colRight] = num;
                num++;
            }
            for (int i = colRight; i > colLeft && num <= boundary; i--) {
                matrix[rowDown][i] = num;
                num++;
            }
            for (int i = rowDown; i > rowUp && num <= boundary; i--) {
                matrix[i][colLeft] = num;
                num++;
            }
            rowUp++;
            rowDown--;
            colRight--;
            colLeft++;
            if (A % 2 == 1 && (rowUp == rowDown) && (rowUp == colLeft) && (colLeft == colRight)) {
                matrix[rowUp][colLeft] = num;
                num++;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
