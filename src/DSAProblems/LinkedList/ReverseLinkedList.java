package DSAProblems.LinkedList;


public class ReverseLinkedList {

  // Steps in Reversing linked List
    //Start with Prev as null and Current as head and in the end return Prev when current becomes null
    /*TODO 1st. create a Temp node in Loop , point that to current.next
    *  then 2nd. point current.next to Prev (here Link will be reverse
    * todo 3rd. no move prev to current Position
    *  4th now point current to Temp position*/

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
