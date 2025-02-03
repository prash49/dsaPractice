package DSAProblems.LinkedList;

public class MergeTwoSortedLL {


}

class LL {
    private int value;
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