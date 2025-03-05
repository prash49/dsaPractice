package DSAProblems.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
       int sortedArray[]  = mergeTwoSortedArray(arr1,arr2);
        System.out.println("Sorted array:"+ Arrays.toString(sortedArray));

    }

    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int array1Length = arr1.length;
        int array2Length = arr2.length;
        int[] sortedArray = new int[array1Length + array2Length];
        int i=0,j=0,k=0;
        while (i < array1Length && j < array2Length){
            if (arr1[i] < arr2[j]){
                sortedArray[k++] = arr1[i++];
            }else {
                sortedArray[k++] = arr2[j++];
            }
        }
        while (i < array1Length){
            sortedArray[k++] = arr1[i++];
        }
        while (j < array2Length){
            sortedArray[k++] = arr2[j++];
        }
        return sortedArray;
    }
}
