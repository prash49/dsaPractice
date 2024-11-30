package DSAProblems.Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 5, 7, 9};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    // above has o(n2) due to two loops: need to
    public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new WeakHashMap<>(15);
        for(int i = 0; i < nums.length; i ++){
//            Integer indexVal = map.get(nums[1]);
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            }
            map.put(  nums[i], i);
        }
        return  nums;
    }
}
