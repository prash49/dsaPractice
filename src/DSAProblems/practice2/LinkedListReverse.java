package DSAProblems.practice2;

import java.util.List;

public class LinkedListReverse {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        printListNode(listNode);
     ListNode rev =   reverseALinkedListPractice(listNode);
        System.out.println("-----------------------");
        printListNode(rev);

    }

    private static ListNode reverseALinkedListPractice(ListNode listNode) {
        ListNode current = listNode;
        ListNode prev = null;
        while (current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev =current;
            current = temp;
        }
        return prev;
    }

    private static void printListNode(ListNode listNode) {
        ListNode temp = listNode;
        while (temp !=null){
            System.out.print( temp.value+ "-->");
            temp = temp.next;
        }
    }
}
