package DSAProblems.interviewPrep.wissen;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubArraySumK {
    public static void main(String[] args) {

        // find maximum subarray sum by window given k
        List<Integer> array = new ArrayList<>();
        array.add(100);
        array.add(200);
        array.add(300);
        array.add(400);
        int k  = 2;
        maximumSubArraySumofSizek(array,k);
    }

    private static void maximumSubArraySumofSizek(List<Integer> array, int k) {
        // simple
        int maxSum = 0,currentSum = 0;
        //first iterate for k and consider them as max and current
        for (int i =0; i < k; i++){
            maxSum += array.get(i);
        }
        currentSum = maxSum;
        for (int i = k ; i < array.size(); i ++){
            currentSum = currentSum + array.get(i) - array.get(i - k);
            maxSum = Math.max(maxSum,currentSum);

        }
        System.out.println("maxSum:"+maxSum );
    }
}
