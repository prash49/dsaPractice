package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.Arrays;

public class SortZeroAndOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1};
        moveZeros(arr);
        sortArray(arr);
        for (int num : arr) System.out.print(num + " "); // Output: 0 0 1 1 1
        int[] array = {0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0};
        separateZeroOnes(array);
        int[] nums = {0, 1, 1, 2, 1, 0, 2, 1, 0, 1, 0, 2};
        moveZerosToFrontAndTwoToLast(nums);

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
        System.out.println("separateZeros and Ones;" + Arrays.toString(array));
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
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }


    static void moveZeros(int[] nums) {
        int pos = 0; // Position to insert non-zero elements
        // First pass: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i]; // Assign non-zero element
            }
        }
        // Second pass: Fill the remaining positions with zeros
        while (pos < nums.length) {
            nums[pos++] = 0; // Assign zero to the remaining positions
        }
    }

    static void moveZerosToFrom(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
        //
    }

    static void moveZerosToFrontAndTwoToLast(int[] nums) {
        int i = 0, j = 0; // i to loop j to keep track of 0 and move to front;
        while (i < nums.length - 1) {
            if (nums[i] == 0) {
                swap(i, j, nums);
                j++;
            }
            i++;
        }
        j = nums.length - 1; //re using j to move two to end hence i should start from end to assign
        for (i = nums.length - 1; i >= 0; i--) {
            if (nums[i] ==2){
                swap(i, j,nums);
                j--;
            }
        }
        System.out.println("sorted 0,1 and 2"+ Arrays.toString(nums));


    }
}

