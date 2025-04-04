package DSAProblems.LinkedList;


import java.util.List;
import java.util.ListResourceBundle;

public class ReverseLinkedList {

  // Steps in Reversing linked List
    //Start with Prev as null and Current as head and in the end return Prev when current becomes null
    /*TODO 1st. create a Temp node in Loop , point from a current.next
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

//        head = reverse(head);

        head = reversePractice(head);

        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

   static ListNode reversePractice(ListNode head){

        //Step1 create a current node and prev
        ListNode prev= null, current = head;

        while (current != null){
            // create  aTemp node
            ListNode temp = current.next;
            //now point this current.next to null
            current.next = prev;
            //now point ur pre to current
            prev =current;
            // move the current to next
            current = temp;
        }
        return prev;


    }
}
