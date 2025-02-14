package DSAProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3};
        System.out.println(missingNumber(arr));
    }

    public static  List<Integer> missingNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swapValue(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println("sorted list:"+ Arrays.toString(nums));
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                System.out.println("index value which is missing :"+ index);
                list.add(index);
            }
        }
        return list;
    }

    private static void swapValue(int[] nums, int i, int correctIndex) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[i];
        nums[i] = temp;
    }
}
