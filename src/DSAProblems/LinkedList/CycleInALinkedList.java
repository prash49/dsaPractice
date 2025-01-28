package DSAProblems.LinkedList;

public class CycleInALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        System.out.println("isLoopPresent:" + findLLisLoop(head));
        System.out.println("isLoopPresent:" + findLLisLoop(head));
    }

    static boolean findLLisLoop(ListNode listNode) {
        if (listNode == null || listNode.next == null) return false;
        ListNode slow = listNode;
        ListNode fast = listNode;

        while (fast != null && fast.next != null ) {
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
        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
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