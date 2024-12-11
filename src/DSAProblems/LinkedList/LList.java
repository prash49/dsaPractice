package DSAProblems.LinkedList;

import org.w3c.dom.Node;

// implementing own singly Linked list
public class LList {
    private Node head;
    private Node tail;
    private int size;

    public LList() {
        this.size = 0;
    }

    // create a method wehre i can add firstelement
    // we know if we adding first element then Nodes next is head where head is node and tail is head and incement size
    public void insertFirstElement(int value) {
        Node node = new Node(value);
        // then i should point nodes next to head because we are adding first element
        node.next = head;
        // as we are insering first element the head also point to first element of the LinkedList
        head = node;
        // assign tail if only one single element present then tail also points to same node
        if (tail == null) {
            tail = head;
        }

        // and increase the size
        size += 1;

    }

    public void insertLastElement(int value) {
        if (tail == null) {
            insertFirstElement(value);
            return;
        }
        Node node = new Node(value);
        this.tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirstElement(value);
            return;
        } else if (index == size) {
            insertLastElement(value);
            return;
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }

    }

    // how to get node by index simple just loop through till index
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;

    }

    // remove last element
    public int deleteLastElement() {
        if (size <= 1) {
            return deleteFirst();
        }
        // find senconlast to assign as tail once tail assigned tail.next will null
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
        return tail.value;

    }

    // method delete based on index
    public int delete(int index) {
        if (index == 0) {
            // if index is 0 ofcourse we will delete first one maga
            return deleteFirst();
        }
        if (index == size - 1) {
            // if index given is last then i'll delete that macha
            return deleteLastElement();
        }
        // if inbetween i'll find prev node so i can assign prev node.next to next of next
        Node previousNode = get(index - 1);
        int value = previousNode.next.value;
        previousNode.next = previousNode.next.next;
        size--;
        return value;

    }

    // find the node which has value
    public Node find(int value) {
        // ofcourse my list start from head
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return node;

    }

    public void display() {
        // to display the all the linkedList valye we will loop and get node.next and print the value but doesnot alter the structure
        // hence we use temp nod here
        Node temp = head;
        while (temp != null) {
            System.out.print("-->" + temp.value + "-->");
            // assign temp with next node after head
            temp = temp.next;
        }
        System.out.println("end");

    }

    public int deleteFirst() {
        // deletet the first means delete the head but assign the head to next node
//        Node temp = head;
//        temp.next = head;
        // or

        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;

    }

    private class Node {
        private int value;
        private Node next;


        // created a constructor to store only value means it can act as a tail
        public Node(int value) {
            this.value = value;
        }

        // constructor to add a Linked List with value where it pointing to next
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }
}

