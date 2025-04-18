package DSAProblems.interviewPrep.mostAsked;

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

    /*
    * TODO
    *  Kadanes rule: at each index decide to whether
    * continue with subArray
    * start fresh from current element
    * */
    private static int findMax(int[] array){
        int maxSum = array[0];
        int currentSum = array[0];
        //now loop from 1 because u added 0 to max sum already
        for (int i=1; i < array.length; i++){
            currentSum = Math.max(currentSum + array[i], array[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
