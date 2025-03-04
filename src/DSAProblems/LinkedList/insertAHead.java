package DSAProblems.LinkedList;

import java.util.Arrays;
import java.util.List;

public class insertAHead {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array
        NodeEx head = new NodeEx(arr.get(0));
        head.next = new NodeEx(arr.get(1));
        head.next.next = new NodeEx(arr.get(2));
        head.next.next.next = new NodeEx(arr.get(3));
        insertAHeadIntoNode(val, head);
    }
    public static void   insertAHeadIntoNode(int value, NodeEx head){
        NodeEx temp = new NodeEx(value,head);
    }

}
class NodeEx {
    public int data;
    public NodeEx next;

    // Constructor with both data and next node
    public NodeEx(int data1, NodeEx next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data (assuming next is initially null)
    public NodeEx(int data1) {
        data = data1;
        next = null;
    }
}
