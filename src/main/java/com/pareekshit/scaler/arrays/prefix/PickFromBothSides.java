package main.java.com.pareekshit.scaler.arrays.prefix;

public class PickFromBothSides {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, -2, 3, 1, 2}, 3));
        System.out.println(solve(new int[]{2, 3, -1, 4, 2, 1}, 4));
        System.out.println(solve(new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35}, 48));
    }

    public static int solve(int[] A, int B) {
        int sum = 0, i, subSum = 0, max;
        for (i = 0; i < A.length - B; i++) {
            sum += A[i];
            subSum += A[i];
        }
        for (; i < A.length; i++) {
            sum += A[i];
        }
        if (B == A.length) {
            return sum;
        }
        max = sum - subSum;
        int j;
        for (i = A.length - B, j = 0; i < A.length; i++, j++) {
            subSum = subSum + A[i] - A[j];
            max = getMax(max, sum - subSum);
        }
        return max;
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

}
