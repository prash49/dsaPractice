package DSAProblems.practice2;

import java.util.Arrays;

public class MoveZerosToRightEnd {
    public static void main(String[] args) {
        int[] nums = {1,2,0,3,0,4};
        moveZerosToRight(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZerosToRight(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while (left < right){
            if (nums[left] == 0){
                swapZerosPos(nums,left,right);
                right--;
            }
            left++;
        }
    }

    private static void swapZerosPos(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
