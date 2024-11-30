package DSAProblems.Arrays;

/*Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.*/
public class MinInRotatedSubArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println("minValInRotatedSortedArray"+ findMinValue(arr));
    }
    static int findMinValue(int[] nums){
        // using binary search to get o(logn) and because they provided sorted array
        int leftIndex =0;
        int rightindex = nums.length - 1;
        int minVal = nums[0];
        if(nums.length == 1){
            return nums[0];
        }
        while (leftIndex <= rightindex){
            if(nums[leftIndex] < nums[rightindex]){
                minVal = Math.min(minVal, nums[leftIndex]);
            }
            int mid = (leftIndex + rightindex )/2;
            minVal = Math.min(minVal, nums[mid]);
            if(nums[leftIndex] <= nums[mid]){
                leftIndex = mid + 1;
            } else {
                rightindex = mid-1;
            }
        }
        return  minVal;

    }

}
