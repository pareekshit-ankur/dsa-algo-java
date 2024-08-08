package main.java.com.pareekshit.scaler;

public class ReverseTheString {
    public static void main(String[] args) {
        System.out.println(solve("the sky is blue"));
        System.out.println(solve("this is ib"));
        System.out.println(solve("bwroafq rfmy eimspekey w wnzjh qisjiabv ya hncn mazvb pfwlcsnkqz muiapt nnvwwx rp bsypbqu ymg bjwapykfil"));
    }

    public static String solve(String A) {
        int prevIndex = A.length();
        char prevChar = A.charAt(A.length() - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = A.length() - 2; i >= 0; i--) {
            if (A.charAt(i) == ' ' && prevChar != ' ') {
                sb.append(A.substring(i, prevIndex).trim());
                sb.append(' ');
            } else if (A.charAt(i) != ' ' && prevChar == ' ') {
                prevIndex = i + 1;
            }
            prevChar = A.charAt(i);
            if (i == 0 && A.charAt(0) != ' ') {
                sb.append(A.substring(0, prevIndex).trim());
            }
        }

        return sb.toString().trim();
    }

    public String longestCommonPrefix(String[] A) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length && i < A[j].length(); j++) {
                if (A[0].charAt(i) != A[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(A[0].charAt(i));
        }
        return sb.toString();
    }
}
