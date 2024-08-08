package main.java.com.pareekshit.hackerrank.datastructures.linkedlists;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * You’re given the pointer to the head nodes of two sorted linked lists. The data in both lists will be sorted in
 * ascending order. Change the next pointers to obtain a single, merged linked list which also has data in ascending
 * order. Either head pointer given may be null meaning that the corresponding list is empty.
 * <p>
 * Input Format
 * <p>
 * You have to complete the SinglyLinkedListNode MergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB)
 * method which takes two arguments - the heads of the two sorted linked lists to merge. You should NOT read any input
 * from stdin/console.
 * <p>
 * The input is handled by the code in the editor and the format is as follows:
 * <p>
 * The first line contains an integer , denoting the number of test cases. The format for each test case is as follows:
 * <p>
 * The first line contains an integer , denoting the length of the first linked list. The next  lines contain an integer
 * each, denoting the elements of the linked list. The next line contains an integer , denoting the length of the second
 * linked list. The next  lines contain an integer each, denoting the elements of the second linked list.
 * <p>
 * Constraints
 * <p>
 * , where  is the  element of the list. Output Format
 * <p>
 * Change the next pointer of individual nodes so that nodes from both lists are merged into a single list. Then return
 * the head of this merged list. Do NOT print anything to stdout/console.
 * <p>
 * The output is handled by the editor and the format is as follows:
 * <p>
 * For each test case, print in a new line, the linked list after merging them separated by spaces.
 * <p>
 * Sample Input
 * <p>
 * 1 3 1 2 3 2 3 4 Sample Output
 * <p>
 * 1 2 3 3 4 Explanation
 * <p>
 * The first linked list is: 1 -> 2 -> 3 -> NULL
 * <p>
 * The second linked list is: 3 -> 4 -> NULL
 * <p>
 * Hence, the merged linked list is: 1 -> 2 -> 3 -> 3 -> 4 -> NULL
 */

public class MergeTwoSortedLinkedLists {

    private static final Scanner scanner = new Scanner(System.in);

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode mergedList = null;
        if (Objects.isNull(head1)) {
            mergedList = head2;
        } else if (Objects.isNull(head2)) {
            mergedList = head1;
        } else {
            SinglyLinkedListNode head1Counter = head1;
            SinglyLinkedListNode head2Counter = head2;
            SinglyLinkedListNode mergeCounter = mergedList;
            while (head1Counter != null && head2Counter != null) {
                if (head1Counter.data <= head2Counter.data) {
                    if (mergedList == null) {
                        mergedList = head1Counter;
                        mergeCounter = mergedList;
                    } else {
                        mergeCounter = addToMergedList(mergeCounter, head1Counter);
                    }
                    head1Counter = head1Counter.next;
                } else {
                    if (mergedList == null) {
                        mergedList = head2Counter;
                        mergeCounter = mergedList;
                    } else {
                        mergeCounter = addToMergedList(mergeCounter, head2Counter);
                    }
                    head2Counter = head2Counter.next;
                }
            }
            if (head1Counter != null) {
                addToMergedList(mergeCounter, head1Counter);
            } else {
                addToMergedList(mergeCounter, head2Counter);
            }
        }
        return mergedList;

    }

    private static SinglyLinkedListNode addToMergedList(SinglyLinkedListNode mergeCounter, SinglyLinkedListNode headCounter) {
        mergeCounter.next = headCounter;
        mergeCounter = mergeCounter.next;
        return mergeCounter;
    }

    // Complete the mergeLists function below.

    public static void main(String[] args) throws IOException {
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3);
        }

        scanner.close();
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
}