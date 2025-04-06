package DSAProblems.interviewPrep.wissen;

import java.util.Arrays;

public class SortZeroAndOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1};
        sortArray(arr);
        for (int num : arr) System.out.print(num + " "); // Output: 0 0 1 1 1
    }

    private static void sortArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] == 0) {
                left++;
            } // count number of zeros on right side
            while (left < right && arr[right] == 1) {
                right--;
            } // count number of 1s on right
            if (left < right) { // run a loop where i can start assigning the values
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    private static int[] separateZeroOnes(int[] array) {
        int i = 0, j = 0;
        int end = array.length - 1;
        while (i <= end) {
            if (array[i] == 0) {
                swap(i, j, array);
                i++;
                j++;
            } else i++;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void moveZerosToLeft(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] == 0) {
                left++; // zero count
            }
            while (left < right && array[right] == 1) {
                right--;
            }
            // now insert those into array
            while (left < right) {
                array[left] = 0;
                array[right] = 1;
            }
        }
    }

    static void moveZerosAndOnesSeparely(int[] array) {
        int i = 0, j = 0; // j to keep track of zeros and swap
        int end = array.length - 1;
        while (i <= end) {
            if (array[i] == 0) {
                swap(i, j, array);
                i++;
                j++;
            } else {
                i++;
            }
            System.out.println(Arrays.toString(array));
        }


    }

    static void   moveZeros(int[] nums){
        int pos = 0;
        for (int i = 0; i < nums.length ; i ++){
            if (nums[i] != 0){
                nums[pos++] = nums[i];
            }
        }
        while (pos < nums.length){
            nums[pos++] = 0;
        }
    }
}

