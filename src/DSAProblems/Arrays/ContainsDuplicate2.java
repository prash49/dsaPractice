package DSAProblems.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,1, 4};
        isArrayContainsDuplicate(nums);
    }

    private static void isArrayContainsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
      for (int num : nums){
          if (!set.add(num)){
              System.out.println(" duplicate found");
          }else System.out.println("duplicate not found");
      }
    }
}
