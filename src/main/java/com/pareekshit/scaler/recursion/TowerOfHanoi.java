package main.java.com.pareekshit.scaler.recursion;

public class TowerOfHanoi {
    static int[][] arr;
    static int index = 0;

    public static void main(String[] args) {
        print(towerOfHanoi(2));
        System.out.println("----------------------------------------------------------------------");
        print(towerOfHanoi(3));
    }

    public static int[][] towerOfHanoi(int A) {
        arr = new int[(int) Math.pow(2, A) - 1][];
        index = 0;
        return towOfHanoi(A, 1, 2, 3);
    }

    public static int[][] towOfHanoi(int n, int A, int B, int C) {
        if (n == 0) {
            return arr;
        }
        towOfHanoi(n - 1, A, C, B);
        arr[index++] = new int[]{n, A, C};
        towOfHanoi(n - 1, B, A, C);
        return arr;
    }

    public static void print(int[][] arr) {
        for (int[] ints : arr) {
            if (ints != null) {
                for (int i : ints) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }

}
