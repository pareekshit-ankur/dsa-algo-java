package main.java.com.pareekshit.leetcode.easy;

import main.java.com.pareekshit.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB == null) return null;
        Set<ListNode> vis = new HashSet<>();
        ListNode curA = headA, curB = headB;
        while (curA!=null && curB!=null) {
            if(!vis.add(curA)){
                return curA;
            }
            if(!vis.add(curB)){
                return curB;
            }
            curA = curA.next;
            curB = curB.next;
        }
        while (curA!=null) {
            if(!vis.add(curA)){
                return curA;
            }
            curA = curA.next;
        }
        while (curB!=null) {
            if(!vis.add(curB)){
                return curB;
            }
            curB = curB.next;
        }
        return null;
    }
}
