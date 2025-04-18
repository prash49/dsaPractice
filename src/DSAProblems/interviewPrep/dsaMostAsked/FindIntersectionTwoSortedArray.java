package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionTwoSortedArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5};
        int[] array2 = {2, 3, 5, 6};
        List<Integer> intersectionList = findIntersectionOfSortedArray(array1, array2);
        System.out.println(Arrays.toString(intersectionList.toArray()));

    }

    private static List<Integer> findIntersectionOfSortedArray(int[] array1, int[] array2) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0,j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                intersection.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return intersection;
    }
}
