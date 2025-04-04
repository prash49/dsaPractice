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
        rotateCounterClockWise(head, numberOfTime);

    }

    private static ListNode rotateCounterClockWise(ListNode head, int k) {
        if (head == null && head.next == null && k == 0) {
            return head;
        }
        int length = 1;
        ListNode currentNode = head;
        // find the count of list
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            length++;
        }
        currentNode.next = head;
        k = k % length;
        int stepsToNewHead = length - k;
        currentNode = head;
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
