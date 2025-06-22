package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = intersectionOfTwoArray(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] intersectionOfTwoArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1){
            set.add(num);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2){
            if (set.contains(num)){
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num: resultSet){
           result[i++] = num;
        }
        return result;
    }
}
