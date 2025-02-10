package DSAProblems.LinkedList;

public class ReverseLinkedListPractice {
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

    private static ListNode reverse(ListNode head) {
        /*TODO 1st. create a Temp node in Loop , point that to current.next
         *  then 2nd. point current.next to Prev (here Link will be reverse
         * todo 3rd. no move prev to current Position
         *  4th now point current to Temp position*/
        ListNode current = head;
        ListNode prev = null; // we will return prev node
        while (current != null){
            ListNode tempNode = current.next;
            current.next = prev;
            prev =current;
            current =tempNode;
        }
        return prev;
    }

}
