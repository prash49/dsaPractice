package DSAProblems.interviewPrep.wissen;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("max sum " + findMaxSum(array));
    }

    private static int findMaxSum(int[] array) {
        int maxSum = array[0];
        int currentSum = 0;
        for (int i = 1; i < array.length; i++) {
            if (currentSum < 0){
                currentSum = 0;
            }
            currentSum += array[i];
            maxSum = Math.max(maxSum,currentSum);

        }
        return maxSum;
    }
}
