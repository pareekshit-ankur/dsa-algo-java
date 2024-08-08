package main.java.com.pareekshit.scaler.queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class UniqueLetter {
    public static void main(String[] args) {
        /*System.out.println(solve("abadbc"));
        System.out.println(solve("abcabc"));
        System.out.println(solve("abcdabc"));*/
        System.out.println(solve("ptp"));
        System.out.println(solve("jyhrcwuengcbnuchctluxjgtxqtfvrebveewgasluuwooupcyxwgl"));
    }

    public static String solve(String A) {
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : A.toCharArray()) {
            queue.add(c);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (!queue.isEmpty() && map.get(queue.peek()) > 1) {
                queue.remove();
            }
            if (!queue.isEmpty()) {
                sb.append(queue.peek());
            } else {
                sb.append("#");
            }
        }
        return sb.toString();
    }
}
