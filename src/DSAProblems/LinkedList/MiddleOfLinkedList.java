package DSAProblems.LinkedList;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class MiddleOfLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }

        // created a constructor to store only value means it can act as a tail
        public Node(int value) {
            this.value = value;
        }

        // constructor to add a Linked List with value where it pointing to next
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public static void main(String[] args) {

        }

    }

   /* public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.getNext() != null) {


        }

    }*/
}
