package DSAProblems.slidingwindowProblems;

import java.util.Arrays;

public class FindFirstNegativeNumberInSubArray {
    public static void main(String[] args) {
        int[] intArray = {-8, 2, 3, -6, 10};
        int windowSize = 2;
         findAllFirstNegativeNumbersinSubArray(intArray, windowSize);
    }

    static void findAllFirstNegativeNumbersinSubArray(int[] arr, int k) {
        int[] output = new int[arr.length];
        // define a flag that will check whether the window contains negative number or not
        boolean containsNegative;
        // loop for eachsub array k
        System.out.println("i should be less than" + (arr.length - k + 1));
        for (int i = 0; i < (arr.length - k + 1); i++) {
//            System.out.println("i value at each iteration:" + i);
            containsNegative = false;
            // traverse through current window
            for (int j = 0; j < k; j++) {
//                System.out.println("j value for each iteration:" + j);
//                System.out.println("i  :" + i + " j:" + j + " arr[i+j]" + arr[i + j]);
                if (arr[i + j] < 0) {
//                    output[i + j] = arr[i + j];
                    System.out.print(arr[i + j]);
                    break;
                }
            }
            if (!containsNegative) {
                System.out.print("0"+" ");
              }
        }

    }
}
