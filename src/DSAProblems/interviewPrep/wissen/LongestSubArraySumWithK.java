package DSAProblems.interviewPrep.wissen;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySumWithK {
    public static void main(String[] args) {
        int[] nums = {1,4,5,6,7,2,-6,-4};
        int k= 5;
        longestSubArraySum(nums,k);
    }


    // TODO : Approach to be followed is Map and Prefix sum
    private static int longestSubArraySum(int[] nums, int k) {
        int sum = 0, maxLen = 0;
        Map<Integer,Integer> map =  new HashMap<>();
        // to do prefix sum i need to loop through the nums
        for (int i = 0; i < nums.length - 1; i++){
            //to the summation
            sum += nums[i];
            if (sum == k){
                maxLen = i + 1;
            }
            if (map.containsKey(sum - k)){
                maxLen = Math.max(maxLen , i - map.get(sum  - k));
            }
            if (!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;

    }
}
