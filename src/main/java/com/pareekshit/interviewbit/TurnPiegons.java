package main.java.com.pareekshit.interviewbit;

public class TurnPiegons {
    public static void main(String[] args) {
        System.out.println(turnPigeons("RRRRLLLLL"));
        System.out.println(turnPigeons("LLLRRRR"));
    }

    public static int turnPigeons(String A) {
        int count = 0;
        if (A.contains("L") && A.contains("R") && A.lastIndexOf("L") < A.indexOf("R")) {
            int countR = 0, countL = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == 'L') {
                    countL++;
                }
                if (A.charAt(i) == 'R') {
                    countR++;
                }
            }
            return Math.min(countL, countR);
        }
        return count;
    }
}
