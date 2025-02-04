package DSAProblems.LinkedList;

public class CycleInALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(25);
        head.next.next.next = head.next;
     // do not print using while loop
//        printLinkedList(head);
        System.out.println("isLoopPresent:" + findLLisLoop(head));

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(25);
        head2.next.next.next = new ListNode(15);
        head2.next.next.next.next = new ListNode(20);
        System.out.println("middle:" + findMiddleLoop(head2).value);
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