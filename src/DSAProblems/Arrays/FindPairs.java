package DSAProblems.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindPairs {
    public static void main(String[] args) {
        /*given an array of integers and number k , find the pairs of numbers in the array such that the difference between them is k*/
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        System.out.println(findPairs(nums, k));
    }

    private static int findPairs(int[] nums, int k) {
        if (k < 0) {return 0;}
        Set<Integer> see = new HashSet<>();
        Set<Integer> unqiueSet = new HashSet<>();
        for (int num: nums){
            // we need to check diff it can be num - k = value or num + k = value hence two conditions
            if (see.contains(num - k)){
                unqiueSet.add(num - k);
            }
            if (see.contains(num + k)){
                unqiueSet.add(num + k);
            }
            see.add(num);
        }
        return unqiueSet.size();
    }
}
