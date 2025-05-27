package DSAProblems.patternwiseProblemSolving.twoPointers.sameDirection;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    /*TODO Problem statement
        Given a sorted array nums, remove the duplicates in-place such that each unique element appears only once.
       The relative order of the elements should be kept the same. Return the new length.*/
    public static void main(String[] args) {
        int[] sortedArray = new int[]{1,2,3,3,4,4,5,6,6,7};
        int sortedArrayLength = removeDuplicatesAndReturnModifedArray(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int removeDuplicatesAndReturnModifedArray(int[] sortedArray) {
        int write_pointer = 0;
        int read_pointer =1;
        while (read_pointer < sortedArray.length){
            if (sortedArray[write_pointer] != sortedArray[read_pointer]){
                write_pointer++;
                sortedArray[write_pointer] = sortedArray[read_pointer];
            }
            read_pointer++;
        }
        return write_pointer;
    }
}
