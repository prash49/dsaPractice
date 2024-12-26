package DSAProblems.Arrays;


/*TODO Given a number x and an array of integers arr, find the smallest
   subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.*/

public class SmallestSubArrayWithSumGtX {
    public static void main(String[] args) {
        int x = 51;
        int arr[] = {1, 4, 45, 6, 0, 19};
        System.out.println("smallest subarray length:" + smallestSubArray(arr, x));
    }

    static int smallestSubArray(int[] arr, int x) {
        int length = arr.length;
        int currentSum = 0;
        int minLength = length + 1;
        int start = 0;
        int end = 0;

        while (end < length) {

            while (currentSum <= x && end < length) {
                currentSum += arr[end++];
            }
            while (currentSum > x && start < length) {
                if (end - start < minLength) {
                    minLength = end - start;
                }
                currentSum -= arr[start++];
            }
        }
        if (minLength > length) return 0;
        return minLength;
    }
}
