package DSAProblems.LinkedList;

import org.w3c.dom.Node;

public class DoubleLList {


    private Node head;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;

    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print("-->" + temp.value + "-->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("start");
        while (last != null) {
            System.out.print("-->" + last.value);
            last = last.previous;
        }
    }

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
