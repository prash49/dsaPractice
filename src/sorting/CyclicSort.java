package sorting;

import java.util.Arrays;

public class CyclicSort {

    /*TODO idea behind cyclic sort is it'll run on 1.n Range array, where it'll check firstIndex value and check whether
     *  is it in correct index postion by calculating correctIndex =  index - 1 ex: 4 value index would be 4-1 = 3 as array starts from 0th index*/
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSorting(int[] arr) {
        int startInex = 0;
        while (startInex < arr.length) {
            int correctIndex = arr[startInex] - 1; // finds the values index ex: if 0th index have 5 ; 4 is its index
            if (arr[startInex] != arr[correctIndex]) { // checks its matches with correct index if not swap macha
                swap(arr, startInex, correctIndex);
            } else startInex++; // increment the index it matches
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
