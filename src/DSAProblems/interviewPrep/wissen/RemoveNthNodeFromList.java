package DSAProblems.interviewPrep.wissen;

public class RemoveNthNodeFromList {
    public static void main(String[] args) {
        ListNode  listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        int n =2;
        // meaning that 4th node is to remove
        removeNthFromLast(listNode, n);
    }

    private static ListNode removeNthFromLast(ListNode listNode, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = listNode;
        ListNode slow = dummy;
        ListNode fast = dummy;
        // move the fast pointers to n step ahead.
        for (int i = 0; i < n ; i++){
            fast = fast.next;
        }
        // move both pointers until fast becomes null
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        // now the slow is before the nth node need to skip the nth node
        slow.next = slow.next.next;
         return dummy.next;
    }

}
