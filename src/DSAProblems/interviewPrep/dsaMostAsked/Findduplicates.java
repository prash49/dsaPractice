package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.*;

public class Findduplicates {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2};
//        boolean duplicates = findDuplicatesPresent(array);
//        System.out.println("duplicates :" + duplicates);
        System.out.println(Arrays.toString(    findDups(array).toArray()));

    }

    private static boolean findDuplicatesPresent(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] != i) {
                int correctIndex = array[i] - 1;
                if (array[i] != array[correctIndex]) {
                    swapThePlace(array, i, correctIndex);
                } else {
                    return true;
                }
            } else i++;
        }
        return false;
    }

    private static void swapThePlace(int[] array, int i, int correctIndex) {
        int temp = array[correctIndex];
        array[correctIndex] = array[i];
        array[i] = temp;
    }

    static boolean findDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (!set.add(array[i])) {
                return true;
            }
        }
        return false;
    }

    static List<Integer> findDups(int[] array) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
          if (array[i] != array[correctIndex]){
              swapThePlace(array, i, correctIndex);
          }else {
              i++;
          }
        }
        for (int j = 0; j < array.length ; j++){
            if (array[j] != (j + 1) ){
                duplicates.add(array[j]);
            }
        }
        return duplicates;
    }
}
