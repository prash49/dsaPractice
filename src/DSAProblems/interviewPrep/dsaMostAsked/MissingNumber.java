package DSAProblems.interviewPrep.dsaMostAsked;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums)); // Output: 2
    }

    private static int findMissingNumber(int[] nums) {
        int expectedSum  = nums.length + (nums.length + 1 / 2);
        //find actual sum
        int actualSum = 0;
        for (int num: nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
