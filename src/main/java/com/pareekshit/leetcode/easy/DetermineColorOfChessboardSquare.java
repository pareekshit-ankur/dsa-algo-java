package main.java.com.pareekshit.leetcode.easy;

public class DetermineColorOfChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int row = (coordinates.charAt(0) - 'a') + 1;
        int col = Character.getNumericValue(coordinates.charAt(1));
        return row != col && (row % 2 != 0 || col % 2 != 0) && (row % 2 != 1 || col % 2 != 1);
    }
}
