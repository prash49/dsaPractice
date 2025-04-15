package DSAProblems.interviewPrep.wissen;

import java.util.Arrays;

public class PairWithTargetSum {
    public static void main(String[] args) {
        /*
        * todo Given a sorted array and a target sum, find two numbers that add up to the target.
        * */
        int[] array = {1,2,3,4,5,6,7,8,9};
        int targetSum = 13;
        hasTwoSum(array,targetSum);
    }

static  boolean  hasTwoSum(int[] nums, int target) {
        Arrays.sort(nums); // only if not already sorted
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }
        return false;
    }
}
