package DSAProblems.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 6, 7, 80, 0};
        System.out.println(" " + Arrays.toString(twoSum(nums, 80)));
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[] {};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("not found");
    }
}



