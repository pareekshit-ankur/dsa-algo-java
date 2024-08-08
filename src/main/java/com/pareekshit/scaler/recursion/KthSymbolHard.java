package main.java.com.pareekshit.scaler.recursion;

public class KthSymbolHard {
    public static void main(String[] args) {

        System.out.println(solve(3, 0));
        System.out.println(solveLoop(3, 0));
        System.out.println(solve(4, 4));
        System.out.println(solveLoop(4, 4));
    }

    public static int solve(int A, long B) {
        if (B == 0)
            return 0;

        //if even index return same as value at B/2 index in A-1 row
        if (B % 2 == 0)
            return solve(A - 1, B / 2);
        //if odd index return compliment of value at B/2 index in A-1 row
        return 1 - solve(A - 1, B / 2);
    }

    public static String row(int A, String s, int r) {
        if (A / 2 == r) {
            return s;
        }
        if (s.isEmpty()) {
            s = "0";
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    sb.append("01");
                } else if (c == '1') {
                    sb.append("10");
                }
            }
            s = sb.toString();
        }
        return row(A, s, r + 1);
    }

    public static int solveLoop(int A, long B) {
        StringBuilder sb = new StringBuilder();
        String prev, curr = "";
        if (A == 1) {
            sb.append(0);
            curr = "0";
            return Integer.parseInt(String.valueOf(curr.charAt(0)));
        }
        if (A == 2) {
            sb.append("01");
            curr = "01";
            return Integer.parseInt(String.valueOf(curr.charAt(0)));
        }
        curr = "01";
        for (int i = 3; i <= A; i++) {
            sb.setLength(0);
            prev = curr;
            if (i % 2 == 0) {
                curr = prev;
                sb.append(prev.substring((prev.length() / 2)));
                sb.append(prev.substring(0, prev.length() / 2));
                curr = curr.concat(sb.reverse().toString());
            } else {
                curr = prev;
                sb.append(prev);
                curr = curr.concat(sb.reverse().toString());
            }
        }
        return Integer.parseInt(String.valueOf(curr.charAt((int) B)));
    }
}
