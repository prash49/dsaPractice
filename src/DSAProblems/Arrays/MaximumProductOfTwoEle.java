package DSAProblems.Arrays;

import java.util.Arrays;

/*Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).


Example 1:

Input: nums = [3,4,5,2]
Output: 12
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.*/
public class MaximumProductOfTwoEle {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println("product of Max two number in sorted array is"+ findProductOfMaxTwoEle(arr));
    }
    static int findProductOfMaxTwoEle(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int firstMax = nums[nums.length -1];
        System.out.println(firstMax);
        int secondMax = nums[nums.length - 2];
        System.out.println(secondMax);
        int product = (firstMax - 1) * (secondMax -1) ;
        System.out.println("product"+ product);
        return product;
    }
}
