package main.java.com.pareekshit.scaler.stacks;

public class CheckTwoBracketExpressions {
    public static void main(String[] args) {
        System.out.println(solve("(a+b-c-d+e-f+g+h+i)","a+b-c-d+e-f+g+h+i"));
    }
    public static int solve(String A, String B) {
        StringBuilder sbA = new StringBuilder(), sbB = new StringBuilder();
        if (A.contains("(") || A.contains(")")) {
            for (char c : A.toCharArray()) {
                if (c != '(' && c != ')') {
                    sbA.append(c);
                }
            }
        }

        if (B.contains("(") || B.contains(")")) {
            for (char c : B.toCharArray()) {
                if (c != '(' && c != ')') {
                    sbB.append(c);
                }
            }
        }
        if (sbA.length() > 0 && sbB.length() > 0) {
            if (sbA.toString().compareTo(sbB.toString()) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else if (sbA.length() == 0 && sbB.length() > 0) {
            if (A.compareTo(sbB.toString()) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else if (sbA.length() > 0) {
            if (sbA.toString().compareTo(B) == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
