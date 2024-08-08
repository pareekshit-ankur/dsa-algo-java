package main.java.com.pareekshit.recursion;

public class GameTheory {

    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 3, 2, 4};
        System.out.println(maxAmount(arr, 0, arr.length - 1));
    }

    public static int maxAmount(int[] arr, int l, int r) {
        if (l + 1 == r) {
            return Math.max(arr[l], arr[r]);
        }
        return Math.max(
                arr[l] +
                        Math.min(maxAmount(arr, l + 2, r), arr[r] + maxAmount(arr, l + 1, r - 1)),
                arr[r] +
                        Math.min(maxAmount(arr, l, r - 2), arr[r] + maxAmount(arr, l + 1, r - 1)));
    }
}
