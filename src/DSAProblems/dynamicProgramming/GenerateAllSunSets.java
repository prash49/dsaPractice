package DSAProblems.dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerateAllSunSets {
    //Given an integer array nums of unique elements, return all possible subsets (the power set).
    //
    //The solution set must not contain duplicate subsets. Return the solution in any order.
    //
    //
    //
    //Example 1:
    //
    //Input: nums = [1,2,3]
    //Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

    public static void main(String[] args) {
        int[] aray = {3, 1, 2};

        List<List<Integer>> ans = new ArrayList();

        subSets(aray, 0, new ArrayList<>(), ans);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    private static void subSets(int[] arr, int index, List<Integer> currentList, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        currentList.add(arr[index]);
        subSets(arr, index + 1, currentList, result);
        currentList.remove(currentList.size() - 1);
        subSets(arr, index + 1, currentList, result);
    }
}
