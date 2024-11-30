package DSAProblems.Arrays;

import java.util.HashSet;
import java.util.Set;

/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true*/
public class ContainsDuplicate1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsDuplicateBasedonKelement(nums, k));
    }

    // problem statement check if the array contains a duplicate number between k index
// ex : if i have 1 at 0 index and 1 at 2 index the value abs(0 - 2) = 2 which 2 < 3 (k) so give as true
    // for this use techinique called sliding window where i'll create a window with k indicies and move 1+ untill i find solution
    public static boolean containsDuplicateBasedonKelement(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]); // into set i'll keep on adding till the k index ex : if k  = 3 the set of size will be 3 once
            // and i'll keep checking for the value will there in set or not if not there i'll add
            // if my set becomes more than size mention i need to remove the element which added in the first index so  i use  set.remove(nums[i - k])

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
