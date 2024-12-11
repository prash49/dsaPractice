package DSAProblems.slidingwindowProblems;

/*You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.



Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75*/
public class MaximumAvgSubArray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;// window size
        System.out.println("maximumAvg of subArray" + findMaxAvgOfSubArray(nums, k));
        System.out.println("maximumAvg of subArray" + findMaxAvg(nums, k));
    }

    static double findMaxAvgOfSubArray(int[] nums, int k) {

        // as we got to know by problem statement its a Sliding window problem
        int max = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        int end = nums.length;
        // loop till j reaches max length means last window approached
        while (j < end) {
            // as they given k as 4 first we need to add all the values into sum; once it reaches 4 we need to skip that
            sum += nums[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) { // when our window becomes same as provided window size do the operation
                max = Math.max(max, sum);
                sum -= nums[i]; // remove left most element from the Window to add another element to window
                i++;
                j++;
            }
        }
        System.out.println("max:"+ max);
        return (double) max / k;

    }

    static double findMaxAvg(int[] nums, int k) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return (double) maxSum / k;
    }

}
