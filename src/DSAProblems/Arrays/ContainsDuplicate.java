package DSAProblems.Arrays;

import java.util.HashSet;
import java.util.Set;

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.*/
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {13, 12, 14, 45, 85, 56, 2, 5, 250};
        System.out.println(isDuplicatesPresent(arr));
        System.out.println(isDuplicatePresentInArray(arr));
    }

    // brute force
    static boolean isDuplicatesPresent(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("index i:" + i);
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("index J value:" + j);
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // optimal solution using hashset

    static boolean isDuplicatePresentInArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;


    }
}

