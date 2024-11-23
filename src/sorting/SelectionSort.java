package sorting;

import java.util.Arrays;

public class SelectionSort {

    // selection sort as name suggests it selects the max/min from array and places at respective position
    public static void main(String[] args) {

        int[] arr = {1, -90, -13, 120, 11, 10, 25};
        selectedSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectedSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int max = findMaxIndex(array, 0, last);
            swap(array, max, last);
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}

