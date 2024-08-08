package main.java.com.pareekshit.scaler.recursion;

public class KthSymbol {
    public static void main(String[] args) {

        System.out.println(solve(3, 0));
        System.out.println(solve(4, 4));
    }

    public static int solve(int A, int B) {
        String s = "";
        s = row(A, s, 0);
        return Integer.parseInt(s.substring(B, B + 1));
    }

    public static String row(int A, String s, int r) {
        if (A == r) {
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
}
