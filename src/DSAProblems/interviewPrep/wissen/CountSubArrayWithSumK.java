package DSAProblems.interviewPrep.wissen;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {1,4,5,6,7,2,-6,-4};
        int k= 5;
        countSubArrays(nums,k);
    }

    private static int countSubArrays(int[] nums, int k) {
        // here i need to find the count of sub arrays whose sum == k
        // so go with map to store data
        Map<Integer, Integer> map =  new HashMap<>();
        map.put(0,1); //base prefix sum
        int sum = 0, count =0;
        for (int num: nums){
            sum += num;
            if (map.containsKey(sum - k)){
                count+= map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum,0)  + 1);
        }
        return count;
    }
}
