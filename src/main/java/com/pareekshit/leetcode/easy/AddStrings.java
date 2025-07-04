package main.java.com.pareekshit.leetcode.easy;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int i, j, carry = 0;
        for (i = n1.length - 1, j = n2.length - 1; i >= 0 && j >= 0; i--, j--) {
            int num = (n1[i] - '0') + (n2[j] - '0') + carry;
            if (num <= 9) {
                sb.append(num);
                carry = 0;
            } else {
                sb.append(num % 10);
                carry = 1;
            }
        }
        while (i >= 0) {
            int num = (n1[i] - '0') + carry;
            if (num <= 9) {
                sb.append(num);
                carry = 0;
            } else {
                sb.append(num % 10);
                carry = 1;
            }
            i--;
        }
        while (j >= 0) {
            int num = (n2[j] - '0') + carry;
            if (num <= 9) {
                sb.append(num);
                carry = 0;
            } else {
                sb.append(num % 10);
                carry = 1;
            }
            j--;
        }
        if (carry==1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
