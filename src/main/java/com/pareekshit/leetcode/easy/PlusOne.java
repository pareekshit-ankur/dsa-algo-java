package main.java.com.pareekshit.leetcode.easy;

public class PlusOne {

    public static void main(String[] args) {
        //System.out.println(plusOne(new int[] {1,2,3}));
        System.out.println(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static int[] plusOneCode2(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            int carry = 1;
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    carry = 0;
                    return digits;
                }
            }
            if (carry == 1 && digits[0] == 0) {
                int[] res = new int[digits.length + 1];
                res[0] = 1;
                return res;
            }
        }
        return digits;
    }
}