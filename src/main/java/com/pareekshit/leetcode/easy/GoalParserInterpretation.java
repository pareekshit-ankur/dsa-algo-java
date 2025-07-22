package main.java.com.pareekshit.leetcode.easy;

/**
 * You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
 * <p>
 * Given the string command, return the Goal Parser's interpretation of command.
 * <p>
 * Example 1:
 * <p>
 * Input: command = "G()(al)"
 * Output: "Goal"
 * Explanation: The Goal Parser interprets the command as follows:
 * G -> G
 * () -> o
 * (al) -> al
 * The final concatenated result is "Goal".
 * Example 2:
 * <p>
 * Input: command = "G()()()()(al)"
 * Output: "Gooooal"
 * Example 3:
 * <p>
 * Input: command = "(al)G(al)()()G"
 * Output: "alGalooG"
 * <p>
 * Constraints:
 * <p>
 * 1 <= command.length <= 100
 * command consists of "G", "()", and/or "(al)" in some order.
 */
public class GoalParserInterpretation {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i)=='G'){
                sb.append('G');
            }else if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append('o');
                i++;
            }else {
                i+=3;
                sb.append("al");
            }
        }
        return sb.toString();
    }
}
