package main.java.com.pareekshit.recursion;

public class FloodFill {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        printMatrix(a);
        floodFill(a, 4, 3, 3, 2);
        System.out.println();
        printMatrix(a);
    }

    static void printMatrix(int a[][]) {
        for (int[] array : a) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void floodFill(int[][] arr, int i, int j, int colorToFill, int previousFilled) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length) {
            return;
        }

        if (arr[i][j] != previousFilled) {
            return;
        }
        arr[i][j] = colorToFill;
        floodFill(arr, i, j + 1, colorToFill, previousFilled);
        floodFill(arr, i, j - 1, colorToFill, previousFilled);
        floodFill(arr, i + 1, j, colorToFill, previousFilled);
        floodFill(arr, i - 1, j, colorToFill, previousFilled);

    }
}
