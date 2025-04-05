package DSAProblems.interviewPrep.wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Findduplicates {
    public static void main(String[] args) {
        int[] array = {1,3,4,2,2};
     boolean duplicates =  findDuplicatesList(array);
        System.out.println("duplicates :"+ duplicates);

    }

    private static boolean findDuplicatesList(int[] array) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < array.length){
            if(array[i] != i){
                int correctIndex = array[i] - 1;
                if (array[i] != array[correctIndex]){
                    swapThePlace(array, i, correctIndex);
                }else {
                   return true;
                }
            }else i++;

        }
        return  false;
    }

    private static void swapThePlace(int[] array, int i, int correctIndex) {
        int temp = array [correctIndex];
        array[correctIndex] = array[i];
        array[i] = temp;
    }
}
