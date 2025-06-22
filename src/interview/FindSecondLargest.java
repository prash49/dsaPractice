package interview;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(nums);
        System.out.println("Second largest element: " + secondLargest);
    }

    private static int findSecondLargest(int[] nums) {
        //edge case handling
        if (nums.length < 2) {
            return -1;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first){
                second = first;
                first = nums[i];
            } else if (nums[i] > second && nums[i] != first) {
                second = nums[i];
            }
        }
        return second;
    }
}
