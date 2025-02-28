package DSAProblems.Arrays;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(array, k);
        System.out.println("The length of the longest subarray is: " + len);

    }

    private static int getLongestSubarray(int[] array, long k) {
        // need to loop thrugh the Array and sum
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }
            long remaing = sum - k;
            if (preSumMap.containsKey(remaing)){
                int len = i - preSumMap.get(remaing);
                maxLen = Math.max(maxLen,len);
            }
            if(!preSumMap.containsKey(remaing)){
                preSumMap.put(sum, i);
            }
        }
        return maxLen;

    }
}
