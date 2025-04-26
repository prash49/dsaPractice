package DSAProblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class PrioriTyQueuePractice {
    public static void main(String[] args) {
        // in this elements are ordered based on their priority
        //smmalest or higest always at the top/heap
        //it used min heap internally
        //natural ordering smallest first always
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);

        System.out.println(pq);
        System.out.println(pq.poll()); // removed smalest element
        System.out.println(pq.peek()); // peeks smallest element
        PriorityQueue<Integer> revPq =new PriorityQueue<>(Collections.reverseOrder());
        revPq.add(10);
        revPq.add(20);
        revPq.add(15);
        revPq.add(5);
        System.out.println("reverse ordering operations");
        System.out.println(revPq);
        System.out.println("poll :"+ revPq.poll());
        System.out.println("peek"+ revPq.peek());

    }
}
