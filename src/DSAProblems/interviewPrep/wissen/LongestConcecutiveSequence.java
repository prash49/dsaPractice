package DSAProblems.interviewPrep.wissen;

import java.util.HashSet;
import java.util.Set;

public class LongestConcecutiveSequence {
    public static void main(String[] args) {
        int[] nums ={ 0,1,2,5,6,7,8,0,3,4};
        //oupput should be 9

        findLongestConcecutive(nums);
    }

    private static int findLongestConcecutive(int[] nums) {
        // brute force is to sort loop and check the nums so it'll be o(n log n)
        // optimal would be using hashSet
        Set<Integer> hashSet = new HashSet<>();
        int maxLen = 0;
      for (int num : nums){
          hashSet.add(num);
      }
      // o(1) look up
        for (int num : hashSet){
            if(!hashSet.contains(num - 1)){
                int currentNum = num;
                int currentLength = 1;
                while (hashSet.contains(currentNum + 1)){
                    currentLength++;
                    currentNum++;
                }
                maxLen = Math.max(maxLen, currentLength);
            }
        }
    }
}
