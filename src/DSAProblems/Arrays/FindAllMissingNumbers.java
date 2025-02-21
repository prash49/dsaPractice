package DSAProblems.Arrays;

import java.util.*;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3};
        System.out.println(missingNumber(arr));
        System.out.println("missing numberss:"+missingNumber2(arr));
    }

    private static List<Integer> missingNumber2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        Set<Integer> set = new HashSet<>();
        while (i < arr.length) {
            set.add(arr[i]);
            i++;
        }
        for (int j = 1; j < arr.length ; j++){
            if(!set.contains(j)){
                list.add(j);
            }
        }
        System.out.println("list:"+ list);
        return list;
    }

    public static List<Integer> missingNumber(int[] nums) {

        int i = 1;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swapValue(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        System.out.println("sorted list:" + Arrays.toString(nums));
        List<Integer> list = new ArrayList<>();
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != index) {
                System.out.println("index value which is missing :" + index);
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
