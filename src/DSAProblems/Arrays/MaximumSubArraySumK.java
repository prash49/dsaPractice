package DSAProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubArraySumK {

    public static void main(String[] args) {
      int    k = 2; // consider this as window size
      List<Integer> array = new ArrayList<>();
      array.add(100);
      array.add(200);
      array.add(300);
      array.add(400);
        System.out.println(maximumSumSubarray(k, (ArrayList<Integer>) array, array.size()));
    }
    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        int maxSum = 0;
        int currentSum = 0;
        int startIndex = 0;

        // Calculate the sum of the first window of size k
        for (int i = 0; i < K; i++) {
            maxSum += Arr.get(i);
        }
        currentSum = maxSum;

        // Slide the window and update maxSum
        for (int i = K; i < N; i++) {
            currentSum = currentSum + Arr.get(i) - Arr.get(i - K);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = i - K + 1;
            }
        }
        return maxSum;
    }
}
