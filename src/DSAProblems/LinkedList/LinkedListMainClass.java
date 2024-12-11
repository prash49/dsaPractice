package DSAProblems.LinkedList;

import org.w3c.dom.Node;

// implementing a Linked list
public class LinkedListMainClass {
    public static void main(String[] args) {
     /*   LList linkeList = new LList();
        linkeList.insertFirstElement(2);
        linkeList.insertFirstElement(10);
        linkeList.insertFirstElement(8);
        linkeList.insertFirstElement(4);
        linkeList.insertLastElement(100);
        linkeList.insert(10000, 1);
        linkeList.display();
        linkeList.deleteFirst();
        linkeList.display();
        linkeList.deleteLastElement();
        linkeList.display();
        linkeList.delete(0);
        linkeList.display();*/

        DoubleLList doubleLList = new DoubleLList();
        doubleLList.insertFirst(100);
        doubleLList.insertFirst(200);
        doubleLList.insertFirst(300);
        doubleLList.display();

    }
}
