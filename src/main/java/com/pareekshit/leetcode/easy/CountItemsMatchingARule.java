package main.java.com.pareekshit.leetcode.easy;

import java.util.List;
import java.util.Objects;

/**
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
 * <p>
 * The ith item is said to match the rule if one of the following is true:
 * <p>
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 */
public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("type")) {
            for (List<String> item : items) {
                if (item.get(0).equals(ruleValue)) count++;
            }
        } else if (Objects.equals(ruleKey, "color")) {
            for (List<String> item : items) {
                if (item.get(1).equals(ruleValue)) count++;
            }
        } else {
            for (List<String> item : items) {
                if (item.get(2).equals(ruleValue)) count++;
            }
        }
        return count;
    }
}
