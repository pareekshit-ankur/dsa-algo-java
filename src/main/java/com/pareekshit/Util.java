package main.java.com.pareekshit;

import main.java.com.pareekshit.scaler.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static int MOD = 1000000007;

    public static void printArray(int[] A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] A) {
        for (int[] i : A) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print2DArrayList(ArrayList<ArrayList<Integer>> A) {
        for (List<Integer> i : A) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayList(ArrayList<Integer> A) {
        for (Integer i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printLinkedListDown(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.down;
        }
        System.out.println();
    }

}
