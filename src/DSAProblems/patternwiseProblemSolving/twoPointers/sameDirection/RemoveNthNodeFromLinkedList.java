package DSAProblems.patternwiseProblemSolving.twoPointers.sameDirection;

import DSAProblems.practice2.ListNode;

import java.util.List;

public class RemoveNthNodeFromLinkedList {
    public static void main(String[] args) {
        /*TODO Given the head of a linked list, remove the n-th node from the end of the list and return its head.*/
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(4);
        listNode1.next.next.next = new ListNode(5);
        removeNthNodeFromLL(listNode, 3);
    }

    private static ListNode removeNthNodeFromLL(ListNode listNode, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = listNode;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
