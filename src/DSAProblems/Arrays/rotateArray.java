package DSAProblems.Arrays;

import java.util.Arrays;

public class rotateArray {

    // rotate a array by k time
    // it'll happen in 3steps
    // TODO setp 1: reverse whole array , we can use swap method here we need to reverse array from 0th index to n-1 index
    // TODO ste2: reverse a array elements till k means 0th index to k-1 index
    // todo step3 : reseverse remain elements k + 1, n -1

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int rotateCount = 3;
        rotateArrayByK(nums,rotateCount);
        System.out.println("rotatedArray"+ Arrays.toString(nums));
    }

    static void rotateArrayByK(int[] nums, int k){
        int n = nums.length;
        reverse(nums, 0, n -1);
        reverse(nums, 0, k -1);
        reverse(nums, k, n -1);

    }
    static void reverse(int[] array, int leftIndex, int rightIndex){
        while (leftIndex < rightIndex){
            int temp = array[leftIndex];
            array[ leftIndex] = array[rightIndex];
            array[rightIndex] = temp;
            leftIndex ++;
            rightIndex --;
        }
    }


}
