package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
       int[] arr = {2,3,1,5,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        // run the steps n-1 times

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            // for each step , max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than previous item
                // to comapare with previous item we took j as 1 not as 0
                if (arr[j] < arr[j - 1]) {// check if 1 st index is less than 0th index if yes swap
                    System.out.println("swapping");
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
           //using swapped to make sure to break when we have already swapped data
            if (!swapped) {
                System.out.println("not swapped");
                break;
            }
        }
    }
}
