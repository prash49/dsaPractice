package DSAProblems.LinkedList;

public class ReverseALinkedListUsingRecurssion {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next = new Node(30);
        System.out.println(reverseListRecursively(head));
    }
    public static Node reverseListRecursively(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}