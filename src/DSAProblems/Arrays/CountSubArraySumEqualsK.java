package DSAProblems.Arrays;

public class CountSubArraySumEqualsK {
    /*Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.

    A subarray is a contiguous non-empty sequence of elements within an array.*/

    /*Example:
    * Input Format:
 N = 4, array[] = {3, 1, 2, 4}, k = 6
Result:2
Explanation:  The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
    * */
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
        int cnt2 = findAllSubarraysWithGivenSumBetterSol(arr, k);
        System.out.println("The number of subarrays is better solution: " + cnt2);
    }

    //Brute force
    private static int findAllSubarraysWithGivenSum(int[] arr, int target) {
        // so to find the sum of subArray we need to run out loops
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            // j stat from i because we already checked sum for before vale]ues
            for (int j = i ;j < arr.length; j++){
                int sum = 0;
                // now sum the values from i to j subArray
                for (int k = i; k <= j; k++){
                    sum +=  arr[k];
                    System.out.println("sum :: {}"+ sum);
                }
                if (sum == target){
                    System.out.println("count:"+count);
                    count++;

                }
            }

        }
        return count;
    }
    private static int findAllSubarraysWithGivenSumBetterSol(int[] arr, int target) {
        // so to find the sum of subArray we need to run out loops
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            // j stat from i because we already checked sum for before vale]ues
            int sum = 0;
            for (int j = i ;j < arr.length; j++){
                // now sum the values from i to j subArray
                    sum +=  arr[j];
                    System.out.println("sum :: {}"+ sum);

                if (sum == target){
                    System.out.println("count:"+count);
                    count++;

                }
            }

        }
        return count;
    }
}
