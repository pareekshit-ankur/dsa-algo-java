package main.java.com.pareekshit.scaler.maths;

public class SortedPermutationRank {
    public static void main(String[] args) {
        System.out.println(findRank("acb"));
        System.out.println(findRank("bac"));
        System.out.println(findRank("bca"));
        System.out.println(findRank("view"));
        System.out.println(findRank("AaBbCc"));
        System.out.println(findRank("abcABC"));
    }

    public static int findRank(String A) {
        int rank = 0, i, n = A.length();
        if (A.length() == 1) {
            return 1;
        }
        char[] charArray = A.toCharArray();
        for (i = 0; i < n - 1; i++) {
            int charLessCount = 0;
            for (int j = i + 1; j < n; j++) {
                char c = charArray[j];
                if (c < A.charAt(i)) {
                    charLessCount++;
                }
            }
            rank += (charLessCount * factorial(charArray.length - i - 1)) % 1000003;
        }
        return (rank + 1) % 1000003;
    }

    static int factorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return (number * factorial(number - 1)) % 1000003;
        }
    }
}
