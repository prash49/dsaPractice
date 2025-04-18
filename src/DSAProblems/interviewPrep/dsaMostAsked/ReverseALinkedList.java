package DSAProblems.interviewPrep.dsaMostAsked;

public class ReverseALinkedList {
    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        ListNode2 reversedNode = reverseALinkedList(head);
        while (reversedNode != null) {
            System.out.println("value :" + reversedNode.value);
            reversedNode = reversedNode.next;
        }
    }

    static ListNode2 reverseALinkedList(ListNode2 head) {
        ListNode2 prev = null, current = head;

        while (current != null) {
            ListNode2 temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;

        }
        return prev;
    }
}

class ListNode2 {
    int value;
    ListNode2 next;

    ListNode2(int value) {
        this.value = value;
    }
}
