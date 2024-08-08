package main.java.com.pareekshit.scaler;

public class AddBinaryStrings {
    public static void main(String[] args) {
        //System.out.println(addBinary("100", "11"));
        /*System.out.println("1001110001111010101001110");
        System.out.println(addBinary("1010110111001101101000", "1000011011000000111100110"));*/
        System.out.println("1110000000010110111010101010000");
        System.out.println(addBinary("1110000000010110111010100100111", "101001"));
    }

    public static String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int n = Math.min(A.length(), B.length());
        int i = n - 1;
        int diff = Math.abs(A.length() - B.length());
        if (A.length() > B.length()) {
            while (i >= 0) {
                if (carry == 1) {
                    sb.append(A.charAt(i + diff) ^ B.charAt(i) ^ carry);
                    if (A.charAt(i + diff) == '0' && B.charAt(i) == '0') {
                        carry = 0;
                    }
                } else {
                    sb.append(A.charAt(i + diff) ^ B.charAt(i) ^ carry);
                    if (A.charAt(i + diff) == '1' && B.charAt(i) == '1') {
                        carry = 1;
                    }
                }
                i--;
            }
        } else {
            while (i >= 0) {
                if (carry == 1) {
                    sb.append(A.charAt(i) ^ B.charAt(i + diff) ^ carry);
                    if (A.charAt(i) == '0' && B.charAt(i + diff) == '0') {
                        carry = 0;
                    }
                } else {
                    sb.append(A.charAt(i) ^ B.charAt(i + diff) ^ carry);
                    if (A.charAt(i) == '1' && B.charAt(i + diff) == '1') {
                        carry = 1;
                    }
                }
                i--;
            }
        }

        if (A.length() > B.length()) {
            i = diff - 1;
            while (i >= 0) {
                if (carry == 1) {
                    sb.append(Character.getNumericValue(A.charAt(i)) ^ carry);
                    if (A.charAt(i) != '1') {
                        carry = 0;
                    }
                } else {
                    sb.append(A.charAt(i));
                }
                i--;
            }
        } else {
            i = diff - 1;
            while (i >= 0) {
                if (carry == 1) {
                    sb.append(Character.getNumericValue(B.charAt(i)) ^ carry);
                    if (B.charAt(i) != '1') {
                        carry = 0;
                    }
                } else {
                    sb.append(B.charAt(i));
                }
                i--;
            }
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
