package main.java.com.pareekshit.scaler.stacks;

public class BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(solve("{([])}"));
    }

    public static int solve(String A) {
        int pointer;
        if (A.isEmpty()) return 1;
        else {
            char[] chars = A.toCharArray();
            pointer = -1;
            char[] stack = new char[chars.length];
            for (char c : chars) {
                if ((c == '{' || c == '('|| c == '[') && pointer != chars.length) {
                    stack[++pointer] = c;
                } else if ((c == '}' && pointer != -1 && stack[pointer] == '{')
                        || (c == ')' && pointer != -1 && stack[pointer] == '(')
                        || (c == ']' && pointer != -1 && stack[pointer] == '[')) {
                    stack[pointer] = '0';
                    pointer--;
                } else {
                    return 0;
                }
            }
        }
        if (pointer == -1) {
            return 1;
        }
        return 0;
    }
}
