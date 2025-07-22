package main.java.com.pareekshit.leetcode.easy;

/**
 * You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:
 * <p>
 * The first ten characters consist of the phone number of passengers.
 * The next character denotes the gender of the person.
 * The following two characters are used to indicate the age of the person.
 * The last two characters determine the seat allotted to that person.
 * Return the number of passengers who are strictly more than 60 years old.
 * <p>
 * Example 1:
 * <p>
 * Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
 * Output: 2
 * Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
 */
public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int count = 0;
        /*for (String detail : details) {
            int age = Integer.parseInt(String.valueOf(Character.getNumericValue(detail.charAt(11))) + Character.getNumericValue(detail.charAt(12)));
            if (age > 60) {
                count++;
            }
        }*/
        for (String str : details) {
            char left = str.charAt(11);
            char right = str.charAt(12);

            if (left > '6' || (left == '6' && right > '0')) {
                count++;
            }
        }
        return count;
    }
}
