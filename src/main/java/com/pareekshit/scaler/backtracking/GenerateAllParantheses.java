package main.java.com.pareekshit.scaler.backtracking;

import java.util.ArrayList;

public class GenerateAllParantheses {
    public static void main(String[] args) {
        generateParenthesis(1).forEach(System.out::println);
        generateParenthesis(3).forEach(System.out::println);
    }

    public static ArrayList<String> generateParenthesis(int A) {
        return generateParenthesis("", A, 0, 0);
    }

    public static ArrayList<String> generateParenthesis(String s, int A, int open, int close) {
        ArrayList<String> answers = new ArrayList<>();
        generateParenthesis("", A, 0, 0, answers);
        return answers;
    }

    public static void generateParenthesis(String s, int A, int open, int close, ArrayList<String> answers) {
        if (s.length() == 2 * A) {
            answers.add(s);
            return;
        }
        if (open < A) {
            generateParenthesis(s + '(', A, open + 1, close, answers);
        }
        if (close < open) {
            generateParenthesis(s + ')', A, open, close + 1, answers);
        }
    }
}
