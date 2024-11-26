package DSAProblems;

/*TODO Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3*/
class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) { // looping till last
            if (nums[i] != i - 1) { // checking whether the value is matching with the index if not eqaul get in
                int correctIndex = nums[i]; // assigning the index value to compare with value in the number array with looping index
                if (nums[i] != nums[correctIndex]) { //checking if value in correct index not matches with correctIndex if no swap maga
                    swapValue(nums, i, correctIndex);
                } else
                    return nums[i]; // if i found i the value in ith index and correct index which means i the value is repeated hence return
            } else i++;
        }
        return -1;
    }

    static void swapValue(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}