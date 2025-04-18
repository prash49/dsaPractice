package DSAProblems.interviewPrep.sortingAndSearchPractice;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 62, 5, 6, 3, 6};
         bubbleSort(array);
        System.out.println("sorted array : " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // optimization
        }
    }
}
