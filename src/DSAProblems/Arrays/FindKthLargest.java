package DSAProblems.Arrays;

import java.util.PriorityQueue;

public class FindKthLargest {
    public static void main(String[] args) {
        //using priority queue find the kth largest
        int[] arr = {3, 2, 1, 5, 6, 4};
        System.out.println("Kth Largest: " + findKthLargest(arr, 2));
    }

    private static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //loop and add data into the heap
        for (int num : arr){
            minHeap.add(num);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
