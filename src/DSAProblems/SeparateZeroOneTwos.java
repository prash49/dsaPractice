package DSAProblems;

import java.util.Arrays;

public class SeparateZeroOneTwos {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 1, 2, 2, 1, 0, 0, 0, 1, 2, 1, 0};
        separateZeroOneTwo(array);
        int[] array2 = {0, 1,0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0};
        separateZeroOnes(array2);
    }

    private static int[] separateZeroOneTwo(int[] array) {

        // lets push all zero's to front and 2's to end
        int i = 0, j = 0;
        int end = array.length - 1;
        while (i <= end) {
            if (array[i] == 0) {
                // push to o to first by swap and incrementing i and j
                swap(i, j, array);
                i++;
                j++;
            } else if (array[i] == 2) {
                // pushing 2's to end
                swap(i, end, array);
                end--;
            } else i++;

        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int[] separateZeroOnes(int[] array) {
        int i = 0, j = 0;
        int end = array.length - 1;
        while (i <= end){
            if(array[i] == 0){
                swap(i,j,array);
                i++;
                j++;
            } else i++;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
