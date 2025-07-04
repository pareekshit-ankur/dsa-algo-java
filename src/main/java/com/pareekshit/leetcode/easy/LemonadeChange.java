package main.java.com.pareekshit.leetcode.easy;

public class LemonadeChange {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
        System.out.println(lemonadeChange(new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int[] arr = new int[3];
        boolean result = true;
        for (int bill : bills) {
            if (bill == 5) {
                arr[0] += 1;
            } else if (bill == 10) {
                arr[1] += 1;
                if (arr[0] < 1) {
                    return false;
                } else {
                    arr[0] -= 1;
                }
            } else {
                arr[2] += 1;
                if (arr[1] < 1) {
                    if (arr[0] < 3) {
                        return false;
                    } else {
                        arr[0] -= 3;
                    }
                } else {
                    arr[1] -= 1;
                    if (arr[0] < 1) {
                        return false;
                    } else {
                        arr[0] -= 1;
                    }
                }
            }
        }
        return result;
    }
}
