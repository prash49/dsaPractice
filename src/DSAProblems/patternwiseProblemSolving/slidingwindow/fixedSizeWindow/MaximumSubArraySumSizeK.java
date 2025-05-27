package DSAProblems.patternwiseProblemSolving.slidingwindow.fixedSizeWindow;

public class MaximumSubArraySumSizeK {
    /*TODO  Given an array of integers nums and an integer k,
        find the maximum sum of any contiguous subarray of size k.*/

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int maxSum = findMaximumSubArraySumSizeK(array, k);
        System.out.println("max sum:" + maxSum);
    }

    private static int findMaximumSubArraySumSizeK(int[] array, int k) {
        int currentSum = 0, maxSum = 0;
        for (int left = 0; left < k; left++) {
            System.out.println(left);
            currentSum += array[left];
        }
        maxSum = currentSum;
        System.out.println(maxSum);

        for (int right = k; right <= array.length - 1; right++) {
            System.out.println("inside second loop" + right);
            System.out.println("window shrinking:" + (right - k));
            currentSum = currentSum +  array[right] - array[right - k];
            System.out.println("current sum :" + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
