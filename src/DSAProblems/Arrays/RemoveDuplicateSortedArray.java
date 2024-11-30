package DSAProblems.Arrays;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicateFromSortedArray(nums));
    }

    static int removeDuplicateFromSortedArray(int[] nums) {
        // using two pointers and sliding window
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            // we skip to next index if we see a duplicate element
            if (nums[i - 1] != nums[i]) {
                // storing the unique element at insertIndex and increase by 1
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;

    }
}
