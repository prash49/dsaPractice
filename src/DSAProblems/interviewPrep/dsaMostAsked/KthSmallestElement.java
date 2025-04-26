package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove largest if heap size exceeds k
            }
        }
        
        return maxHeap.peek(); // Top of the heap is kth smallest
    }

    public static void main(String[] args) {
        int[] nums = {7,10,4,3,20,15};
        int k = 3;
        System.out.println("Kth Smallest: " + findKthSmallest(nums, k)); // Output: 7
    }
}