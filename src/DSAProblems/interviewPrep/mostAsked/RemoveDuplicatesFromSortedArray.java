package DSAProblems.interviewPrep.mostAsked;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3};
        int length = findArrayLengthWithoutDuplicates(array);
        System.out.println("unqiue values:" + Arrays.toString(array));
        System.out.println("length :" + length);
    }

    private static int findArrayLengthWithoutDuplicates(int[] array) {
        if (array.length == 0) return 0;
        int uniqueindex = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[uniqueindex] = array[i];
                uniqueindex++;
            }
        }
        return uniqueindex;
    }
}
