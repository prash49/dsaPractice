package DSAProblems.patternwiseProblemSolving.slidingwindow.variableSizeWindow;

public class MinimumSizeSubArraySum {
    /*TODO  Given an array of positive integers nums and a positive integer target, return the minimal length of a
        contiguous subarray of which the sum is greater than or equal to target. If no such subarray exists, return 0.*/
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        findMinimumSizeSubArraySum(nums, target);

    }

    private static int findMinimumSizeSubArraySum(int[] nums, int target) {
        int left = 0;
        int currentWindowSum = 0;
        int min_Length = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length - 1; right++) {
            currentWindowSum += nums[right];
            //Shrink the window as small as possible while SUM >= target
            while (currentWindowSum >= target)
                min_Length = Math.min(min_Length, right - left + 1);
            currentWindowSum -= nums[left];
            left++;
        }
        return min_Length == Integer.MAX_VALUE ? 0 : min_Length;
    }

}
}
