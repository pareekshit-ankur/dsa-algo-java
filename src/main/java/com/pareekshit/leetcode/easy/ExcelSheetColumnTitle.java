package main.java.com.pareekshit.leetcode.easy;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
        System.out.println(convertToTitle(78));
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(26));
    }
    public static String convertToTitle(int columnNumber) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder sb = new StringBuilder();
        while(columnNumber>26){
            int mod = columnNumber%26;
            if (mod == 0){
                sb.append(chars[25]);
            }else {
                sb.append(chars[mod-1]);
            }
            columnNumber = columnNumber/26;
            if (mod == 0){
                columnNumber-=1;
            }
        }
        sb.append(chars[columnNumber-1]);
        return sb.reverse().toString();
    }
}
