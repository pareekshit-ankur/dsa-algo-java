package main.java.com.pareekshit.scaler.contest5;

public class HouseColor {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 1, 5, 4, 4, 4, 4}));
        System.out.println(solve(new int[]{36, 26, 22, 24}));
    }

    public static int solve(int[] A) {
        int max = 0, indMax = 0;
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] != A[j]) {
                int diff = Math.abs(j - i);
                if (diff > max) {
                    indMax = j - i;
                    max = diff;
                }
            }
            j--;
        }
        int res1 = indMax;
        indMax = 0;
        j = A.length - 1;
        while (i < j) {
            if (A[i] != A[j]) {
                int diff = Math.abs(j - i);
                if (diff > max) {
                    indMax = j - i;
                    max = diff;
                }
            }
            i++;
        }
        return Math.max(indMax, res1);
    }
}
