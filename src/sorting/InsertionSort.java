package sorting;

import java.util.Arrays;

public class InsertionSort {
/*TODO insertion sort work on principal like runner the inneer loop till sorted smallest element placed in its corrects place
*  hence inner loop starts from j = i + 1 and break if not lessthan comparing element if true it swaps
* ex: in first for loop i = 0 ; j will start with j = 1 and compares with j - 1
* in second loop i  = 1 j = 2 where it'll loop till j > 0 j-- in each iteration it'll check whether arr[j] < arr[j-1]  till j >0 and j-- */
    public static void main(String[] args) {
        int[] array = {-10,343,5,7,0,1,4};
        insertionSorting(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertionSorting(int[] array){
        // first run for loop till n-1
        for (int i = 0; i < array.length -1 ; i++){
            // run second loop by starting with i + 1 because we need to place smaller elemets at the begining
            for ( int j = i + 1 ; j > 0; j --){
                // compare the j with j-1 index for smaller element
                if(array[j] < array[j -1 ]){ // if less than swap bro what u waiting for :-)
                    swap(array, j, j-1);

                }else
                    break; // break the loop
            }
        }
    }
    static  void swap(int[] arr, int start, int end){
        int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
    }
}
