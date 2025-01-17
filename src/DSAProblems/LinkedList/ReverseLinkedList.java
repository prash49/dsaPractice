package DSAProblems.LinkedList;


public class ReverseLinkedList {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null, current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head = reverse(head);

        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
