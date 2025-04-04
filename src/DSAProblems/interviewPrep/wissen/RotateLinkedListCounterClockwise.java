package DSAProblems.interviewPrep.wissen;

public class RotateLinkedListCounterClockwise {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        int numberOfTime = 2;

        printListNode(head);
       ListNode newHead = rotateCounterClockWise(head, numberOfTime);
        System.out.println("------------------------------------------");
        printListNode(newHead);


    }

    private static ListNode rotateCounterClockWise(ListNode head, int k) {
        if (head == null && head.next == null && k == 0) {
            return head;
        }
        int length = 1;
        ListNode currentNode = head;
        // find the count of list
        while (currentNode.next != null) {
            currentNode = currentNode.next; // we are assigning because we can make this curcular by assign head to cur.next
            length++;
        }
        System.out.println("length :"+ length);
        currentNode.next = head; // making curcular by assiging current.next with head
        k = k % length; // normalize to not overturn ex: 2 % length = 2 % 5 = 2
        System.out.println("k :"+ k);
        int stepsToNewHead = length - k;
        System.out.println("steps to new Head "+ stepsToNewHead);
        currentNode = head; // reset head to ready for rotation
        // loop through the currentNode and rotate till stepsTonewHead
        for (int i = 0; i < stepsToNewHead - 1; i++) {
            currentNode = currentNode.next;
        }
        ListNode newHead = currentNode.next;
        currentNode.next = null;
        return newHead;

    }

    private static void printListNode(ListNode head) {
        if (head != null && head.next != null) {
            ListNode tempNode = head;
            while (tempNode != null) {
                System.out.println("value:" + tempNode.val);
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("head is null or next is null");
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
