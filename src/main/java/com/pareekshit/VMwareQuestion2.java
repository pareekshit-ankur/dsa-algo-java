package main.java.com.pareekshit;

public class VMwareQuestion2 {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 20};
        System.out.println(getMaxAbsoluteDifference(array));
    }

    public static int getMaxAbsoluteDifference(int[] array) {
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (diff > maxDiff) maxDiff = diff;
        }
        return maxDiff;
    }
}



