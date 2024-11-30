package DSAProblems.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.



Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        sortAndMergeTwoArrays(nums1, nums2, 3, 3);
        System.out.println("sortedArray" + Arrays.toString(nums1));
    }

    static void sortAndMergeTwoArrays(int[] num1, int[] nums2, int m, int n) {
        // pointers for num1, num2, and end of the merged array
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && num1[p1] > nums2[p2]) {
                num1[i] = num1[p1];
                p1 --;
            } else {
                num1[i] = nums2[p2];
                p2--;

            }
            i--;
        }
    }
}
