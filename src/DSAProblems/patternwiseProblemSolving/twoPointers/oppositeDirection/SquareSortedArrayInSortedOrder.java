package DSAProblems.patternwiseProblemSolving.twoPointers.oppositeDirection;

import java.util.Arrays;

public class SquareSortedArrayInSortedOrder {
    /*TODO t: Given an integer array nums sorted in non-decreasing order,
       return an array of the squares of each number also sorted in non-decreasing order.
        Input: nums = [-4, -1, 0, 3, 10]
        Output: [0, 1, 9, 16, 100]*/
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] squaredAndSortedArray = computeSqaureAndSort(nums);
        System.out.println("result:"+ Arrays.toString(squaredAndSortedArray));
    }

    private static int[] computeSqaureAndSort(int[] nums) {
        int[] resultArray = new int[nums.length];
        // two pointer approach
        int left = 0;
        int right = nums.length - 1;
        int resultIndex = nums.length - 1;
        while (left <= right) {
            int leftSqaure = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSqaure > rightSquare) {
                resultArray[resultIndex] = leftSqaure;
                left++;
            } else {
                resultArray[resultIndex] = rightSquare;
                right--;
            }
            resultIndex--;
        }

        return resultArray;
    }
}
