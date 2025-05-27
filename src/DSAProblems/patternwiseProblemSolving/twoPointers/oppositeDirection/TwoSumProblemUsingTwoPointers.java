package DSAProblems.patternwiseProblemSolving.twoPointers.oppositeDirection;

import java.util.Arrays;

public class TwoSumProblemUsingTwoPointers {
    /*
     * TODO Problem statement
     *  Problem Statement: Given a sorted array of integers numbers and a target integer target,
     *  find two numbers in the array such that they add up to target. Return the 1-based indices of the two numbers.*/
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 5, 6, 7, 8, 10};
        int target = 18;
        int[] findTwoSumIndecies = findTwoSumIndecies(sortedArray, target);
        System.out.println(Arrays.toString(findTwoSumIndecies));
    }

    private static int[] findTwoSumIndecies(int[] sortedArray, int target) {
        int left = 0, right = sortedArray.length - 1;
        while (left < right){
            int currentSum = sortedArray[left] + sortedArray[right];
            if (currentSum == target){
                return new int[]{left + 1, right + 1};
            }
            if (currentSum < target){
                left++;
            }else right --;
        }
        return new int[]{};
    }
}
