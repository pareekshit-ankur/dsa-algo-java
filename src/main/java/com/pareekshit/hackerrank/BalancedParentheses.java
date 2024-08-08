package main.java.com.pareekshit.hackerrank;

import java.util.Scanner;

class BalancedParentheses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(isBalanced(in.next()));
        }

        in.close();
    }

    static boolean isBalanced(String s) {
        boolean isBalanced = false;
        int pointer;
        if (s.isEmpty()) return isBalanced;
        else {
            char[] chars = s.toCharArray();
            pointer = -1;
            char[] stack = new char[chars.length];
            for (char c : chars) {
                if ((c == '{' || c == '(') && pointer != chars.length) {
                    stack[++pointer] = c;
                } else if ((c == '}' && pointer != -1 && stack[pointer] == '{')
                        || (c == ')' && pointer != -1 && stack[pointer] == '(')) {
                    stack[pointer] = '0';
                    pointer--;
                } else {
                    return false;
                }
            }
        }
        isBalanced = pointer == -1;
        return isBalanced;
    }
}