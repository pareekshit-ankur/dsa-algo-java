package main.java.com.pareekshit.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        //String[][] input = new String[][]{{".", ".", ".", ".", "5", ".", ".", "1", "."}, {".", "4", ".", "3", ".", ".", ".", ".", "."}, {".", ".", ".", ".", ".", "3", ".", ".", "1"}, {"8", ".", ".", ".", ".", ".", ".", "2", "."}, {".", ".", "2", ".", "7", ".", ".", ".", "."}, {".", "1", "5", ".", ".", ".", ".", ".", "."}, {".", ".", ".", ".", ".", "2", ".", ".", "."}, {".", "2", ".", "9", ".", ".", ".", ".", "."}, {".", ".", "4", ".", ".", ".", ".", ".", "."}};
        String[][] input = new String[][]{{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        for (String[] i : input) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        char[][] board = new char[9][9];
        for (int i = 0; i < input.length; i++) {
            char[] arr = new char[input[i].length];
            for (int j = 0; j < input[i].length; j++) {
                arr[j] = input[i][j].toCharArray()[0];
            }
            board[i] = arr;
        }
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> chars = new HashSet<>();
        if (!validateRows(board, chars)) {
            return false;
        }
        if (!validateColumns(board, chars)) {
            return false;
        }
        return validateSubBoxes(board, chars);
    }

    private static boolean validateRows(char[][] board, Set<Character> chars) {
        for (char[] value : board) {
            for (char c : value) {
                if (Character.isDigit(c) && !chars.add(c)) {
                    return false;
                }
            }
            chars.clear();
        }
        return true;
    }

    private static boolean validateColumns(char[][] board, Set<Character> chars) {
        for (int i = 0; i < board[0].length; i++) {
            for (char[] value : board) {
                if (Character.isDigit(value[i]) && !chars.add(value[i])) {
                    return false;
                }
            }
            chars.clear();
        }
        return true;
    }

    private static boolean validateSubBoxes(char[][] board, Set<Character> chars) {
        for (int i = 0; i < board.length; i += 3) {
            if (!validateSubBox(board, chars, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validateSubBox(char[][] board, Set<Character> chars, int i) {
        int j;
        int index = 0;
        while (i < i + 3) {
            while (index < board.length) {
                for (j = index; j < index + 3; j++) {
                    if (Character.isDigit(board[i][j]) && !chars.add(board[i][j])) {
                        return false;
                    }
                }
                index += 3;
            }
            i++;
            index = 0;
            chars.clear();
        }
        return true;
    }
}
