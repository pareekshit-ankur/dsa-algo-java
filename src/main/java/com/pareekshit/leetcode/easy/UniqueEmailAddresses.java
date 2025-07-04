package main.java.com.pareekshit.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] arr = email.split("@");
            arr[0] = arr[0].replaceAll("\\.","");
            arr[0] = arr[0].split("\\+")[0];
            if (arr[1].length()>4){
                set.add(arr[0]+"@"+arr[1]);
            }
        }
        return set.size();
    }
}
