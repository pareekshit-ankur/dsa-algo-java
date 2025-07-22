package main.java.com.pareekshit.leetcode.easy;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for (String operation : operations) {
            if (operation.contains("++")){
                num+=1;
            }else {
                num-=1;
            }
        }
        return num;
    }
}
