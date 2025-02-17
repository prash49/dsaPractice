package DSAProblems.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MergeKSortedLists {
    // solve first by brute force
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(5);
        listNode1.next.next = new ListNode(8);
        ListNode listNode2 = new ListNode(1);
        listNode2.next =  new ListNode(2);
        listNode2.next.next = new ListNode(6);
        ListNode listNode3 = new ListNode(5);
        listNode3.next = new ListNode(6);
        listNode3.next.next = new ListNode(10);
        listNode3.next.next.next  = new ListNode(11);
        //like below or
        ListNode[] listNodes = {listNode1,listNode2,listNode3};
        // directly use new Keyword
        ListNode listNode = mergeKListByBrute( new ListNode[] {listNode1,listNode2,listNode3});
        printLinkedList(listNode);
    }
// Applying brute force. first adding val into a array list then using Collections.sort sort the list then convert back
    private static ListNode mergeKListByBrute(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode temp = head;
        List<Integer> integerList = new ArrayList<>();
        // adding data into a arraylist
        for (ListNode listNode : lists) {
            while (listNode != null) {
                integerList.add(listNode.value);
                listNode = listNode.next;
            }
        }
        Collections.sort(integerList);
        // now create new list out of integers
        for (int val : integerList) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return head.next;
    }

    private static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
