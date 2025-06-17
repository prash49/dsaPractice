package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {


    public static void main(String[] args) {
        // so the array given and the target given if sum equals then i need to take count of it
        int[] nums = {1, 1, 1};
        int k = 2;
        //from above we know 0,1 index sum is 2 and 1,2 index sum2 so first write bruteforce approach
        System.out.println("bruteForce: " + subArraySumKBruteForce(nums, k));
        // optimal using preFix sum
        System.out.println("prefix sum: " + subArraySumPrefixMethod(nums, k));
    }

    private static int subArraySumKBruteForce(int[] nums, int k) {
        int count = 0;
        //naive approach will be looping through each one and looping again within loop and find the sum and compare
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int subArraySumPrefixMethod(int[] nums, int k) {
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1); // base
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            if (prefixSumFreq.containsKey(sum - k)) {
                count += prefixSumFreq.get(sum - k);
            }
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
