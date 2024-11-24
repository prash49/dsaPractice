package DSAProblems;

class MissingNumber {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swapValue(nums, i, correctIndex);
            } else
                i++;
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    static void swapValue(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}