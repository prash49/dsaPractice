package DSAProblems.Arrays;

/*Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.*/
public class MaximumsubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("max sum in array" + maxSum(nums));
    }

    static int maxSum(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
