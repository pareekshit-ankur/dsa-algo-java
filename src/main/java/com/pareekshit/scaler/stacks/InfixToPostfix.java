package main.java.com.pareekshit.scaler.stacks;

import java.util.List;
import java.util.Stack;

public class InfixToPostfix {
    List<Character> chars = List.of('+','-','/');
    public String solve(String A) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : A.toCharArray()) {
            if (Character.isAlphabetic(c)){
                sb.append(c);
            }else{
                if (stack.isEmpty()){

                }
            }
        }
        return sb.toString();
    }
}
