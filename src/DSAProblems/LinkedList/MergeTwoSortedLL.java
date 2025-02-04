package DSAProblems.LinkedList;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        LL linkedList1 = new LL(1);
        linkedList1.next = new LL(8);
        linkedList1.next.next = new LL(11);

        LL linkedList2 = new LL(1);
        linkedList2.next = new LL(6);
        linkedList2.next.next = new LL(7);
        linkedList2.next.next = new LL(10);

        System.out.println("First LinkedList:");
        printLinkedList(linkedList1);

        System.out.println("SecondLinked List:");
        printLinkedList(linkedList2);

        LL mergedLinkedList = mergeTwoSortedLinkedList(linkedList1, linkedList2);
        System.out.println("merged linkedList");
        printLinkedList(mergedLinkedList);

    }

    private static void printLinkedList(LL head) {
        LL temp = head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    private static LL mergeTwoSortedLinkedList(LL linkedList1, LL linkedList2) {

        //storing new List into it
        LL mergedLinkedList = new LL(-1);
        // lets make a dummyNode
        LL dummy = mergedLinkedList;

        // traverse the LL till both are not null
        while (linkedList1 != null && linkedList2 != null) {

            if (linkedList1.value <= linkedList2.value) {
                dummy.next = linkedList1;
                linkedList1 = linkedList1.next;
            } else {
                dummy.next = linkedList2;
                linkedList2 = linkedList2.next;
            }
            // now move dummy node to next
            dummy = dummy.next;
        }
        // we may get one linked list is null then we need to add all other ll data into dummy
        if (linkedList1 != null) {
            dummy.next = linkedList1;
        } else {
            dummy.next = linkedList2;
        }

        return mergedLinkedList.next;
    }


}

class LL {
    int value;
    LL next;

    public LL(int value) {
        this.value = value;
        this.next = null;
    }

    public LL(LL next, int value) {
        this.next = next;
        this.value = value;
    }
}