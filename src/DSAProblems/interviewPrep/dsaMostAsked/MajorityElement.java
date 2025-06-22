package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3, 3};
        System.out.println("Majority Element: " + findMajority(nums));
    }

    private static int findMajority(int[] nums) {
        Map<Integer, Integer> freq =new HashMap<>();
        int n = nums.length;
        for (int num: nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
            if (freq.get(num) > n /2){
                return num;
            }
        }
        return -1;
    }
}
