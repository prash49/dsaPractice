package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        // find the sqauare all the nums and sort them
        int[] outputArray = findSquareAndSort(nums);
        System.out.println("sorted Sqaure array: "+ Arrays.toString(outputArray));
     }

    private static int[] findSquareAndSort(int[] nums) {
        int n = nums.length;
        //use two pointer approach
        int[] output = new int[n];
        int p1= 0;
        int p2 = n - 1;
        for (int i =  n - 1 ; i >= 0;i --){
            if (Math.abs(nums[p1]) > Math.abs(nums[p2])){
                 output[i] = nums[p1] * nums[p1];
                 p1++;
            }else {
                output[i] = nums[p2] * nums[p2];
                p2--;
            }
        }
        return output;
    }
}
