package DSAProblems.Arrays;

import java.util.ArrayList;
import java.util.List;

/*Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]*/

public class FindAllDuplicates {

    public static void main(String[] args) {
        int[] array = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(array));
    }

    public static  List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swapValue(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(nums[index]);
            }
        }
        return list;
    }

    static void swapValue(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
