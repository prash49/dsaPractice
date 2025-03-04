package DSAProblems.LinkedList;

import java.util.List;

public class CycleInALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(25);
        head.next.next.next = head.next;
        // do not print using while loop
//        printLinkedList(head);
        System.out.println("isLoopPresent:" + findLLisLoop(head));
        System.out.println("Loop node value:" + findTheLoopNodeInALoop(head).value);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(25);
        head2.next.next.next = new ListNode(15);
        head2.next.next.next.next = new ListNode(20);
        System.out.println("middle:" + findMiddleLoop(head2).value);

        ListNode head3 = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head3.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
        if (findLLisLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }

    private static void printLinkedList(ListNode head) {
        ListNode temp = head;
//        while (temp != null){
//            System.out.print(temp.value + " ");
//            temp = temp.next;
//        }

    }

    static boolean findLLisLoop(ListNode listNode) {
        if (listNode == null || listNode.next == null) return false;
        ListNode slow = listNode;
        ListNode fast = listNode;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    static ListNode findMiddleLoop(ListNode listNode) {
        ListNode slow = listNode;
        ListNode fast = listNode;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode findTheLoopNodeInALoop(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;

    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}