package main.java.com.pareekshit.leetcode.easy;

import java.util.List;

public class SnakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int pos = 0;
        for (String command : commands) {
            switch (command) {
                case "DOWN" -> pos += n;
                case "UP" -> pos -= n;
                case "RIGHT" -> pos += 1;
                default -> pos -= 1;
            }
        }
        return pos;
    }
}
